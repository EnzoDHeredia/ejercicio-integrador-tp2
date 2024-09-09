package main.dao;

import main.entity.Estudiante;
import java.util.List;

public interface EstudianteDAO {
    void save(Estudiante estudiante);
    List<Estudiante> findAllOrderedByApellido();
    Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria);
    List<Estudiante> findByGenero(String genero);
}
