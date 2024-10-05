package com.example.gestion_hoteliere.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre;

    private String nomHotel;
    private String typeChambre;
    private float prix;
    private String nomChambre;
    private String numeroChambre;
    private String typeLit;
    private boolean climatiseur;
    private boolean television;
    private boolean ventilateur;
    private boolean coffreFort;

    @ElementCollection
    private List<String> imagesChambre;

    @ManyToOne
    private Hotel hotel;

    // Getters and Setters
}

