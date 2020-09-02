package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricantesDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{

	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricante listarXId(Long id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(id);
	}
	
}
