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

import co.edu.unbosque.tiendavirtual1_back.dao.ProductosDAO;
import co.edu.unbosque.tiendavirtual1_back.model.Productos;

@RestController //esta es una clase REST
@RequestMapping("produsctos")

public class ProductosAPI {
	
	@Autowired //inyecta la dependencia de todos los mÃ©todos del JPA para ProveedoresDAO
	private ProductosDAO productosDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}

	@GetMapping("/listar")
	public List<Productos> listar(){
		return productosDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		productosDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}

}
