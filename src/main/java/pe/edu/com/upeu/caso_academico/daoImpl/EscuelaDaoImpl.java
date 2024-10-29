package pe.edu.com.upeu.caso_academico.daoImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.com.upeu.caso_academico.dao.EscuelaDao;
import pe.edu.com.upeu.caso_academico.entity.Escuela;
import pe.edu.com.upeu.caso_academico.repository.EscuelaRepository;
@Component
public class EscuelaDaoImpl implements EscuelaDao{

	@Autowired
	private EscuelaRepository escuelaRepository;
	@Override
	public Escuela create(Escuela c) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(c);
	}

	@Override
	public Escuela update(Escuela c) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escuelaRepository.deleteById(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return escuelaRepository.findById(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return escuelaRepository.findAll();
	}

}

