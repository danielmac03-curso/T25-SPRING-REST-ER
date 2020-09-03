package Ejercicio_01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_01.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

}
