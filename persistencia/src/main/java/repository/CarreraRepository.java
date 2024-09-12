package main.java.repository;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.CarreraReporteDTO;
import main.java.entity.Carrera;

import javax.persistence.EntityManager;
import java.util.List;

public class CarreraRepository {

    private EntityManager em;

    public CarreraRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Carrera carrera) {
        em.getTransaction().begin();
        em.persist(carrera);
        em.getTransaction().commit();
    }

    //Recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
    public List<CarreraInscriptosDTO> findCarrerasWithInscritos() {
        String jpql = "SELECT new com.ejemplo.registro.dto.CarreraInscriptosDTO(c.nombre, COUNT(i)) " +
                "FROM Carrera c JOIN c.inscripciones i " +
                "GROUP BY c.nombre " +
                "ORDER BY COUNT(i) DESC";
        return em.createQuery(jpql, CarreraInscriptosDTO.class).getResultList();
    }

    public List<CarreraReporteDTO> obtenerReporteCarrerasPorAnio() {
        String jpql = "SELECT new com.ejemplo.registro.dto.CarreraReporteDTO(c.nombre, YEAR(i.fechaInscripcion), COUNT(i), " +
                "SUM(CASE WHEN i.graduado = true THEN 1 ELSE 0 END)) " +
                "FROM Carrera c JOIN c.inscripciones i " +
                "GROUP BY c.nombre, YEAR(i.fechaInscripcion) " +
                "ORDER BY c.nombre, YEAR(i.fechaInscripcion)";
        return em.createQuery(jpql, CarreraReporteDTO.class).getResultList();
    }
}
