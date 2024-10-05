package com.example.gestion_hoteliere.repository;

import com.example.gestion_hoteliere.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
