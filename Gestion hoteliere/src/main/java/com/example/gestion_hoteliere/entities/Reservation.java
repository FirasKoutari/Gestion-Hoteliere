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
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    @ManyToOne
    private Chambre chambre;

    @ManyToOne
    private Client client;

    private String typePiece;
    private String numeroPiece;
    private Date dateExpirationPiece;
    private Date dateArrivee;
    private Date dateDepart;
    private String modePaiement;

    // Getters and Setters
}
