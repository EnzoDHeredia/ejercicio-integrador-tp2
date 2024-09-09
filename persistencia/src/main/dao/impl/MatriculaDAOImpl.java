package main.dao.impl;

import main.dao.MatriculaDAO;
import main.entity.Estudiante;
import main.entity.Matricula;

import java.util.List;

public class MatriculaDAOImpl implements MatriculaDAO {
    @Override
    public void save(Matricula matricula) {

    }

    @Override
    public List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return List.of();
    }
}
