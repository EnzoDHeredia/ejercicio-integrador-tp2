package main.java.service.impl;

import main.java.entity.Matricula;
import main.java.repository.MatriculaRepository;
import main.java.service.IMatriculaService;

import javax.persistence.EntityManager;

public class MatriculaServiceImpl implements IMatriculaService {

    private EntityManager em;
    private MatriculaRepository matriculaRepo;

    @Override
    public void save(Matricula matricula) {
        matriculaRepo.save(matricula);
    }

}
