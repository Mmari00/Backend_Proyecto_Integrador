package com.cesde.proyecto_integrador.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.proyecto_integrador.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
    // List<Course> findByTeacherId(Long teacherId);
    

}
