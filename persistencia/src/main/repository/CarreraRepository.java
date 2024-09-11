package main.repository;

import main.dto.CarreraInscriptosDTO;
import main.dto.CarreraReporteDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CarreraRepository {

    private EntityManager em;

    public CarreraRepository(EntityManager em) {
        this.em = em;
    }

    public List<CarreraInscriptosDTO> obtenerCarrerasOrdenadasPorInscriptos() {
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
