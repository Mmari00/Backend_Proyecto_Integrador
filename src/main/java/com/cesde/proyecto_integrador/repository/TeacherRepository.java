package com.cesde.proyecto_integrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.proyecto_integrador.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findByAdminId(Long adminId);

}
