package pe.edu.com.upeu.caso_academico.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.com.upeu.caso_academico.dao.FacultadDao;
import pe.edu.com.upeu.caso_academico.entity.Facultad;
import pe.edu.com.upeu.caso_academico.service.FacultadService;
@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	private FacultadDao facultadDao;
	@Override
	public Facultad create(Facultad c) {
		// TODO Auto-generated method stub
		return facultadDao.create(c);
	}

	@Override
	public Facultad update(Facultad c) {
		// TODO Auto-generated method stub
		return facultadDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadDao.delete(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return facultadDao.read(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadDao.readAll();
	}

}

