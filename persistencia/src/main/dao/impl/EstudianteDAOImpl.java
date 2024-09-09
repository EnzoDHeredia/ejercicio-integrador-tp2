package main.dao.impl;

import main.dao.EstudianteDAO;
import main.entity.Estudiante;

import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO {
    @Override
    public void save(Estudiante estudiante) {

    }

    @Override
    public List<Estudiante> findAllOrderedByApellido() {
        return List.of();
    }

    @Override
    public Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria) {
        return null;
    }

    @Override
    public List<Estudiante> findByGenero(String genero) {
        return List.of();
    }
}
