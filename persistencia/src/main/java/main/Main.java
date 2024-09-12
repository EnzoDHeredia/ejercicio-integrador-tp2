package main.java.main;

import main.java.entity.Carrera;
import main.java.entity.Matricula;
import main.java.service.CarreraService;
import main.java.service.impl.CarreraServiceImpl;
import main.java.util.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = ConnectionFactory.getEntityManager();

        CarreraService carreraService = new CarreraServiceImpl(em);

        //List<Matricula> matriculas = null;
        //Carrera carrera = new Carrera("Filosofia", matriculas);

        //carreraService.save(carrera);
        em.close();
    }
}