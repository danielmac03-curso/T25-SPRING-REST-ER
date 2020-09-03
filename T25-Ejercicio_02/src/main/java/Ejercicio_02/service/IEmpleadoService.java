package Ejercicio_02.service;

import java.util.List;

import Ejercicio_02.dto.Empleados;

public interface IEmpleadoService {
	
	public List<Empleados> listarEmpleados();
	
	public Empleados guardarEmpleado(Empleados articulo);
	
	public Empleados listarXId(Long id);
	
	public Empleados actualizarEmpleado(Empleados articulo);
	
	public void eliminarEmpleado(Long id);
	
}
