package br.edu.ifpb.monitorando.model.repository;

import br.edu.ifpb.monitorando.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoIF extends JpaRepository<Curso,Long> {
}
