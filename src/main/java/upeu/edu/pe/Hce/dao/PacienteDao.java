package upeu.edu.pe.Hce.dao;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Hce.entity.Paciente;

public interface PacienteDao {

	Paciente create(Paciente a);
	Paciente update(Paciente a);
	void delete(Long id);
	Optional<Paciente> read(Long id);
	List<Paciente> readAll();
}
