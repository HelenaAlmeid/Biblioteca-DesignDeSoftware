package entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

    Cliente c = new Cliente("julia", "11111");

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
	EntityManager em = emf.createEntityManager();
		
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
		
	em.close();
	emf.close();

    }
}
