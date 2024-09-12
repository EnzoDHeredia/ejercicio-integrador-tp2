package main.java.service;

import main.java.entity.Carrera;
import java.util.List;

public interface CarreraService {
    void save(Carrera carrera);
    List<Object[]> findCarrerasWithInscritos();
    List<Object[]> generarReporteCarreras();
}
