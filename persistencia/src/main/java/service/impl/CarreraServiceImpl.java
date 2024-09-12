package main.java.service.impl;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.CarreraReporteDTO;
import main.java.entity.Carrera;
import main.java.repository.CarreraRepository;
import main.java.service.ICarreraService;

import javax.persistence.EntityManager;
import java.util.List;

public class CarreraServiceImpl implements ICarreraService {

    private EntityManager em;
    private CarreraRepository repositorio;

    public CarreraServiceImpl(EntityManager em) {
        this.em = em;
        repositorio = new CarreraRepository(em);
    }

    @Override
    public void save(Carrera carrera) {
        repositorio.save(carrera);
    }

    @Override
    public List<CarreraInscriptosDTO> findCarrerasWithInscritos() {
        repositorio.findCarrerasWithInscritos();
    }

    @Override
    public List<CarreraReporteDTO> obtenerReporteCarrerasPorAnio() {
        repositorio.obtenerReporteCarrerasPorAnio();
    }
}
