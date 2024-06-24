package com.ufps.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LineaDTO {
	
    private String descripcion;
    private byte estado;
    private String nombre;
    private int semilleroId;

}
