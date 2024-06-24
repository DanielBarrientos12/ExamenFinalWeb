package com.ufps.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.dto.LineaDTO;
import com.ufps.entities.Linea;
import com.ufps.entities.Semillero;
import com.ufps.repositories.LineaRepository;
import com.ufps.repositories.SemilleroRepository;

@Service
public class LineaService {
	
	@Autowired
	LineaRepository lineaRepository;
	
	@Autowired
	SemilleroRepository semilleroRepository;

	public Linea createLinea(LineaDTO lineaDto) {
        Optional<Semillero> semillero = semilleroRepository.findById(lineaDto.getSemilleroId());
        
        if (semillero.isEmpty()) {
            throw new RuntimeException("Semillero no existe");
        }
        
        Linea linea = new Linea();
        linea.setNombre(lineaDto.getNombre());
        linea.setDescripcion(lineaDto.getDescripcion());
        linea.setEstado(lineaDto.getEstado());
        linea.setSemillero(semillero.get());
        
        return lineaRepository.save(linea);
    }



}
