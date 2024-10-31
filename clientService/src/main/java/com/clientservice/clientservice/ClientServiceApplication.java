package com.clientservice.clientservice;

import com.clientservice.clientservice.entities.Client;
import com.clientservice.clientservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Doe",Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "soumia",Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("3"), "rokaya",Float.parseFloat("23")));
        };
    }
}
