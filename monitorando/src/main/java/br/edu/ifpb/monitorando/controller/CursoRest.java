package br.edu.ifpb.monitorando.controller;

import br.edu.ifpb.monitorando.model.entity.Curso;
import br.edu.ifpb.monitorando.model.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoRest {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getCursos(){
        return this.cursoService.listarCursos();
    }
}
