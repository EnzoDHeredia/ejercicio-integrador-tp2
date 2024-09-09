package main.service;

import main.entity.Carrera;
import java.util.List;

public interface CarreraService {
    void save(Carrera carrera);
    List<Object[]> findCarrerasWithInscritos();
    List<Object[]> generarReporteCarreras();
}
