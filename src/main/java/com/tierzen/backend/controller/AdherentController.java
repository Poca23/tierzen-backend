package com.tierzen.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tierzen.backend.dto.AdherentDTO;
import com.tierzen.backend.service.AdherentService;

@RestController
@RequestMapping("/api/adherent")
@CrossOrigin(origins = "*")
public class AdherentController {

    private final AdherentService service;

    public AdherentController(AdherentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdherentDTO> getAdherent(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}
