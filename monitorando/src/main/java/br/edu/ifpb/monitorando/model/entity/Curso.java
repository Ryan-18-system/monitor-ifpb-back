package br.edu.ifpb.monitorando.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_cursos")
@Data
@EqualsAndHashCode()
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String cursoCod;

    @Column(length = 255)
    private String coordenador;

    @OneToMany
    @JoinColumn(name = "pk_disciplina_id")
    private List<Disciplina> disciplinas;

}
