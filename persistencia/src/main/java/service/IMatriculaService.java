package main.java.service;

import main.java.dto.MatriculasDTO;
import main.java.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
    void save(Matricula matricula);
    List<MatriculasDTO> findAll();
    Matricula findById(int id);
    void update(Matricula matricula);
    void delete(Matricula matricula);
}
