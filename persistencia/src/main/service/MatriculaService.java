package main.service;

import main.entity.Estudiante;
import main.entity.Matricula;
import java.util.List;

public interface MatriculaService {
    void save(Matricula matricula);
    List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad);
}
