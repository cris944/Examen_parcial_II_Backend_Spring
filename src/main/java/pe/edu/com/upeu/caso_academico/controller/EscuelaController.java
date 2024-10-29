package pe.edu.com.upeu.caso_academico.controller;



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
import pe.edu.com.upeu.caso_academico.entity.Escuela;
import pe.edu.com.upeu.caso_academico.service.EscuelaService;

@RestController
@RequestMapping("/api/escuelas")
public class EscuelaController {

	@Autowired
	private EscuelaService escuelaService;
	
	@GetMapping
	public ResponseEntity<List<Escuela>> readAll(){
		try {
			List<Escuela> escuelas = escuelaService.readAll();
			if(escuelas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(escuelas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Escuela> crear(@Valid @RequestBody Escuela cat){
		try {
			Escuela c = escuelaService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Escuela> getCategoriaId(@PathVariable("id") Long id){
		try {
			Escuela c = escuelaService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Escuela> delCategoria(@PathVariable("id") Long id){
		try {
			escuelaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCategoria(@PathVariable("id") Long id, @Valid @RequestBody Escuela cat){

			Optional<Escuela> c = escuelaService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(escuelaService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}



