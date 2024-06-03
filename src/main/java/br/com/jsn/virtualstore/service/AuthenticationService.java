package br.com.jsn.virtualstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jsn.virtualstore.dto.AuthenticationRequest;
import br.com.jsn.virtualstore.dto.AuthenticationResponse;
import br.com.jsn.virtualstore.dto.RegisterRequest;
import br.com.jsn.virtualstore.model.AccountModel;
import br.com.jsn.virtualstore.repository.AccountRepository;
import br.com.jsn.virtualstore.security.JWTService;

@Service
public class AuthenticationService {


    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JWTService jwtService ;
    @Autowired
    private AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request){

        AccountModel user = new AccountModel();
        user.setEmail(request.getEmail());
        user.setName(request.getName());
        user.setSenha(passwordEncoder.encode(request.getPassword()));
        accountRepository.save(user);
        String jwtToken = jwtService.generateToken(user);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setToken(jwtToken);
       
        return authenticationResponse ;
    }
    
    public AuthenticationResponse authenticate(AuthenticationRequest request){

        authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        
        AccountModel user = accountRepository.findAccountByEmail(request.getEmail());
        String jwtToken = jwtService.generateToken(user);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setToken(jwtToken);
       
        return authenticationResponse ;
    }
    



    public AccountModel buscar(String email){
        return accountRepository.findAccountByEmail(email);
    }
}
