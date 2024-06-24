package com.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Director;
import com.ufps.repositories.DirectorRepository;

@Service
public class DirectorService {
	
	@Autowired
	DirectorRepository directorRepository;
	
	public List<Director> getDirectores() {
		return directorRepository.findAll();
	}

}
