package br.edu.ifpb.monitorando.controller;

import br.edu.ifpb.monitorando.model.dto.DisciplinaDTO;
import br.edu.ifpb.monitorando.model.entity.Disciplina;
import br.edu.ifpb.monitorando.model.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaRest {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping(value = "/buscarDisciplinas/{nomeCurso}",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<DisciplinaDTO>> getDisciplinasPorCurso(@PathVariable String nomeCurso){
        List<DisciplinaDTO> disciplinas = disciplinaService.disciplinasPorCurso(nomeCurso);
        if (disciplinas == null || disciplinas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(disciplinas,HttpStatus.OK);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<DisciplinaDTO>> getAllDisciplinas(){
        List<DisciplinaDTO> disciplinas = disciplinaService.getAllDisciplinas();
        if (disciplinas == null || disciplinas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(disciplinas,HttpStatus.OK);
    }


}
