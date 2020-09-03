package Ejercicio_01.service;

import java.util.List;

import Ejercicio_01.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante listarXId(Long id);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Long id);
	
}
