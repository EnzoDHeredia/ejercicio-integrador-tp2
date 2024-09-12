package main.service.impl;

import main.entity.Carrera;
import main.repository.CarreraRepository;
import main.service.CarreraService;
import main.util.ConnectionFactory;

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
