package br.edu.ifpb.monitorando.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class DisciplinaDTO {
    private String nome;
    private String professor;
    private String abrevCurso;
}
