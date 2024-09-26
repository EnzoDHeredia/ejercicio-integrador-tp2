package main.java.service.impl;

import main.java.dto.EstudianteCarreraDTO;
import main.java.entity.Estudiante;
import main.java.service.IEstudianteService;
import main.java.util.AbstractFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class EstudianteServiceImpl implements IEstudianteService {

    private AbstractFactory estudianteRepo;

    public EstudianteServiceImpl(String type) {
        this.estudianteRepo = AbstractFactory.getFactory(type);
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteRepo.getEstudianteRepository().save(estudiante);
    }

    @Override
    public List<Estudiante> findAllOrderedByApellido() {
        return estudianteRepo.getEstudianteRepository().findAllOrderedByApellido();
    }

    @Override
    public Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria) {
        return estudianteRepo.getEstudianteRepository().findByLibretaUniversitaria(numeroLibretaUniversitaria);
    }

    @Override
    public List<Estudiante> findByGenero(String genero) {
        return estudianteRepo.getEstudianteRepository().findByGenero(genero);
    }

    @Override
    public List<EstudianteCarreraDTO> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return estudianteRepo.getEstudianteRepository().findEstudiantesByCarreraAndCiudad(carrera,ciudad);
    }

    @Override
    public void deleteEstudiante(Estudiante estudiante) {
        estudianteRepo.getEstudianteRepository().deleteEstudiante(estudiante);
    }

    @Override
    public void updateEstudiante(Estudiante estudiante) {
        estudianteRepo.getEstudianteRepository().updateEstudiante(estudiante);
    }
}
