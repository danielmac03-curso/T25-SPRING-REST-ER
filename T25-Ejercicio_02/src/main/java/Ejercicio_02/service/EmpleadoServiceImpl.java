package Ejercicio_02.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio_02.dao.IEmpleadosDAO;
import Ejercicio_02.dto.Empleados;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadosDAO iEmpleadosDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleado(Empleados articulo) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(articulo);
	}

	@Override
	public Empleados listarXId(Long id) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(id).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados articulo) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(articulo);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		// TODO Auto-generated method stub
		iEmpleadosDAO.deleteById(id);
	}

}
