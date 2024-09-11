package main.service.impl;

import main.entity.Estudiante;
import main.repository.CarreraRepository;
import main.repository.EstudianteRepository;
import main.service.EstudianteService;
import main.util.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {

    private EntityManager em;
    private CarreraRepository carreraRepo;
    private EstudianteRepository estudianteRepo;

    public EstudianteServiceImpl(EntityManager em) {
        this.em = em;
        this.estudianteRepo = new EstudianteRepository(em);
        this.carreraRepo = new CarreraRepository(em);
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteRepo.save(estudiante);
    }

    @Override
    public List<Estudiante> findAllOrderedByApellido() {
        return List.of();
    }

    @Override
    public Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria) {
        return null;
    }

    @Override
    public List<Estudiante> findByGenero(String genero) {
        return List.of();
    }

    @Override
    public List<Estudiante> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return List.of();
    }
}
