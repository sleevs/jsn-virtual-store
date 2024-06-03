package br.com.jsn.virtualstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {


    @GetMapping
    public ResponseEntity<String> user(){
        return ResponseEntity.ok("Muniz Soares Engenharia de Software -- Virtual Store Prototype") ;
    }
    
}
