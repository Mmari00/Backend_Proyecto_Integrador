package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Team;
import com.cesde.proyecto_integrador.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    public Optional<Team> getById(Long id) {
        return teamRepository.findById(id);
    }

    public Team create(Team team) {
        return teamRepository.save(team);
    }

    public Optional<Team> update(Long id, Team team) {
        if (teamRepository.existsById(id)) {
            team.setId(id);
            return Optional.of(teamRepository.save(team));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}