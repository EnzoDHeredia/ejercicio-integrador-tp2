package main.dao;

import main.entity.Estudiante;
import main.entity.Matricula;
import java.util.List;

public interface MatriculaDAO {
    void save(Matricula matricula);
    List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad);
}
