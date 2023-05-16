package com.spring2dointento.miproyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    public Persona() {
    }

    public Persona(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
}
