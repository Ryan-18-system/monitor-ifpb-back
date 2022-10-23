package br.edu.ifpb.monitorando.model.repository;

import br.edu.ifpb.monitorando.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoIF extends JpaRepository<Curso,Long> {
    List<Curso> findAll();

}
