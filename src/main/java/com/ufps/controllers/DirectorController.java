package com.ufps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Director;
import com.ufps.services.DirectorService;

@RestController
@RequestMapping("/directores")
public class DirectorController {

	@Autowired
	DirectorService directorService;
	
	@GetMapping
	public List<Director> getDirectores(){
		return directorService.getDirectores();
	}
	
}
