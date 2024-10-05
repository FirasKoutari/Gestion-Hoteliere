package com.example.gestion_hoteliere.services;


import com.example.gestion_hoteliere.entities.Chambre;
import com.example.gestion_hoteliere.repository.ChambreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService {
    @Autowired
    private ChambreRepository chambreRepository;

    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    public Optional<Chambre> getChambreById(int id) {
        return chambreRepository.findById(id);
    }

    public Chambre saveChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void deleteChambre(int id) {
        chambreRepository.deleteById(id);
    }
}
