package com.cesde.proyecto_integrador.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "grupo", nullable = false, length = 20)
    private String grupo;
    
    @Column(name = "semestre", nullable = false, length = 20)
    private String semestre;

    @Column(name = "jornada", nullable = false, length = 20)
    private String jornada;

    @Column(name = "año", nullable = false)
    private int año;

    // @OneToMany(mappedBy = "team")
    // private List<Student> students;


}

