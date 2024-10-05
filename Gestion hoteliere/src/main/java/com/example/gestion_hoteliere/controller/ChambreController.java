package com.example.gestion_hoteliere.controller;


import com.example.gestion_hoteliere.entities.Chambre;
import com.example.gestion_hoteliere.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/chambres")
public class ChambreController {

    @Autowired
    private ChambreService chambreService;

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable int id) {
        return chambreService.getChambreById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.saveChambre(chambre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable int id, @RequestBody Chambre chambre) {
        return chambreService.getChambreById(id)
                .map(existingChambre -> {
                    chambre.setIdChambre(id);
                    return ResponseEntity.ok(chambreService.saveChambre(chambre));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable int id) {
        chambreService.deleteChambre(id);
        return ResponseEntity.noContent().build();
    }
}

