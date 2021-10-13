package co.edu.unbosque.tiendavirtual1_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.tiendavirtual1_back.model.Ventas;

@Repository
public interface VentasDAO extends JpaRepository<Ventas, Long>{

}
