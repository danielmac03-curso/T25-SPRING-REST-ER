package Ejercicio_01.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio_01.dao.IArticulosDAO;
import Ejercicio_01.dto.Articulos;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulo() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos listarXId(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById(id);
	}

}
