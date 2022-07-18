package com.example.controlador;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelos.Clients;
import com.example.repositorio.InterfaceClient;

@RestController
@RequestMapping("/User") //aqí la ruta sería /ApiRest/User
@CrossOrigin(origins = "http://localhost:4200") //Para habilitar la api al front
public class ClientController {

	@Autowired
	private InterfaceClient InterfaceCli;
	
	@GetMapping("/show") //Ruta para obtener listado
	public List<Clients> users(){
		return (List<Clients>) InterfaceCli.findAll();
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@PostMapping("/add")//Ruta para agregar
	public void Insert(@RequestBody Clients cl) {
		long id = 0;
		if(cl.getId() == null) {
			cl.setId((int) id);
		}
		InterfaceCli.save(cl);
	}
	
	@PutMapping("/update/{id}")//Ruta para editar según id
	public void Update(@PathVariable("id") Integer id, @RequestBody Clients cl) {
		cl.setId(id);
		InterfaceCli.save(cl);
	}
	
	@DeleteMapping(value="/delete/{id}")//Ruta para eliminar Según id
	public void Delete(@PathVariable("id") Integer id) {
		InterfaceCli.deleteById(id);
	}
}
