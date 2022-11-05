package br.edu.ifpb.monitorando.controller;

import br.edu.ifpb.monitorando.model.dto.MonitoriaDTO;
import br.edu.ifpb.monitorando.model.service.MonitoriaService;
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
@RequestMapping("/monitorias")
public class MonitoriaRest {
    @Autowired
    private MonitoriaService monitoriaService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<MonitoriaDTO>> getAllMonitorias(){
        List<MonitoriaDTO> monitoriaDTOS = monitoriaService.getAllMonitorias();
        if(monitoriaDTOS.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(monitoriaDTOS,HttpStatus.OK);
    }
}
