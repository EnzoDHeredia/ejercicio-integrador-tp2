package main.java.util;

import main.java.repository.CarreraRepository;
import main.java.repository.EstudianteRepository;
import main.java.repository.MatriculaRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory extends AbstractFactory{
    private CarreraRepository carreraRepository;
    private EstudianteRepository estudianteRepository;
    private MatriculaRepository matriculaRepository;
    private static JPAFactory instance;
    private EntityManagerFactory emf;
    private EntityManager em;

    private JPAFactory() {
        super();
    }

    public static JPAFactory getInstance() {
        if (instance == null) {
            instance = new JPAFactory();
        }
        return instance;
    }

    // Metodo para conectar a la base de datos con JPA
    private EntityManager connect() {
        if (em == null) {
            this.emf = Persistence.createEntityManagerFactory("persistJPA");
            this.em = emf.createEntityManager();
        }
        return this.em;
    }

    //Metodo para desconectar la base de datos //preguntar donde deberiamos usarlo
    private void disconnect() {
        emf.close();
        em.close();
    }

    @Override
    public CarreraRepository getCarreraRepository() {
        if (carreraRepository == null) {
            carreraRepository = new CarreraRepository(connect());
        }
        return carreraRepository;
    }

    @Override
    public EstudianteRepository getEstudianteRepository() {
        if (estudianteRepository == null) {
            estudianteRepository = new EstudianteRepository(connect());
        }
        return estudianteRepository;
    }

    @Override
    public MatriculaRepository getMatriculaRepository() {
        if (matriculaRepository == null) {
            matriculaRepository = new MatriculaRepository(connect());
        }
        return matriculaRepository;
    }
}
