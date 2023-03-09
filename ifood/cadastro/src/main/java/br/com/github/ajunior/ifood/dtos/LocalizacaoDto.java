package br.com.github.ajunior.ifood.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
public class LocalizacaoDto {

    public Long id;

    public Double latitude;

    public Double longitude;

}