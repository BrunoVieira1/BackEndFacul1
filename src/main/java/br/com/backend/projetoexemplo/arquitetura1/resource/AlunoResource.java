package br.com.backend.projetoexemplo.arquitetura1.resource;

import br.com.backend.projetoexemplo.arquitetura1.dto.AlunoRequestDto;
import br.com.backend.projetoexemplo.arquitetura1.dto.AlunoResponseDto;
import br.com.backend.projetoexemplo.arquitetura1.entity.Aluno;
import br.com.backend.projetoexemplo.arquitetura1.mapper.AlunoMapper;
import br.com.backend.projetoexemplo.arquitetura1.service.AlunoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
@Tag(name = "Aluno")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @Autowired
    private AlunoMapper mapper;

    @PostMapping
    public ResponseEntity<AlunoResponseDto> criar(@Valid @RequestBody AlunoRequestDto dto) {
        Aluno aluno = service.criar(dto);
        AlunoResponseDto responseDto = mapper.toResponseDto(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);

    }
}
