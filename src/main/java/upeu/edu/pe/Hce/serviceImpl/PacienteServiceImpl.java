package upeu.edu.pe.Hce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hce.dao.PacienteDao;
import upeu.edu.pe.Hce.entity.Paciente;
import upeu.edu.pe.Hce.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService{

	@Autowired
	private PacienteDao dao;

	@Override
	public Paciente create(Paciente a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Paciente update(Paciente a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Paciente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}