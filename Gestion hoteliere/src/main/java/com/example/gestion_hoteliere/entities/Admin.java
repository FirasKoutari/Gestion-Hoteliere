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
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;

    private String nom;
    private String prenom;
    private String telephone;
    private String genre;

    @OneToOne
    private Authentification authentification;

    // Getters and Setters
}
