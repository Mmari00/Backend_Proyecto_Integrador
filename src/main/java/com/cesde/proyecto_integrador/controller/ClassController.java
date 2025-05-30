package com.cesde.proyecto_integrador.controller;

import com.cesde.proyecto_integrador.model.Class;
import com.cesde.proyecto_integrador.service.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/classes")
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping
    public List<Class> getAll() {
        return classService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> getById(@PathVariable Long id) {
        Optional<Class> classObj = classService.getById(id);
        return classObj.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Class create(@RequestBody Class classObj) {
        return classService.create(classObj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Class> update(@PathVariable Long id, @RequestBody Class classObj) {
        Optional<Class> updatedClass = classService.update(id, classObj);
        return updatedClass.map(ResponseEntity::ok)
                           .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        classService.delete(id);
        return ResponseEntity.noContent().build();
    }
}