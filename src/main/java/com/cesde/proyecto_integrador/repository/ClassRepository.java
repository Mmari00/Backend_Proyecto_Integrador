package com.cesde.proyecto_integrador.repository;

import com.cesde.proyecto_integrador.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
    
}
