package Ejercicio_02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio_02.dto.Empleados;
import Ejercicio_02.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarArticulos(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados salvarArticulos(Empleados empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleados listarXId(@PathVariable(name="id") Long id) {
		Empleados listarXID = new Empleados();
		
		listarXID = empleadoServiceImpl.listarXId(id);
		
		System.out.println("Empleado XID: " + listarXID);
		
		return listarXID;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Empleados empleado) {
		
		Empleados articulo_seleccionado = new Empleados();
		Empleados articulo_actualizado = new Empleados();
		
		articulo_seleccionado= empleadoServiceImpl.listarXId(id);
		
		articulo_seleccionado.setNombre(empleado.getNombre());
		articulo_seleccionado.setApellido(empleado.getApellido());;
		articulo_seleccionado.setFabricante(empleado.getFabricante());

		
		articulo_actualizado = empleadoServiceImpl.actualizarEmpleado(articulo_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarArticulos(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
}
