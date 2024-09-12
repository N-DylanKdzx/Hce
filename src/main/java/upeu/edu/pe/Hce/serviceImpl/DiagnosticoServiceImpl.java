package upeu.edu.pe.Hce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hce.dao.DiagnosticoDao;
import upeu.edu.pe.Hce.entity.Diagnostico;
import upeu.edu.pe.Hce.service.DiagnosticoService;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService{

	@Autowired
	private DiagnosticoDao dao;

	@Override
	public Diagnostico create(Diagnostico a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Diagnostico update(Diagnostico a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Diagnostico> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
