package proyecto.integradorII.models;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_materia", nullable = false)
    private Long idMateria;

    @JoinColumn(name = "id_profesor", nullable = false)
    private Long idProfesor;

    @Column(name = "grupo", nullable = false, length = 20)
    private String grupo;

    @Column(name = "semestre", nullable = false, length = 20)
    private String semestre;

    @Column(name = "jornada", nullable = false, length = 20)
    private String jornada;

    @Column(name = "año", nullable = false)
    private int año;

    public Grupo(Long id, Long idMateria, Long idProfesor, Long idEstudiante, String grupo, String semestre,
            String jornada, int año) {
        this.id = id;
        this.idMateria = idMateria;
        this.idProfesor = idProfesor;
        this.grupo = grupo;
        this.semestre = semestre;
        this.jornada = jornada;
        this.año = año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }


    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

        
    



    
}
