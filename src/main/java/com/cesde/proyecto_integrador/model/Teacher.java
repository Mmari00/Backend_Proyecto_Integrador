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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "teachers")
@JsonIgnoreProperties({"admin_id"})
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String contraseña;

    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private List<Assistance> assistances;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = true) 
    private Admin admin;
}