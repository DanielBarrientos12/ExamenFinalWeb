package com.ufps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Participacion;
import com.ufps.services.ParticipacionService;

@RestController
@RequestMapping("/participacion")
public class ParticipacionController {

	@Autowired
	ParticipacionService participacionService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Participacion> getParticipacionByid(@PathVariable int id) {
	    try {
	        Participacion participacion = participacionService.getById(id);
	        return ResponseEntity.ok(participacion);
	    } catch (RuntimeException e) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	    }
	}

	
}
