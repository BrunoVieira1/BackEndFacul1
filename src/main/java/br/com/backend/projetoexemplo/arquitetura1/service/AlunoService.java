package br.com.backend.projetoexemplo.arquitetura1.service;


import br.com.backend.projetoexemplo.arquitetura1.dto.AlunoRequestDto;
import br.com.backend.projetoexemplo.arquitetura1.entity.Aluno;
import br.com.backend.projetoexemplo.arquitetura1.mapper.AlunoMapper;
import br.com.backend.projetoexemplo.arquitetura1.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AlunoMapper mapper;

    public Aluno criar(AlunoRequestDto dto) {

        return repository.save(mapper.toEntity(dto));
    }
}
