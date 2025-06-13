package com.cesde.proyecto_integrador.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Table(name = "courses")
@Entity
@JsonIgnoreProperties({"admin_id", "teacher_id"})
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String codigo;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Assistance> assistances;

    @ManyToMany
    @JoinTable(
        name = "course_student",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = true)
    private Admin admin;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = true) 
    private Teacher teacher;
}