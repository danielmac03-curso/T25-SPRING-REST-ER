package Ejercicio_02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_02.dto.Departamentos;

public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long>{

}
