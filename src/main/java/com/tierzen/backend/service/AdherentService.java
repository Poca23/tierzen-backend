package com.tierzen.backend.service;

import org.springframework.stereotype.Service;

import com.tierzen.backend.dto.AdherentDTO;
import com.tierzen.backend.entity.Adherent;
import com.tierzen.backend.repository.AdherentRepository;

@Service
public class AdherentService {

    private final AdherentRepository repository;

    public AdherentService(AdherentRepository repository) {
        this.repository = repository;
    }

    public AdherentDTO getById(Long id) {
        Adherent a = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adhérent non trouvé"));

        return new AdherentDTO(
                a.getId(),
                a.getNom(),
                a.getPrenom(),
                a.getNumeroAdherent(),
                a.getMutuelle(),
                a.getDateValidite());
    }
}
