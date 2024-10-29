package pe.edu.com.upeu.caso_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.com.upeu.caso_academico.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{

}


