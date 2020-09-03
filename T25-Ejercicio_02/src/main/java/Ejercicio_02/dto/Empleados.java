package Ejercicio_02.dto;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamentos departamento;
	
	public Empleados() {}

	public Empleados(Long id, String nombre, String apellido, int precio, Departamentos departamento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.departamento = departamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellidos;
	}

	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	public Departamentos getFabricante() {
		return departamento;
	}

	public void setFabricante(Departamentos fabricante) {
		this.departamento = fabricante;
	}

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", apellido=" + apellidos + ", departamento=" + departamento + "]";
	}
	
}
