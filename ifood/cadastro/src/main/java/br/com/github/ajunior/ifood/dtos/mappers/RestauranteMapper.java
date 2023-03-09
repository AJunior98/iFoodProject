package br.com.github.ajunior.ifood.dtos.mappers;

import br.com.github.ajunior.ifood.dtos.RestauranteDto;
import br.com.github.ajunior.ifood.entities.RestauranteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "cdi")
public interface RestauranteMapper {

    RestauranteMapper INSTANCE = Mappers.getMapper(RestauranteMapper.class);

    RestauranteDto restauranteEntityToDto(RestauranteEntity restauranteEntity);

    RestauranteEntity restauranteDtoToEntity(RestauranteDto restauranteDto);

}
