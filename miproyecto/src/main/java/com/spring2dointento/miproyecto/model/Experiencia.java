package com.spring2dointento.miproyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cargo;
    private String empresa;

    public Experiencia() {
    }

    public Experiencia(Long id, String cargo, String empresa) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
    }
    
    
}
