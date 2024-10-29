package pe.edu.com.upeu.caso_academico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.com.upeu.caso_academico.entity.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long>{

}



