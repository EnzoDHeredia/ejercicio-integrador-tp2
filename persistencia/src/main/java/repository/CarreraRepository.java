package main.java.repository;

import main.java.dto.CarreraInscriptosDTO;
import main.java.entity.Carrera;
import main.java.dto.EstudiantesInscriptosGraduadosDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CarreraRepository{

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
        String jpql = "SELECT new main.java.dto.CarreraInscriptosDTO(c.nombre, COUNT(m)) " +
                "FROM Carrera c JOIN c.matriculas m " +
                "GROUP BY c.nombre " +
                "ORDER BY COUNT(m) DESC";
        return em.createQuery(jpql, CarreraInscriptosDTO.class).getResultList();
    }

    public List<EstudiantesInscriptosGraduadosDTO> obtenerReporteInscriptosGraduadosCarrera() {
        String jpql = "SELECT new main.java.dto.EstudiantesInscriptosGraduadosDTO(e.nombres, e.apellido, e.numeroLibretaUniversitaria, c.nombre, m.graduado, m.fechaInscripcion) " +
                "FROM Matricula m " +
                "JOIN m.estudiante e " +
                "JOIN m.carrera c " +
                "ORDER BY YEAR(m.fechaInscripcion) ASC, c.nombre ASC";
        return em.createQuery(jpql, EstudiantesInscriptosGraduadosDTO.class).getResultList();
    }

    public List<Carrera> findAllCarreras(){
        String jpql = "SELECT c FROM Carrera c";
        return em.createQuery(jpql, Carrera.class).getResultList();
    }

    public void delete(Carrera carrera){
        em.getTransaction().begin();
        em.remove(carrera);
        em.getTransaction().commit();
    }

    public void update(Carrera carrera){
        em.getTransaction().begin();
        em.merge(carrera);
        em.getTransaction().commit();
    }

    public Carrera findCarreraById(int id){
        return em.find(Carrera.class, id);
    }
}
