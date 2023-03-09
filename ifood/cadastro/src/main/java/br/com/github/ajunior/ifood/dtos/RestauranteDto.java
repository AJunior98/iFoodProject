package br.com.github.ajunior.ifood.dtos;

import br.com.github.ajunior.ifood.entities.LocalizacaoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteDto {

    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;

    public LocalizacaoEntity localizacao;

}
