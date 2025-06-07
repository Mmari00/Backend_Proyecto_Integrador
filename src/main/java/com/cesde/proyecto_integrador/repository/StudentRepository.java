package com.cesde.proyecto_integrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.proyecto_integrador.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByAdminId(Long adminId);
    List<Student> findByTeacherId(Long teacherId);
    List<Student> findByCourseId(Long courseId);
    
    
}
