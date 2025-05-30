package com.cesde.proyecto_integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesde.proyecto_integrador.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
