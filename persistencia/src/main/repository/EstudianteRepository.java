package main.repository;

import main.dto.EstudianteCarreraDTO;
import main.entity.Estudiante;

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

    public List<EstudianteCarreraDTO> obtenerEstudiantesPorCarreraYCiudad(String nombreCarrera, String ciudad) {
        String jpql = "SELECT new com.ejemplo.registro.dto.EstudianteCarreraDTO(e.nombres, e.apellido, e.ciudadResidencia, c.nombre) " +
                "FROM Estudiante e JOIN e.inscripciones i JOIN i.carrera c " +
                "WHERE c.nombre = :nombreCarrera AND e.ciudadResidencia = :ciudad";
        return em.createQuery(jpql, EstudianteCarreraDTO.class)
                .setParameter("nombreCarrera", nombreCarrera)
                .setParameter("ciudad", ciudad)
                .getResultList();
    }
}
