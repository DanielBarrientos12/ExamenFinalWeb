package com.ufps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Linea;
import com.ufps.services.LineaService;

@RestController
@RequestMapping("/lineas")
public class LineaController {
	
	@Autowired
	LineaService lineaService;
	
	@PostMapping("/{id}")
	public Linea updateLinea() {
		
	}
	
}
