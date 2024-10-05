package com.example.gestion_hoteliere.repository;

import com.example.gestion_hoteliere.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
