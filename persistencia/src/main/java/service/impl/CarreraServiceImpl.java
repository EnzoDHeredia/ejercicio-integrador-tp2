package main.java.service.impl;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.EstudiantesInscriptosGraduadosDTO;
import main.java.entity.Carrera;
import main.java.service.ICarreraService;
import main.java.util.AbstractFactory;
import java.util.List;

public class CarreraServiceImpl implements ICarreraService {


    private AbstractFactory repositorio; //mas abs

    public CarreraServiceImpl() {
        repositorio = AbstractFactory.getFactory();
    }

    @Override
    public void save(Carrera carrera) {
        repositorio.getCarreraRepository().save(carrera);
    }

    @Override
    public List<CarreraInscriptosDTO> findCarrerasWithInscritos() {
        return repositorio.getCarreraRepository().findCarrerasWithInscritos();
    }

    @Override
    public List<EstudiantesInscriptosGraduadosDTO> obtenerReporteInscriptosGraduadosCarrera() {
        return repositorio.getCarreraRepository().obtenerReporteInscriptosGraduadosCarrera();
    }

}
