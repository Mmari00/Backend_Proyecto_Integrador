package com.cesde.proyecto_integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.proyecto_integrador.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
    
}
