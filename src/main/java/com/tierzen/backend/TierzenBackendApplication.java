package com.tierzen.backend;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tierzen.backend.entity.Adherent;
import com.tierzen.backend.repository.AdherentRepository;

@SpringBootApplication
public class TierzenBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TierzenBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(AdherentRepository repository) {
		return args -> {
			Adherent a = new Adherent();
			a.setNom("Naudin");
			a.setPrenom("Claire");
			a.setNumeroAdherent("HM-2026-00142");
			a.setMutuelle("TierZen");
			a.setDateValidite(LocalDate.of(2026, 12, 31));
			repository.save(a);
		};
	}
}
