package br.com.github.ajunior.ifood.controllers;

import br.com.github.ajunior.ifood.dtos.RestauranteDto;
import br.com.github.ajunior.ifood.services.RestauranteService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/restaurantes")
public class RestauranteController {

    @Inject
    RestauranteService restauranteService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RestauranteDto> buscar() {
        return restauranteService.findAllRestaurantes();
    }

    @POST
    @Transactional
    public Response adicionar(RestauranteDto restauranteDto) {
        try {
            restauranteService.adicionarRestaurante(restauranteDto);
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

//    @PUT
//    @Path("{id}")
//    @Transactional
//    public Response atualizarRestaurante(@PathParam("id") Long id, RestauranteDto restauranteDto) {
//        try {
//            restauranteService.updateRestaurante(id, restauranteDto);
//            return Response.ok().build();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return Response.serverError().build();
//        }
//    }
//
//    @DELETE
//    @Path("{id}")
//    @Transactional
//    public Response delete(@PathParam("id") Long id, RestauranteEntity restauranteEntityDto) {
//        try {
//            restauranteService.deleteRestaurante(id);
//            return Response.ok().build();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return Response.serverError().build();
//        }
//    }

}