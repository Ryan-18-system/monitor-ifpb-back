package br.edu.ifpb.monitorando.controller;

import br.edu.ifpb.monitorando.model.dto.CursoDTO;
import br.edu.ifpb.monitorando.model.entity.Curso;
import br.edu.ifpb.monitorando.model.service.CursoService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoRest {

    @Autowired
    private CursoService cursoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<CursoDTO>> getCursos(){
        List<CursoDTO> cursos = this.cursoService.listarCursos();
        if(cursos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }
}
