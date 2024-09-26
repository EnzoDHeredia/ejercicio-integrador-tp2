package main.java.service;

import main.java.dto.CarreraInscriptosDTO;
import main.java.entity.Carrera;
import main.java.dto.EstudiantesInscriptosGraduadosDTO;
import java.util.List;

public interface ICarreraService {
    void save(Carrera carrera);
    List<CarreraInscriptosDTO> findCarrerasWithInscritos();
    List<EstudiantesInscriptosGraduadosDTO> obtenerReporteInscriptosGraduadosCarrera();
    List<Carrera> findAllCarreras();
    void delete(Carrera carrera);
    void update(Carrera carrera);
    Carrera findCarreraById(Long id);
}
