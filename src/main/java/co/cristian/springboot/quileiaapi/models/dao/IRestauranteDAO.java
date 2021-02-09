package co.cristian.springboot.quileiaapi.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.cristian.springboot.quileiaapi.models.entity.Restaurante;

public interface IRestauranteDAO extends JpaRepository<Restaurante, Integer> {

}
