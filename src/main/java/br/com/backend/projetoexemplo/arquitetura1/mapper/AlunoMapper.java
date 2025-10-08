package br.com.backend.projetoexemplo.arquitetura1.mapper;

import br.com.backend.projetoexemplo.arquitetura1.dto.AlunoRequestDto;
import br.com.backend.projetoexemplo.arquitetura1.dto.AlunoResponseDto;
import br.com.backend.projetoexemplo.arquitetura1.entity.Aluno;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlunoMapper {
    Aluno toEntity(AlunoRequestDto dto);
    List<Aluno> toEntityList(List<AlunoRequestDto> dtos);

    AlunoResponseDto toResponseDto(Aluno aluno);
    List<AlunoResponseDto> toResponseDtoList(List<Aluno> alunos);
}
