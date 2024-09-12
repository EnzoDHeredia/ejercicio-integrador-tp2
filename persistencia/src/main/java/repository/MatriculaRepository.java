package main.java.repository;

import main.java.entity.Matricula;

import javax.persistence.EntityManager;

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
