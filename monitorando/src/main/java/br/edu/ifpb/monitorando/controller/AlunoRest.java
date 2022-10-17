package br.edu.ifpb.monitorando.controller;

import br.edu.ifpb.monitorando.model.dto.AlunoDTO;
import br.edu.ifpb.monitorando.model.entity.Aluno;
import br.edu.ifpb.monitorando.model.service.AlunoService;
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
@RequestMapping("/alunos")
public class AlunoRest {

    @Autowired
    private AlunoService alunoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<AlunoDTO>>  getAlunot(){
        List<AlunoDTO> alunos = alunoService.getAlunos();
        if(alunos.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alunos,HttpStatus.OK);
    }

}
