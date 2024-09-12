package main.resources;

import main.entity.Carrera;
import main.entity.Matricula;
import main.service.CarreraService;
import main.service.impl.CarreraServiceImpl;
import main.util.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = ConnectionFactory.getEntityManager();

        CarreraService carreraService = new CarreraServiceImpl(em);

        List<Matricula> matriculas = null;
        Carrera carrera = new Carrera("Filosofia", matriculas);

        carreraService.save(carrera);
        em.close();
    }
}