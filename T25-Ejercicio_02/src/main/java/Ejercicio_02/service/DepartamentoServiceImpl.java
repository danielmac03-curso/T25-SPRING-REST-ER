package Ejercicio_02.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio_02.dao.IDepartamentosDAO;
import Ejercicio_02.dto.Departamentos;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamento(Departamentos fabricante) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(fabricante);
	}

	@Override
	public Departamentos listarXId(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos fabricante) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(fabricante);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		// TODO Auto-generated method stub
		iDepartamentosDAO.deleteById(id);
	}
	
}
