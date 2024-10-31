package com.clientservice.clientservice.controllers;


import com.clientservice.clientservice.entities.Client;
import com.clientservice.clientservice.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> findAll(){
        System.err.println("get all clients");
        return clientRepository.findAll();
    }

    @GetMapping("/client/{id}")
    public Client findById(@PathVariable Long id){
        return clientRepository.findById(id).orElseThrow(()->new RuntimeException("Client not found"));
    }

}
