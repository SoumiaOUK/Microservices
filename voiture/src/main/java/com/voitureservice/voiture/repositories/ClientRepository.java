package com.clientservice.clientservice.repositories;

import com.clientservice.clientservice.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
