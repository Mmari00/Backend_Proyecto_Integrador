package com.cesde.proyecto_integrador.model;


import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name = "assistence")
public class Assistence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha; 

    @Column(name = "hora", nullable = false)
    private LocalTime hora; 

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    // @ManyToOne
    // @JoinColumn(name = "class_id", nullable = false)
    // private Class class1;

    // @ManyToOne
    // @JoinColumn(name = "student_id", nullable = false)
    // private Student student;
    

}
