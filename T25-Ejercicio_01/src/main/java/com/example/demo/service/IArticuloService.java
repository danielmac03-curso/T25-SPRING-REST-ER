package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> listarArticulo();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo listarXId(Long id);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void eliminarArticulo(Long id);
	
}
