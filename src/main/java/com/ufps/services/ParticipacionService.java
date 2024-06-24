package com.ufps.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Participacion;
import com.ufps.repositories.ParticipacionRepository;

@Service
public class ParticipacionService {

	@Autowired
	ParticipacionRepository participacionRepository;

	public Participacion getById(int id) {
		Optional<Participacion> participacion = participacionRepository.findById(id);

		if (participacion.isEmpty()) {
			throw new RuntimeException("Participacion no encontrada");
		}

		return participacion.get();
	}

}
