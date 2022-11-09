package br.edu.ifpb.monitorando.model.service;

import br.edu.ifpb.monitorando.model.dto.DisciplinaDTO;
import br.edu.ifpb.monitorando.model.entity.Disciplina;
import br.edu.ifpb.monitorando.model.repository.DisciplinaIF;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaIF disciplinaRepository;

    public List<DisciplinaDTO> disciplinasPorCurso(String nome){
        List<Disciplina> disciplinas = disciplinaRepository.pesquisarDisciplinasDoCurso(nome);
        List<DisciplinaDTO> dtoList = new ArrayList<>();
        for(Disciplina d : disciplinas){
            DisciplinaDTO disciplinaDTO = new DisciplinaDTO();
            BeanUtils.copyProperties(d,disciplinaDTO);
            dtoList.add(disciplinaDTO);
        }
        return dtoList;
    }

    public List<DisciplinaDTO> getAllDisciplinas(){
        List<Disciplina> disciplinas = disciplinaRepository.findAll();
        List<DisciplinaDTO> listDTO = new ArrayList<>();
        for(Disciplina d: disciplinas){
            DisciplinaDTO dto = new DisciplinaDTO();
            BeanUtils.copyProperties(d,dto);
            listDTO.add(dto);
        }
        return listDTO;
    }
}
