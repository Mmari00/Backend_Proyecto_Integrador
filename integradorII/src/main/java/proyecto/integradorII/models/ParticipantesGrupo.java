package proyecto.integradorII.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "participantes_grupo")
public class ParticipantesGrupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_grupo", nullable = false)
    private Long idGrupo;

    @JoinColumn(name = "id_estudiante", nullable = false)
    private Long idEstudiante;

    @Column(name = "estado_participacion")
    private  String estadoEstudiante;

    public ParticipantesGrupo(Long id, Long idGrupo, Long idEstudiante, String estadoEstudiante) {
        this.id = id;
        this.idGrupo = idGrupo;
        this.idEstudiante = idEstudiante;
        this.estadoEstudiante = estadoEstudiante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(String estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    


}
