package co.edu.unbosque.tiendavirtual1_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.tiendavirtual1_back.model.Productos;


public interface ProductosDAO extends JpaRepository<Productos, Integer>{

}
