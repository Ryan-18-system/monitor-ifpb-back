package br.edu.ifpb.monitorando.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class CursoDTO {
    private String nomeCurso;
    private String coordenador;
    private List<String> disciplinas;

}
