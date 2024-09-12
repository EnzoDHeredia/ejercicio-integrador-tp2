package main.java.entity;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Column(name = "fecha_inscripcion")
    private LocalDate fechaInscripcion; // años de estudio

    private Boolean graduado; // true si está graduado

    //Construtor
    public Matricula() {
    }

    public Matricula(Boolean graduado, LocalDate fechaInscripcion, Carrera carrera, Estudiante estudiante) {
        this.graduado = graduado;
        this.fechaInscripcion = fechaInscripcion;
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

    public LocalDate getInscripcion() {
        return fechaInscripcion;
    }

    public void setInscripcion(LocalDate inscripcion) {
        this.fechaInscripcion = inscripcion;
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

