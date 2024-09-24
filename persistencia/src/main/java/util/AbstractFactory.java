package main.java.util;

import main.java.repository.CarreraRepository;
import main.java.repository.EstudianteRepository;
import main.java.repository.MatriculaRepository;


public abstract class AbstractFactory {
    private static final String persistJPA = "persistJPA";


    public AbstractFactory(){
    }

    public static AbstractFactory getFactory(String type) {
        if (type.equals(persistJPA)) {
            return JPAFactory.getInstance();
        } else if ("MySQL".equalsIgnoreCase(type)) {
            // Aquí podrías agregar la lógica para otras fábricas como MySQL, SQLite, etc.
            System.out.println("MySQL");
            return null;
        }
        throw new IllegalArgumentException("Tipo de fábrica no soportado: " + type);
    }

    public static AbstractFactory getFactory() {
        return getFactory(persistJPA);
    }

    public abstract CarreraRepository getCarreraRepository();
    public abstract EstudianteRepository getEstudianteRepository();
    public abstract MatriculaRepository getMatriculaRepository();
}
