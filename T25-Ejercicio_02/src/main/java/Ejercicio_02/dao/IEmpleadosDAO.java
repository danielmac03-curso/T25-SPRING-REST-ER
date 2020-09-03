package Ejercicio_02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio_02.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados, Long>{

}
