package pe.edu.com.upeu.caso_academico.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.com.upeu.caso_academico.entity.Escuela;

public interface EscuelaDao {
	Escuela create(Escuela c);
	Escuela update(Escuela c);
	void delete(Long id);
	Optional<Escuela> read(Long id);
	List<Escuela> readAll();
}
