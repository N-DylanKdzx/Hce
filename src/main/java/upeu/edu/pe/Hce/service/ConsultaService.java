package upeu.edu.pe.Hce.service;

import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Hce.entity.Consulta;

public interface ConsultaService {
	Consulta create(Consulta a);
	Consulta update(Consulta a);
	void delete(Long id);
	Optional<Consulta> read(Long id);
	List<Consulta> readAll();
}
