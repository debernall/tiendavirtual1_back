package co.edu.unbosque.tiendavirtual1_back.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.tiendavirtual1_back.dao.ClientesDAO;
import co.edu.unbosque.tiendavirtual1_back.model.Clientes;


@RestController //esta es una clase REST
@RequestMapping("clientes")

public class ClientesAPI {
	
	@Autowired //inyecta la dependencia de todos los mÃƒÂ©todos del JPA para ClientesDAO
	private ClientesDAO clientesDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}

	@GetMapping("/listar")
	public List<Clientes> listar(){
		return clientesDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		clientesDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}

}
