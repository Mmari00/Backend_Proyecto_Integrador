package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Assistance;
import com.cesde.proyecto_integrador.service.AssistanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/assistances")
public class AssistanceController {

    private final AssistanceService assistanceService;

    public AssistanceController(AssistanceService assistanceService) {
        this.assistanceService = assistanceService;
    }

    @GetMapping
    public List<Assistance> getAll() {
        return assistanceService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assistance> getById(@PathVariable Long id) {
        Optional<Assistance> assistance = assistanceService.getById(id);
        return assistance.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Assistance create(@RequestBody Assistance assistance) {
        return assistanceService.create(assistance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Assistance> update(@PathVariable Long id, @RequestBody Assistance assistance) {
        Optional<Assistance> updatedAssistance = assistanceService.update(id, assistance);
        return updatedAssistance.map(ResponseEntity::ok)
                                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        assistanceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}