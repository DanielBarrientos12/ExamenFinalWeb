package com.ufps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.dto.LineaDTO;
import com.ufps.entities.Linea;
import com.ufps.services.LineaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/lineas")
public class LineaController {
	
	@Autowired
	LineaService lineaService;
	
	@PostMapping
    public ResponseEntity<Linea> createLinea(@RequestBody LineaDTO lineaDTO) {
        try {
            Linea createdLinea = lineaService.createLinea(lineaDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdLinea);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

	
}
