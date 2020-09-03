package Ejercicio_02.service;

import java.util.List;

import Ejercicio_02.dto.Departamentos;

public interface IDepartamentoService {
	
	public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamento(Departamentos fabricante);
	
	public Departamentos listarXId(Long id);
	
	public Departamentos actualizarDepartamento(Departamentos fabricante);
	
	public void eliminarDepartamento(Long id);
	
}
