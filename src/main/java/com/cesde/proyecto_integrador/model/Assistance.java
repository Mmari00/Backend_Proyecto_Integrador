package com.cesde.proyecto_integrador.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "assistance")
@JsonIgnoreProperties({"student_id", "teacher_id", "course_id"})
public class Assistance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = true) 
    private Student student;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = true) 
    private Teacher teacher;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = true) 
    private Course course;
}