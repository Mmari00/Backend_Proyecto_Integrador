package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Assistance;
import com.cesde.proyecto_integrador.service.AssistanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assistances")
public class AssistanceController {

    @Autowired
    private AssistanceService assistanceService;

    @GetMapping
    public List<Assistance> getAllAssistances() {
        return assistanceService.getAllAssistances();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assistance> getAssistanceById(@PathVariable Long id) {
        return assistanceService.getAssistanceById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/student/{studentId}")
    public List<Assistance> getByStudentId(@PathVariable Long studentId) {
        return assistanceService.getAssistancesByStudentId(studentId);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<Assistance> getByTeacherId(@PathVariable Long teacherId) {
        return assistanceService.getAssistancesByTeacherId(teacherId);
    }

    @PostMapping
    public Assistance createAssistance(@RequestBody Assistance assistance) {
        return assistanceService.createAssistance(assistance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Assistance> update(@PathVariable Long id, @RequestBody Assistance assistance) {
        Assistance updated = assistanceService.updateAssistance(id, assistance);
        return updated != null
            ? ResponseEntity.ok(updated)
            : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        assistanceService.deleteAssistance(id);
        return ResponseEntity.noContent().build();
    }
}