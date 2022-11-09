package br.edu.ifpb.monitorando.model.service;

import br.edu.ifpb.monitorando.model.dto.AlunoDTO;
import br.edu.ifpb.monitorando.model.entity.Aluno;
import br.edu.ifpb.monitorando.model.repository.AlunoIF;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoIF alunoRepository;

    public List<AlunoDTO> getAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();
        List<AlunoDTO> dtoList = new ArrayList<>();
        for(Aluno aluno : alunos){
            AlunoDTO dto = new AlunoDTO();
            BeanUtils.copyProperties(aluno,dto);
            dtoList.add(dto);
        }
        return  dtoList;
    }
}
