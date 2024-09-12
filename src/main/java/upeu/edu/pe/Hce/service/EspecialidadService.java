package upeu.edu.pe.Hce.service;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Hce.entity.Especialidad;

public interface EspecialidadService {
	Especialidad create(Especialidad a);
	Especialidad update(Especialidad a);
	void delete(Long id);
	Optional<Especialidad> read(Long id);
	List<Especialidad> readAll();
}
