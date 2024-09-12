package main.java.service;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.CarreraReporteDTO;
import main.java.entity.Carrera;
import java.util.List;

public interface ICarreraService {
    void save(Carrera carrera);
    List<CarreraInscriptosDTO> findCarrerasWithInscritos();
    List<CarreraReporteDTO> obtenerReporteCarrerasPorAnio();
}
