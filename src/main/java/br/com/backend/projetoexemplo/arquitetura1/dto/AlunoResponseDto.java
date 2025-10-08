package br.com.backend.projetoexemplo.arquitetura1.dto;

import br.com.backend.projetoexemplo.arquitetura1.entity.Aluno;
import br.com.backend.projetoexemplo.arquitetura1.enums.StatusEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class AlunoResponseDto {

    private final Integer id;
    @NotBlank(message = "o nome é obrigatório!")
    private final String nome;

    @NotNull(message = "a mensalidade é obrigatória!")
    @Positive
    private final Double mensalidade;
    private final StatusEnum statusEnum;

    public AlunoResponseDto(Integer id, String nome, Double mensalidade, StatusEnum statusEnum) {
        this.id = id;
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.statusEnum = statusEnum;
    }


}
