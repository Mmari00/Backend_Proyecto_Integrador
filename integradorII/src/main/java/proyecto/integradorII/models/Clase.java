package proyecto.integradorII.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "clases")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name = "id_profesor", nullable = false)
    private Long idProfesor;

    @JoinColumn(name = "id_grupo", nullable = false)
    private String idGrupo;

    @Column(name = "fecha", nullable = false, length = 20)
    private String fecha;

    @Column(name = "hora_inicio", nullable = false, length = 20)
    private String horaInicio;

    @Column(name = "hora_fin", nullable = false, length = 20)
    private String horaFin;

    @Column(name = "salon", nullable = false, length = 100)
    private String salon;

    public Clase(Long id, Long idProfesor, String idGrupo, String fecha, String horaInicio,
            String horaFin, String salon) {
        this.id = id;
        this.idProfesor = idProfesor;
        this.idGrupo = idGrupo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.salon = salon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    
}
