package br.com.github.ajunior.ifood.repository;

import br.com.github.ajunior.ifood.entities.RestauranteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestauranteRepository implements PanacheRepository<RestauranteEntity> {
}
