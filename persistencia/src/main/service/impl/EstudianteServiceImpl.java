package main.service.impl;

import main.entity.Estudiante;
import main.service.EstudianteService;

import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {
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
