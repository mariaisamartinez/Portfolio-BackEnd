package com.spring2dointento.miproyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String habilidad1;
    private String habilidad2;

    public Habilidad() {
    }

    public Habilidad(Long id, String habilidad1, String habilidad2) {
        this.id = id;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
    }
    
    
}
