package proyecto.integradorII.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "asistencias")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_estudiante", nullable = false)
    private Long idEstudiante;

    @JoinColumn(name = "id_grupo", nullable = false)
    private Long idGrupo;

    @JoinColumn(name = "id_clase", nullable = false)
    private Long idClase;

    @Column(name = "fecha", nullable = false, length = 20)
    private String fecha;

    @Column(name = "hora", nullable = false, length = 20)
    private String hora;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    public Asistencia(Long id, Long idEstudiante, Long idGrupo, Long idClase, String fecha, String hora,
        String estado) {
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.idGrupo = idGrupo;
        this.idClase = idClase;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    

}
