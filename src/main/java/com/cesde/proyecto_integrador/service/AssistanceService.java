package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Assistance;
import com.cesde.proyecto_integrador.repository.AssistanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssistanceService {

    private final AssistanceRepository assistanceRepository;

    public AssistanceService(AssistanceRepository assistanceRepository) {
        this.assistanceRepository = assistanceRepository;
    }

    public List<Assistance> getAll() {
        return assistanceRepository.findAll();
    }

    public Optional<Assistance> getById(Long id) {
        return assistanceRepository.findById(id);
    }

    public Assistance create(Assistance assistance) {
        return assistanceRepository.save(assistance);
    }

    public Optional<Assistance> update(Long id, Assistance assistance) {
        if (assistanceRepository.existsById(id)) {
            assistance.setId(id);
            return Optional.of(assistanceRepository.save(assistance));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        assistanceRepository.deleteById(id);
    }
}