package co.cristian.springboot.quileiaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.cristian.springboot.quileiaapi.models.entity.Restaurante;
import co.cristian.springboot.quileiaapi.models.services.IRestauranteService;

@RestController
@RequestMapping("/api")
public class RestauranteRestController {
	
	@Autowired
	private IRestauranteService restauranteService;

	@GetMapping("/restaurantes")
	public List<Restaurante> index(){
		
		return restauranteService.findAll();
		
	}
	
}
