package main.java.entity;

import javax.persistence.*;

@Entity
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;

    private Integer antiguedad; // años de estudio
    private Boolean graduado; // true si está graduado

    //Construtor
    public Matricula() {
    }

    public Matricula(Boolean graduado, Integer antiguedad, Carrera carrera, Estudiante estudiante) {
        this.graduado = graduado;
        this.antiguedad = antiguedad;
        this.carrera = carrera;
        this.estudiante = estudiante;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public Boolean getGraduado() {
        return graduado;
    }

    public void setGraduado(Boolean graduado) {
        this.graduado = graduado;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

