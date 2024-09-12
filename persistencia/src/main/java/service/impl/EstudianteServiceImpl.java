package main.java.service.impl;

import main.java.dto.EstudianteCarreraDTO;
import main.java.entity.Estudiante;
import main.java.repository.CarreraRepository;
import main.java.repository.EstudianteRepository;
import main.java.service.EstudianteService;

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
        return estudianteRepo.findAllOrderedByApellido();
    }

    @Override
    public Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria) {
        return estudianteRepo.findByLibretaUniversitaria(numeroLibretaUniversitaria);
    }

    @Override
    public List<Estudiante> findByGenero(String genero) {
        return estudianteRepo.findByGenero(genero);
    }

    @Override
    public List<EstudianteCarreraDTO> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return estudianteRepo.findEstudiantesByCarreraAndCiudad(carrera,ciudad);
    }
}
