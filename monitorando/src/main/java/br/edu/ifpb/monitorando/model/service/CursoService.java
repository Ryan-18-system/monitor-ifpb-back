package br.edu.ifpb.monitorando.model.service;

import br.edu.ifpb.monitorando.model.entity.Curso;
import br.edu.ifpb.monitorando.model.repository.CursoIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoIF cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

}
