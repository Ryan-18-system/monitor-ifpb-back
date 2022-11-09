package br.edu.ifpb.monitorando.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_monitorias")
@Data
@EqualsAndHashCode()
public class Monitoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Disciplina disciplina;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Aluno> alunos;

    @Column()
    private String horario;
    @Column()
    private String diasDaSemana;
    @Column()
    private String sala;
}
