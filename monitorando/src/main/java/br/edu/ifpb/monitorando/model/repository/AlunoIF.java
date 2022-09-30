package br.edu.ifpb.monitorando.model.repository;

import br.edu.ifpb.monitorando.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoIF extends JpaRepository<Aluno, Long> {
}
