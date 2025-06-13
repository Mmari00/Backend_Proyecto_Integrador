package com.cesde.proyecto_integrador.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesde.proyecto_integrador.model.Assistance;

@Repository
public interface AssistanceRepository extends JpaRepository<Assistance, Long> {
    // List<Assistance> findByStudentId(Long studentId);
    // List<Assistance> findByTeacherId(Long teacherId);
}
