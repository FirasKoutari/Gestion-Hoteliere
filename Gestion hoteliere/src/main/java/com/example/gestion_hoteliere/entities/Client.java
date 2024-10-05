package com.example.gestion_hoteliere.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    private String nom;
    private String prenom;
    private String telephone;
    private String genre;
    private String provenance;

    @OneToOne
    private Authentification authentification;

    // Getters and Setters
}
