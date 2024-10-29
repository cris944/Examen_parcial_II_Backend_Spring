package pe.edu.com.upeu.caso_academico.daoImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.com.upeu.caso_academico.dao.FacultadDao;
import pe.edu.com.upeu.caso_academico.entity.Facultad;
import pe.edu.com.upeu.caso_academico.repository.FacultadRepository;
@Component
public class FacultadDaoImpl implements FacultadDao{

	@Autowired
	private FacultadRepository facultadRepository;
	@Override
	public Facultad create(Facultad c) {
		// TODO Auto-generated method stub
		return facultadRepository.save(c);
	}

	@Override
	public Facultad update(Facultad c) {
		// TODO Auto-generated method stub
		return facultadRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadRepository.deleteById(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return facultadRepository.findById(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadRepository.findAll();
	}

}

