package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Teacher;
import com.cesde.proyecto_integrador.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Optional<Teacher> update(Long id, Teacher teacher) {
        if (teacherRepository.existsById(id)) {
            teacher.setId(id);
            return Optional.of(teacherRepository.save(teacher));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }
}