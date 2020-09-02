package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Fabricante;
import com.example.demo.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante listarXId(@PathVariable(name="id") Long id) {
		Fabricante fabricante_xid = new Fabricante();
		
		fabricante_xid = fabricanteServiceImpl.listarXId(id);
		
		System.out.println("Fabricante XID: " + fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")Long id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado= fabricanteServiceImpl.listarXId(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarCliente(@PathVariable(name="id")Long id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}
	
}
