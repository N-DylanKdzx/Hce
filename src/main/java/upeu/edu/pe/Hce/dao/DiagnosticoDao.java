package upeu.edu.pe.Hce.dao;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Hce.entity.Diagnostico;

public interface DiagnosticoDao {

	Diagnostico create(Diagnostico a);
	Diagnostico update(Diagnostico a);
	void delete(Long id);
	Optional<Diagnostico> read(Long id);
	List<Diagnostico> readAll();
}
