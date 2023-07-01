package com.spring2dointento.miproyecto.repository;

import com.spring2dointento.miproyecto.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

}
