package com.example.gestion_hoteliere.repository;

import com.example.gestion_hoteliere.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
