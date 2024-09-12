package upeu.edu.pe.Hce.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import upeu.edu.pe.Hce.entity.Diagnostico;
import upeu.edu.pe.Hce.service.DiagnosticoService;

@RestController
@RequestMapping("/api/diagnosticos")
public class DiagnosticoController {
	@Autowired
	private DiagnosticoService diagnosticoService;
	
	@GetMapping
	public ResponseEntity<List<Diagnostico>> readAll(){
		try {
			List<Diagnostico> diagnosticos = diagnosticoService.readAll();
			if(diagnosticos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(diagnosticos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Diagnostico> crear(@Valid @RequestBody Diagnostico cat){
		try {
			Diagnostico c = diagnosticoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Diagnostico> getDiagnosticoId(@PathVariable("id") Long id){
		try {
			Diagnostico c = diagnosticoService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Diagnostico> delDiagnostico(@PathVariable("id") Long id){
		try {
			diagnosticoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDiagnostico(@PathVariable("id") Long id, @Valid @RequestBody Diagnostico cat){

			Optional<Diagnostico> c = diagnosticoService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(diagnosticoService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}