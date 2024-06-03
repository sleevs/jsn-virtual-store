package br.com.jsn.virtualstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.virtualstore.dto.AuthenticationRequest;
import br.com.jsn.virtualstore.dto.AuthenticationResponse;
import br.com.jsn.virtualstore.dto.RegisterRequest;
import br.com.jsn.virtualstore.model.AccountModel;
import br.com.jsn.virtualstore.service.AuthenticationService;

@RestController
@RequestMapping("/api/v1/security")
public class SecurityController {

    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.register(request)) ;
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request)) ;
    }


    @GetMapping("/buscar/{email}")
    public ResponseEntity<AccountModel> bucar(@PathVariable String email){
        return ResponseEntity.ok(authenticationService.buscar(email)) ;
    }
}   
