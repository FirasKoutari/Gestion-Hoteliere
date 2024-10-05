package com.example.gestion_hoteliere.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaiement;

    @ManyToOne
    private Reservation reservation;

    private float montant;
    private Date datePaiement;
    private String moyenPaiement;

    // Getters and Setters
}
