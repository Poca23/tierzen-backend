package com.tierzen.backend.dto;

import java.time.LocalDate;

public class AdherentDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String numeroAdherent;
    private String mutuelle;
    private LocalDate dateValidite;

    // Constructeur
    public AdherentDTO(Long id, String nom, String prenom,
            String numeroAdherent, String mutuelle,
            LocalDate dateValidite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroAdherent = numeroAdherent;
        this.mutuelle = mutuelle;
        this.dateValidite = dateValidite;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroAdherent() {
        return numeroAdherent;
    }

    public String getMutuelle() {
        return mutuelle;
    }

    public LocalDate getDateValidite() {
        return dateValidite;
    }
}
