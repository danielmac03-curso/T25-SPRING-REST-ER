package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Articulos;

public interface IArticuloService {
	
	public List<Articulos> listarArticulo();
	
	public Articulos guardarArticulo(Articulos articulo);
	
	public Articulos listarXId(Long id);
	
	public Articulos actualizarArticulo(Articulos articulo);
	
	public void eliminarArticulo(Long id);
	
}
