package br.edu.ifpb.monitorando.model.service;

import br.edu.ifpb.monitorando.model.dto.MonitoriaDTO;
import br.edu.ifpb.monitorando.model.entity.Aluno;
import br.edu.ifpb.monitorando.model.entity.Monitoria;
import br.edu.ifpb.monitorando.model.repository.MonitoriaIF;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MonitoriaService {
    @Autowired
    private MonitoriaIF monitoriaRepository;

    public List<MonitoriaDTO> getAllMonitorias(){
        List<Monitoria> monitorias = monitoriaRepository.findAll();
        List<MonitoriaDTO> dtoList = new ArrayList<>();
        for(Monitoria m : monitorias){
            MonitoriaDTO dto = new MonitoriaDTO();
            BeanUtils.copyProperties(m,dto);
            dto.setDisciplina(m.getDisciplina().getNome());
            for(Aluno a : m.getAlunos()){
                dto.setUmAluno(a.getNome());
            }
            dtoList.add(dto);
        }
        return dtoList;

    }
}
