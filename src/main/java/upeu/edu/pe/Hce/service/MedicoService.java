package upeu.edu.pe.Hce.service;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Hce.entity.Medico;

public interface MedicoService {
	Medico create(Medico a);
	Medico update(Medico a);
	void delete(Long id);
	Optional<Medico> read(Long id);
	List<Medico> readAll();
}
