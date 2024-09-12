package main.java.repository;

import main.java.dto.EstudianteCarreraDTO;
import main.java.entity.Estudiante;

import javax.persistence.EntityManager;
import java.util.List;

public class EstudianteRepository {

    private EntityManager em;

    public EstudianteRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Estudiante estudiante) {
        em.getTransaction().begin();
        em.persist(estudiante);
        em.getTransaction().commit();
    }

    public List<Estudiante> findAllOrderedByApellido(){
        String jpql = "SELECT e FROM Estudiante e ORDER BY e.apellido ASC";
        return em.createQuery(jpql, Estudiante.class).getResultList();
    }

    public Estudiante findByLibretaUniversitaria(String numeroLibretaUniversitaria){
        return em.find(Estudiante.class, numeroLibretaUniversitaria);
    }

    public List<Estudiante> findByGenero(String genero){
        String jpql = "SELECT e FROM Estudiante e WHERE e.genero = :genero";
        return em.createQuery(jpql, Estudiante.class)
                .setParameter("genero", genero)
                .getResultList();
    }

    public List<EstudianteCarreraDTO> findEstudiantesByCarreraAndCiudad(String nombreCarrera, String ciudad) {
        String jpql = "SELECT new main.java.dto.EstudianteCarreraDTO(e.nombres, e.apellido, e.ciudadResidencia, c.nombre) " +
                "FROM Matricula m " +
                "JOIN m.estudiante e " +
                "JOIN m.carrera c " +
                "WHERE c.nombre = :nombreCarrera AND e.ciudadResidencia = :ciudad";
        return em.createQuery(jpql, EstudianteCarreraDTO.class)
                .setParameter("nombreCarrera", nombreCarrera)
                .setParameter("ciudad", ciudad)
                .getResultList();
    }

}