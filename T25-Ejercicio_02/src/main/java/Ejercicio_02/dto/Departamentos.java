package Ejercicio_02.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamentos")
public class Departamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Empleados> articulos;

	public Departamentos() {}
	
	public Departamentos(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
	public List<Empleados> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Empleados> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
