package main.dao.impl;

import main.dao.CarreraDAO;
import main.entity.Carrera;

import java.util.List;

public class CarreraDAOImpl implements CarreraDAO {
    @Override
    public void save(Carrera carrera) {

    }

    @Override
    public List<Object[]> findCarrerasWithInscritos() {
        return List.of();
    }

    @Override
    public List<Object[]> generarReporteCarreras() {
        return List.of();
    }
}
