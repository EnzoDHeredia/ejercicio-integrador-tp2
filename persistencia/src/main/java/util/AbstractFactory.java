package main.java.util;

import main.java.repository.CarreraRepository;
import main.java.repository.EstudianteRepository;
import main.java.repository.MatriculaRepository;


public abstract class AbstractFactory {

    public AbstractFactory(){
    }

    public static AbstractFactory getFactory(String type) {
        if ("persistJPA".equalsIgnoreCase(type)) {
            return JPAFactory.getInstance();
        } else if ("persistMySQL".equalsIgnoreCase(type)) {
            // Aquí podrías agregar la lógica para otras fábricas como MySQL, SQLite, etc.
            System.out.println("MySQL");
            return null;
        }
        throw new IllegalArgumentException("Tipo de fábrica no soportado: " + type);
    }

    public abstract CarreraRepository getCarreraRepository();
    public abstract EstudianteRepository getEstudianteRepository();
    public abstract MatriculaRepository getMatriculaRepository();
}
