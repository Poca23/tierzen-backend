package com.tierzen.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tierzen.backend.entity.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
}