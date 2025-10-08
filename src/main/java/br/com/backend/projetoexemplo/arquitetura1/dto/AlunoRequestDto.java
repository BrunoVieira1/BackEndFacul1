package br.com.backend.projetoexemplo.arquitetura1.dto;

import br.com.backend.projetoexemplo.arquitetura1.enums.StatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Schema(description = "dto da entrada de Aluno")
public class AlunoRequestDto {

    @NotBlank(message = "o nome é obrigatório!")
    private final String nome;

    @NotNull(message = "a mensalidade é obrigatória!")
    @Positive
    private final Double mensalidade;
    private final StatusEnum statusEnum;

    public AlunoRequestDto(String nome, Double mensalidade, StatusEnum statusEnum) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.statusEnum = statusEnum;
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }
}
