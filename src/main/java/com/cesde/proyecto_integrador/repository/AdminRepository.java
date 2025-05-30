package com.cesde.proyecto_integrador.repository;

import com.cesde.proyecto_integrador.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
