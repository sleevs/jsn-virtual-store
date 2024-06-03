package br.com.jsn.virtualstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.jsn.virtualstore.model.AccountModel;

public interface AccountRepository  extends JpaRepository<AccountModel, Long>{


    @Query(value ="select * from account where email=?1" , nativeQuery=true)
    public AccountModel findAccountByEmail(String email);

    @Query(value ="select * from account where email=?1" , nativeQuery=true)
    public Optional<AccountModel> buscarEmailTeste(String email);
    
}
