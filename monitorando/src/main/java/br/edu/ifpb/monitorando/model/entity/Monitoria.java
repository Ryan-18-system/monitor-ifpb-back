package br.edu.ifpb.monitorando.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_monitorias")
@Data
@EqualsAndHashCode()
public class Monitoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @OneToMany
    @JoinColumn(name = "aluno_id")
    private List<Aluno> alunos;

    @Column()
    private String horario;

    @Column()
    private String sala;
}
