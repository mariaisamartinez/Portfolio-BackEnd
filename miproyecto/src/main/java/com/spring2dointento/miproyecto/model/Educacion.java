package com.spring2dointento.miproyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String titulo;
    private String entidad;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String entidad) {
        this.id = id;
        this.titulo = titulo;
        this.entidad = entidad;
    }
    
    
}
