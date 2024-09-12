package main.java.main;

import main.java.dto.EstudianteCarreraDTO;
import main.java.entity.Carrera;
import main.java.entity.Estudiante;
import main.java.entity.Matricula;
import main.java.service.CarreraService;
import main.java.service.EstudianteService;
import main.java.service.impl.CarreraServiceImpl;
import main.java.service.impl.EstudianteServiceImpl;
import main.java.util.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = ConnectionFactory.getEntityManager();

        CarreraService carreraService = new CarreraServiceImpl(em);
        EstudianteService estudianteService = new EstudianteServiceImpl(em);

        //List<Estudiante> e = estudianteService.findAllOrderedByApellido();

        /*
        List<Estudiante> e = estudianteService.findByGenero("M");
        System.out.println("Estudiantes Masculinos: ");
        */

        /*
        for (Estudiante est : e) {
            System.out.println(est);
        }*/

        List<EstudianteCarreraDTO> estDto = estudianteService.findEstudiantesByCarreraAndCiudad("Ingeniería de Sistemas", "Jujuy");
        System.out.println("Estudiante de  y de la ciudad : " + estDto);

        for (EstudianteCarreraDTO est : estDto) {
            System.out.println(est);
        }

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