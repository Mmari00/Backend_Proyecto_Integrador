package com.cesde.proyecto_integrador.service;

import com.cesde.proyecto_integrador.model.Student;
import com.cesde.proyecto_integrador.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> getStudentsByAdminId(Long adminId) {
        return studentRepository.findByAdminId(adminId);
    }

    public List<Student> getStudentsByTeacherId(Long teacherId) {
        return studentRepository.findByTeacherId(teacherId);
    }

    public List<Student> getStudentsByCourseId(Long courseId) {
        return studentRepository.findByCourseId(courseId);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setNombre(updatedStudent.getNombre());
            student.setAdmin(updatedStudent.getAdmin());
            student.setTeacher(updatedStudent.getTeacher());
            student.setCourse(updatedStudent.getCourse());
            return studentRepository.save(student);
        }).orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}