package main.dao;

import main.entity.Carrera;
import java.util.List;

public interface CarreraDAO {
    void save(Carrera carrera);
    List<Object[]> findCarrerasWithInscritos();
    List<Object[]> generarReporteCarreras();
}
