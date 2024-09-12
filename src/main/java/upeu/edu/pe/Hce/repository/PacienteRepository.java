package upeu.edu.pe.Hce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.Hce.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
