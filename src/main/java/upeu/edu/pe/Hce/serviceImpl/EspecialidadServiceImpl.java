package upeu.edu.pe.Hce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hce.dao.EspecialidadDao;
import upeu.edu.pe.Hce.entity.Especialidad;
import upeu.edu.pe.Hce.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{

	@Autowired
	private EspecialidadDao dao;

	@Override
	public Especialidad create(Especialidad a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Especialidad update(Especialidad a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}