package main.java.main;

import main.java.dto.CarreraInscriptosDTO;
import main.java.dto.EstudianteCarreraDTO;
import main.java.dto.EstudiantesInscriptosGraduadosDTO;
import main.java.dto.MatriculasDTO;
import main.java.entity.Carrera;
import main.java.entity.Estudiante;
import main.java.entity.Matricula;
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

        // ------------ SERVICIOS DE CARRERA --------------------

        //Recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
/*        List<CarreraInscriptosDTO> e = carreraService.findCarrerasWithInscritos();
        for (CarreraInscriptosDTO est : e) {
            System.out.println(est);
        }

 */
        //Generar reporte de las carreras, con los inscriptos y graduados de cada año (ordenado cronologicamente y alfabeticamente por el nombre de Carrera)
  /*      List<EstudiantesInscriptosGraduadosDTO> eig = carreraService.obtenerReporteInscriptosGraduadosCarrera();
        for (EstudiantesInscriptosGraduadosDTO est : eig) {
            System.out.println(est);
        }

   */
        //Recuperar todas las carreras
  /*      List<Carrera> c = carreraService.findAllCarreras();
        for (Carrera ca : c) {
            System.out.println(ca);
        }

   */
        //Recuperar una Carrera a partir de su ID
    /*    Carrera ci = carreraService.findCarreraById(1L);
        System.out.println(ci);

     */

        // ------------ SERVICIOS DE ESTUDIANTE --------------------

        //Recuperar todos los estudiantes, en base a su genero
    /*    List<Estudiante> estudiantes = estudianteService.findByGenero("M");
        System.out.println("Estudiantes Masculinos: ");
        for (Estudiante est : estudiantes) {
            System.out.println(est);
        }

     */

        //Recuperar los estudiantes de una determinada Carrera, filtrando por ciudad de residencia del estudiante
    /*    List<EstudianteCarreraDTO> estDto = estudianteService.findEstudiantesByCarreraAndCiudad("Ingeniería de Sistemas", "Jujuy");
        System.out.println("Estudiante de  y de la ciudad : ");
        for (EstudianteCarreraDTO est : estDto) {
            System.out.println(est);
        }

     */

        //Recuperar todos los estudiante utilizando un criterio de ordenamiento simple (por el apellido)
     /*   List<Estudiante> estA = estudianteService.findAllOrderedByApellido();
        for (Estudiante est : estA) {
            System.out.println(est);
        }

      */
        //Recuperar un estudiante por su numero de Libreta Universitaria
       /* Estudiante estudiante = estudianteService.findByLibretaUniversitaria("LU001");
        System.out.println(estudiante);

        */
        //Dar de alta un estudiante
        /*Estudiante e1 = new Estudiante("Enzo", "Heredia", 23, "M", "43247161", "Tandil", new ArrayList<Matricula>(), "LU035");
        estudianteService.save(e1);

         */

        // ------------ SERVICIOS DE Matricular --------------------

        //Recuperar todas las matriculas
       /* List<MatriculasDTO> matriculasDTOS = matriculaService.findAll();
        for (MatriculasDTO est : matriculasDTOS) {
            System.out.println(est);
        }

        */

        //Matricular un estuadiante a una carrera
       /* Estudiante e2 = estudianteService.findByLibretaUniversitaria("LU001");
        Carrera c3 = carreraService.findCarreraById(2L);
        Matricula m = new Matricula(c3, e2);
        matriculaService.save(m);
        
        */


    }
}