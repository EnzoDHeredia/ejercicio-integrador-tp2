package main.service.impl;

import main.entity.Estudiante;
import main.entity.Matricula;
import main.service.MatriculaService;

import java.util.List;

public class MatriculaServiceImpl implements MatriculaService {
    @Override
    public void save(Matricula matricula) {

    }

    @Override
    public List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return List.of();
    }
}
