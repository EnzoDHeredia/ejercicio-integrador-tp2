package main.java.service.impl;

import main.java.dto.MatriculasDTO;
import main.java.entity.Matricula;
import main.java.service.IMatriculaService;
import main.java.util.AbstractFactory;

import java.util.List;


public class MatriculaServiceImpl implements IMatriculaService {

    private AbstractFactory matriculaRepo;

    public MatriculaServiceImpl(String type) {
        matriculaRepo = AbstractFactory.getFactory(type);
    }

    @Override
    public void save(Matricula matricula) {
        matriculaRepo.getMatriculaRepository().save(matricula);
    }

    @Override
    public List<MatriculasDTO> findAll() {
        return matriculaRepo.getMatriculaRepository().findAll();
    }

    @Override
    public Matricula findById(int id) {
        return matriculaRepo.getMatriculaRepository().findById(id);
    }

    @Override
    public void update(Matricula matricula) {
        matriculaRepo.getMatriculaRepository().update(matricula);
    }

    @Override
    public void delete(Matricula matricula) {
        matriculaRepo.getMatriculaRepository().delete(matricula);
    }

}
