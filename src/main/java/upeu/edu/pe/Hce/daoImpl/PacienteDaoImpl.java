package upeu.edu.pe.Hce.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import upeu.edu.pe.Hce.dao.PacienteDao;
import upeu.edu.pe.Hce.entity.Paciente;
import upeu.edu.pe.Hce.repository.PacienteRepository;
@Component
public class PacienteDaoImpl implements PacienteDao{

	@Autowired
	private PacienteRepository repository;
	
	@Override
	public Paciente create(Paciente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Paciente update(Paciente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Paciente> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}