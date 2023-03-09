package br.com.github.ajunior.ifood.services;

import br.com.github.ajunior.ifood.dtos.RestauranteDto;
import br.com.github.ajunior.ifood.dtos.mappers.RestauranteMapper;
import br.com.github.ajunior.ifood.entities.RestauranteEntity;
import br.com.github.ajunior.ifood.repository.RestauranteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteService {

    @Inject
    private RestauranteRepository restauranteRepository;

    @Inject
    private RestauranteMapper restauranteMapper;

    public List<RestauranteDto> findAllRestaurantes() {
        List<RestauranteDto> restaurantes = new ArrayList<>();

        restauranteRepository.findAll().stream().forEach(item -> {
            restaurantes.add(restauranteMapper.INSTANCE.restauranteEntityToDto(item));
        });

        return restaurantes;
    }

    public void adicionarRestaurante(RestauranteDto restauranteDto) {
        restauranteRepository.persist(restauranteMapper.INSTANCE.restauranteDtoToEntity(restauranteDto));
    }

    public void updateRestaurante(Long id, RestauranteDto restauranteDto) {
        RestauranteEntity restaurante = restauranteMapper.INSTANCE.restauranteDtoToEntity(restauranteDto);
        restauranteRepository.persist(restaurante);
    }

    public void deleteRestaurante(Long id) {
        restauranteRepository.deleteById(id);
    }

}
