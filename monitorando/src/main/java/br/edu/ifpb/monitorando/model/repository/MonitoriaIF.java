package br.edu.ifpb.monitorando.model.repository;

import br.edu.ifpb.monitorando.model.entity.Monitoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitoriaIF  extends JpaRepository<Monitoria,Long> {
}
