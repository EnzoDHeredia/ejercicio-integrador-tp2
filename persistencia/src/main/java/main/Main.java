package main.java.main;

import main.java.dto.EstudiantesInscriptosGraduadosDTO;
import main.java.dto.MatriculasDTO;
import main.java.service.ICarreraService;
import main.java.service.IEstudianteService;
import main.java.service.IMatriculaService;
import main.java.service.impl.CarreraServiceImpl;
import main.java.service.impl.EstudianteServiceImpl;
import main.java.service.impl.MatriculaServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ICarreraService carreraService = new CarreraServiceImpl("persistJPA");
        IEstudianteService estudianteService = new EstudianteServiceImpl("persistJPA");

        IMatriculaService matriculaService = new MatriculaServiceImpl("persistJPA");

        List<MatriculasDTO> matriculasDTOS = matriculaService.findAll();

        for (MatriculasDTO est : matriculasDTOS) {
            System.out.println(est);
        }

        //Recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
        //List<CarreraInscriptosDTO> e = carreraService.findCarrerasWithInscritos();

        //List<EstudiantesInscriptosGraduadosDTO> e = carreraService.obtenerReporteInscriptosGraduadosCarrera();

        /*
        List<Estudiante> e = estudianteService.findByGenero("M");
        System.out.println("Estudiantes Masculinos: ");
        */

        /*
        List<EstudianteCarreraDTO> estDto = estudianteService.findEstudiantesByCarreraAndCiudad("Ingeniería de Sistemas", "Jujuy");
        System.out.println("Estudiante de  y de la ciudad : ");
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
/*
        for (CarreraInscriptosDTO est : e) {
            System.out.println(est);
        }*/


        /*
        for (EstudiantesInscriptosGraduadosDTO est : e) {
            System.out.println(est);
        }
         */
    }

    public void printMenu(Scanner sc) {
        System.out.println("-------Menu------");
        System.out.println("1. Dar alta a un estudiante.");
        System.out.println("2. Matricular un estuadiante a una carrera.");
        System.out.println("3. Buscar estudiantes.");
        System.out.println("4. Reporte de las carreras.");
        System.out.println("5. Salir.");
    }
}