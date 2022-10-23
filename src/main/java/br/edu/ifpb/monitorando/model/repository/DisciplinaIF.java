package br.edu.ifpb.monitorando.model.repository;


import br.edu.ifpb.monitorando.model.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaIF extends JpaRepository<Disciplina,Long> {
    @Query(value = "select d from Disciplina d where d.curso.nomeCurso = :nomeCurso")
    List<Disciplina> pesquisarDisciplinasDoCurso(String nomeCurso);
}
