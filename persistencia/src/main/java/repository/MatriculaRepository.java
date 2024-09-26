package main.java.repository;

import main.java.dto.EstudianteCarreraDTO;
import main.java.dto.MatriculasDTO;
import main.java.entity.Carrera;
import main.java.entity.Matricula;

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

    public List<MatriculasDTO> findAll(){
        String jpql = "SELECT new main.java.dto.MatriculasDTO(m.id, m.graduado, m.fechaInscripcion, c.nombre, c.id, e.apellido, e.nombres, e.id) " +
                "FROM Matricula m " +
                "JOIN m.estudiante e " +
                "JOIN m.carrera c ";
        return em.createQuery(jpql, MatriculasDTO.class)
                .getResultList();
    }

    public Matricula findById(int id){
        return em.find(Matricula.class, id);
    }

    public void update(Matricula matricula){
        em.getTransaction().begin();
        em.merge(matricula);
        em.getTransaction().commit();
    }
    public void delete(Matricula matricula){
        em.getTransaction().begin();
        em.remove(matricula);
        em.getTransaction().commit();
    }
}
