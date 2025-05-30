package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Student;
import com.cesde.proyecto_integrador.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> update(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setId(id);
            return Optional.of(studentRepository.save(student));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
