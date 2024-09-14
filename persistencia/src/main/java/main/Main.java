package main.java.main;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.EstudianteCarreraDTO;
import main.java.dto.EstudiantesInscriptosGraduadosDTO;
import main.java.entity.Carrera;
import main.java.entity.Estudiante;
import main.java.entity.Matricula;
import main.java.service.ICarreraService;
import main.java.service.IEstudianteService;
import main.java.service.IMatriculaService;
import main.java.service.impl.CarreraServiceImpl;
import main.java.service.impl.EstudianteServiceImpl;
import main.java.util.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = ConnectionFactory.getEntityManager();

        ICarreraService carreraService = new CarreraServiceImpl(em);
        IEstudianteService estudianteService = new EstudianteServiceImpl(em);

        List<CarreraInscriptosDTO> e = carreraService.findCarrerasWithInscritos();

        /*
        List<Estudiante> e = estudianteService.findByGenero("M");
        System.out.println("Estudiantes Masculinos: ");
        */


        for (CarreraInscriptosDTO est : e) {
            System.out.println(est);
        }

        /*
        List<EstudianteCarreraDTO> estDto = estudianteService.findEstudiantesByCarreraAndCiudad("Ingeniería de Sistemas", "Jujuy");
        System.out.println("Estudiante de  y de la ciudad : ");
        */

        /*
        for (Estudiante est : e) {
            System.out.println(est);
        }
         */

        /*
        Estudiante est = estudianteService.findByLibretaUniversitaria("LU014");
        System.out.println("Estudiante con libreta LU014: " + est);
        */

        /*
        List<Matricula> matriculas = null;
        Carrera carrera = new Carrera("Filosofia", matriculas);
        carreraService.save(carrera);
        */

        em.close();
    }
}