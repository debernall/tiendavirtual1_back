package co.edu.unbosque.tiendavirtual1_back.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.tiendavirtual1_back.dao.ClientesDAO;
import co.edu.unbosque.tiendavirtual1_back.model.Clientes;


@RestController //esta es una clase REST
@RequestMapping(path="clientes")

public class ClientesAPI {
	
	@Autowired //inyecta la dependencia de todos los mÃƒÂ©todos del JPA para ClientesDAO
	private ClientesDAO clientesDAO;
	
	@PostMapping(path="/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Clientes> listar(){
		return (List<Clientes>) clientesDAO.findAll();
	}

	@DeleteMapping(path="/eliminar")
	public void eliminar(@RequestBody Clientes cliente) {
		long id = cliente.getCedula_cliente();
		clientesDAO.deleteById(id);
	}

	@PutMapping(path="/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	}
	
	@PostMapping(path="/consultar")
	public @ResponseBody Optional<Clientes> consultar(@RequestBody Clientes clientes) {
		Long cedula_cliente = clientes.getCedula_cliente();
		return clientesDAO.findById(cedula_cliente);
	}
}
