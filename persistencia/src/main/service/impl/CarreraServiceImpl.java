package main.service.impl;

import main.entity.Carrera;
import main.service.CarreraService;

import java.util.List;

public class CarreraServiceImpl implements CarreraService {
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
