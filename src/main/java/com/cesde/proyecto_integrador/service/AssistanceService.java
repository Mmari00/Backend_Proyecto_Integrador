package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Assistance;
import com.cesde.proyecto_integrador.repository.AssistanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssistanceService {

   @Autowired
    private AssistanceRepository assistanceRepository;

    public List<Assistance> getAllAssistances() {
        return assistanceRepository.findAll();
    }

    public Optional<Assistance> getAssistanceById(Long id) {
        return assistanceRepository.findById(id);
    }



    public Assistance createAssistance(Assistance assistance) {
        return assistanceRepository.save(assistance);
    }

    public Assistance updateAssistance(Long id, Assistance updatedAssistance) {
        return assistanceRepository.findById(id).map(assistance -> {
            assistance.setFecha(updatedAssistance.getFecha());
            assistance.setHora(updatedAssistance.getHora());
            assistance.setEstado(updatedAssistance.getEstado());
            // assistance.setStudent(updatedAssistance.getStudent());
            // assistance.setTeacher(updatedAssistance.getTeacher());
            return assistanceRepository.save(assistance);
        }).orElse(null);
    }

    public void deleteAssistance(Long id) {
        assistanceRepository.deleteById(id);
    }
}