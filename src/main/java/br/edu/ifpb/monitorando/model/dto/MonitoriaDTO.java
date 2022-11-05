package br.edu.ifpb.monitorando.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MonitoriaDTO {
    private List<String> alunos = new ArrayList<>();
    private String disciplina;
    private String horario;
    private String sala;

    public void setUmAluno(String nome){
        alunos.add(nome);
    }
}
