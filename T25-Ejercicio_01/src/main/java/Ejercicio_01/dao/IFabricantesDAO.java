package Ejercicio_01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_01.dto.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Long>{

}
