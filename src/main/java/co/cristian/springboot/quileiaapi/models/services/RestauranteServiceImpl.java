package co.cristian.springboot.quileiaapi.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.cristian.springboot.quileiaapi.models.dao.IRestauranteDAO;
import co.cristian.springboot.quileiaapi.models.entity.Restaurante;

@Service
public class RestauranteServiceImpl implements IRestauranteService {
	
	@Autowired
	private IRestauranteDAO restauranteDAO;

	@Override
	public List<Restaurante> findAll() {
		
		return restauranteDAO.findAll();
		
	}

}
