package main.service;

import main.entity.Estudiante;
import java.util.List;

public interface EstudianteService {
    void save(Estudiante estudiante);
    List<Estudiante> findAllOrderedByApellido();
    Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria);
    List<Estudiante> findByGenero(String genero);
}
