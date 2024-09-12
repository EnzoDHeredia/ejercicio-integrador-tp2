package main.java.service;

import main.java.dto.EstudianteCarreraDTO;
import main.java.entity.Estudiante;
import java.util.List;

public interface IEstudianteService {
    void save(Estudiante estudiante);
    List<Estudiante> findAllOrderedByApellido();
    Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria);
    List<Estudiante> findByGenero(String genero);
    List<EstudianteCarreraDTO> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad);
}
