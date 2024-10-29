package pe.edu.com.upeu.caso_academico.service;


import java.util.List;
import java.util.Optional;

import pe.edu.com.upeu.caso_academico.entity.Facultad;

public interface FacultadService {
	Facultad create(Facultad c);
	Facultad update(Facultad c);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}


