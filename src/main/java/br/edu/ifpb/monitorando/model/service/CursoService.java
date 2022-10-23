package br.edu.ifpb.monitorando.model.service;

import br.edu.ifpb.monitorando.model.dto.CursoDTO;
import br.edu.ifpb.monitorando.model.entity.Curso;
import br.edu.ifpb.monitorando.model.entity.Disciplina;
import br.edu.ifpb.monitorando.model.repository.CursoIF;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoIF cursoRepository;

    public List<Curso> listarCursos() {

        List<Curso> cursos = cursoRepository.findAll();
        return cursos;

    }

}
