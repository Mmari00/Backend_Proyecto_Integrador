package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Class;
import com.cesde.proyecto_integrador.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getAll() {
        return classRepository.findAll();
    }

    public Optional<Class> getById(Long id) {
        return classRepository.findById(id);
    }

    public Class create(Class classObj) {
        return classRepository.save(classObj);
    }

    public Optional<Class> update(Long id, Class classObj) {
        if (classRepository.existsById(id)) {
            classObj.setId(id);
            return Optional.of(classRepository.save(classObj));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        classRepository.deleteById(id);
    }
}