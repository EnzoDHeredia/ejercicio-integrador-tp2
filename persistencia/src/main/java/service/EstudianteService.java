package main.java.service;

import main.java.entity.Estudiante;
import java.util.List;

public interface EstudianteService {
    void save(Estudiante estudiante);
    List<Estudiante> findAllOrderedByApellido();
    Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria);
    List<Estudiante> findByGenero(String genero);
    List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad);
}
