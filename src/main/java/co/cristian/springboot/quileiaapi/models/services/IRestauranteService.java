package co.cristian.springboot.quileiaapi.models.services;

import java.util.List;

import co.cristian.springboot.quileiaapi.models.entity.Restaurante;

public interface IRestauranteService {
	
	public List<Restaurante> findAll();

}
