package br.edu.ifpb.monitorando.model.repository;

import br.edu.ifpb.monitorando.model.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaIF extends JpaRepository<Disciplina,Long> {
}
