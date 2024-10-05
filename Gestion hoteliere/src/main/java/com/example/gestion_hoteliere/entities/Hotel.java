package com.example.gestion_hoteliere.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHotel;

    private String nomHotel;
    private String ville;
    private String contact;
    private String adresse;
    private String email;
    private float longitude;
    private float latitude;
    private int etoile;
    private boolean parking;
    private boolean piscine;
    private boolean salleReunion;
    private boolean restaurantLocal;
    private boolean wifi;
    private boolean paiementEspece;
    private boolean paiementCarte;

    @ElementCollection
    private List<String> imagesHotel;

    // Getters and Setters
}

