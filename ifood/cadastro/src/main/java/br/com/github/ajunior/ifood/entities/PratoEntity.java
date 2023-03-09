package br.com.github.ajunior.ifood.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "prato")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;

    public String descricao;

    @ManyToOne
    public RestauranteEntity restauranteEntity;

    public BigDecimal preco;

}
