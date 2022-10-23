package br.edu.ifpb.monitorando.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_cursos")
@Data
@EqualsAndHashCode()
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String nomeCurso;

    @Column(length = 255)
    private String coordenador;


}
