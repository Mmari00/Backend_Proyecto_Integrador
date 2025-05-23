package com.cesde.proyecto_integrador.model;

import java.util.List;

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
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "fecha", nullable = false, length = 20)
    private String fecha;

    @Column(name = "hora_inicio", nullable = false, length = 20)
    private String horaInicio;

    @Column(name = "hora_fin", nullable = false, length = 20)
    private String horaFin;

    @Column(name = "salon", nullable = false, length = 20)
    private String salon;

    // @OneToMany(mappedBy = "classEntity")
    // private List<Assistence> assistances;

    // @ManyToOne
    // @JoinColumn(name = "teacher_id", nullable = false)
    // private Teacher teacher;
    

    
    
    
}
