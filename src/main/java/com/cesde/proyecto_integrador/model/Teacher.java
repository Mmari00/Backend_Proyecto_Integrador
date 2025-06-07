package com.cesde.proyecto_integrador.model;

import java.util.List;

import jakarta.persistence.CascadeType;
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

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    // private List<Course> courses;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Assistance> assistance;

}
