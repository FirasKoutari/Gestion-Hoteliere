package com.example.gestion_hoteliere.repository;

import com.example.gestion_hoteliere.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
