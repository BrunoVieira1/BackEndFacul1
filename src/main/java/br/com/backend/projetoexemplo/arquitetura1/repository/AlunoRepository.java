package br.com.backend.projetoexemplo.arquitetura1.repository;

import br.com.backend.projetoexemplo.arquitetura1.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer > {
    Aluno findByNome(String nome);
}
