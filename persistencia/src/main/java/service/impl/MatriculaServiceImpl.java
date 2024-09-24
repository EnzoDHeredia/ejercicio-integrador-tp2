package main.java.service.impl;

import main.java.entity.Matricula;
import main.java.service.IMatriculaService;
import main.java.util.AbstractFactory;

import javax.persistence.EntityManager;

public class MatriculaServiceImpl implements IMatriculaService {

    private AbstractFactory matriculaRepo;

    public MatriculaServiceImpl() {
        matriculaRepo = AbstractFactory.getFactory();
    }

    @Override
    public void save(Matricula matricula) {
        matriculaRepo.getMatriculaRepository().save(matricula);
    }

}
