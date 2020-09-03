package Ejercicio_02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_02.dto.Departamentos;
import Ejercicio_02.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarFabricantes(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos salvarFabricante(@RequestBody Departamentos departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamentos listarXId(@PathVariable(name="id") Long id) {
		Departamentos fabricante_xid = new Departamentos();
		
		fabricante_xid = departamentoServiceImpl.listarXId(id);
		
		System.out.println("Departamento XID: " + fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarFabricante(@PathVariable(name="id")Long id, @RequestBody Departamentos departamento) {
		
		Departamentos fabricante_seleccionado = new Departamentos();
		Departamentos fabricante_actualizado = new Departamentos();
		
		fabricante_seleccionado= departamentoServiceImpl.listarXId(id);
		
		fabricante_seleccionado.setNombre(departamento.getNombre());
		
		fabricante_actualizado = departamentoServiceImpl.actualizarDepartamento(fabricante_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eliminarCliente(@PathVariable(name="id")Long id) {
		departamentoServiceImpl.eliminarDepartamento(id);
	}
	
}
