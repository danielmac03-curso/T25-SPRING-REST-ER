package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Articulos;
import com.example.demo.dto.Fabricante;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articuloServiceImpl.listarArticulo();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulos(Articulos articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos listarXId(@PathVariable(name="id") Long id) {
		Articulos listarXID = new Articulos();
		
		listarXID = articuloServiceImpl.listarXId(id);
		
		System.out.println("Fabricante XID: " + listarXID);
		
		return listarXID;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado = new Articulos();
		Articulos articulo_actualizado = new Articulos();
		
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
