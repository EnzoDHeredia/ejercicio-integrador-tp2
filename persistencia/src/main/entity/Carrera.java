package main.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;

    // Constructor
    public Carrera() {
        //super();
    }

    public Carrera(String nombre, List<Matricula> matriculas) {
        //super();
        this.nombre = nombre;
        this.matriculas = matriculas;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public Long getId() {
        return id;
    }
}

