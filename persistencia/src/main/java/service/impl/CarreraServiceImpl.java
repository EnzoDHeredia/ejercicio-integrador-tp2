package main.java.service.impl;

import main.java.entity.Carrera;
import main.java.repository.CarreraRepository;
import main.java.service.CarreraService;

import javax.persistence.EntityManager;
import java.util.List;

public class CarreraServiceImpl implements CarreraService {

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
    public List<Object[]> findCarrerasWithInscritos() {
        return List.of();
    }

    @Override
    public List<Object[]> generarReporteCarreras() {
        return List.of();
    }
}
