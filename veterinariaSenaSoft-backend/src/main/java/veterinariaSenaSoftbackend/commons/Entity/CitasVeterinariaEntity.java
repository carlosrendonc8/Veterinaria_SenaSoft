package veterinariaSenaSoftbackend.commons.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
@Entity
@Table( name = "gestion_de_citas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CitasVeterinariaEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre_animal")
    private String nombreAnimal;

    @Column(name = "sintomas_animal")
    private String sintomasAnimal;

    @Column(name = "estado_cita")
    private String estado;

    @Column(name = "fecha_cita")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCita;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getSintomasAnimal() {
        return sintomasAnimal;
    }

    public void setSintomasAnimal(String sintomasAnimal) {
        this.sintomasAnimal = sintomasAnimal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }
}