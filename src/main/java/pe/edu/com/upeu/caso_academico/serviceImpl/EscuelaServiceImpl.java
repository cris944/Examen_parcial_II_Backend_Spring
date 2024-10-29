package pe.edu.com.upeu.caso_academico.serviceImpl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.com.upeu.caso_academico.dao.EscuelaDao;
import pe.edu.com.upeu.caso_academico.entity.Escuela;
import pe.edu.com.upeu.caso_academico.service.EscuelaService;
@Service
public class EscuelaServiceImpl implements EscuelaService{

	@Autowired
	private EscuelaDao escuelaDao;
	@Override
	public Escuela create(Escuela c) {
		// TODO Auto-generated method stub
		return escuelaDao.create(c);
	}

	@Override
	public Escuela update(Escuela c) {
		// TODO Auto-generated method stub
		return escuelaDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escuelaDao.delete(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return escuelaDao.read(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return escuelaDao.readAll();
	}

}



