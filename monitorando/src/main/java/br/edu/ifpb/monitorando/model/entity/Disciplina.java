package br.edu.ifpb.monitorando.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_disciplinas")
@Data
@EqualsAndHashCode()
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String nome;

    @Column()
    private String Professor;

    @Column()
    @ManyToOne
    @JoinColumn(name = "pk_curso_id")
    private Curso curso;

    @Column()
    @OneToMany
    @JoinColumn(name = "pk_monitor_id")
    private List<Monitoria> monitores;
}
