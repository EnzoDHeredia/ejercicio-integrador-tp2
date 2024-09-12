package main.repository;

import main.entity.Matricula;

import javax.persistence.EntityManager;
import java.util.List;

public class MatriculaRepository {

    private EntityManager em;

    public MatriculaRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Matricula matricula) {
        em.getTransaction().begin();
        em.persist(matricula);
        em.getTransaction().commit();
    }
}
