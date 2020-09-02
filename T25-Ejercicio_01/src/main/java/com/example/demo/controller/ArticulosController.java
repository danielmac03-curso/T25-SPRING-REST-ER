package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulo();
	}
	
	@PostMapping("/articulos")
	public Articulo salvarArticulos(Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado= articuloServiceImpl.listarXId(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());

		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulos(@PathVariable(name="id")Long id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
	
}
