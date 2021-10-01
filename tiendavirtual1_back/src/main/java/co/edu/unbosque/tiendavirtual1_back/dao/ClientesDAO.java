package co.edu.unbosque.tiendavirtual1_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.tiendavirtual1_back.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Integer>{

}