package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This Class makes the connection to the database.
 */
public class EmfGetter {

    private EmfGetter(){}

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GuestsDB");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void closeEmf(){
        emf.close();
    }

}
