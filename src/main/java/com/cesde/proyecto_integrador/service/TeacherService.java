package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Teacher;
import com.cesde.proyecto_integrador.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

     @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

 
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        return teacherRepository.findById(id).map(teacher -> {
            teacher.setNombre(updatedTeacher.getNombre());
            // teacher.setAdmin(updatedTeacher.getAdmin());
            return teacherRepository.save(teacher);
        }).orElse(null);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

}