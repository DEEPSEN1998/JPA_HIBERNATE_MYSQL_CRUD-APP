package io.deep;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorCreate {
    public static void main(String args[]) {
    	Pokemon p1= new Pokemon();
    	p1.setName("pikachu");
    	p1.setType("Electrical");
    	p1.setPower(420);
    	
    	Pokemon p2= new Pokemon();
    	p2.setName("onix");
    	p2.setType("Rock");
    	p2.setPower(500);
    	
    	Pokemon p3= new Pokemon();
    	p3.setName("charmeleon");
    	p3.setType("Fire");
    	p3.setPower(400);
    	
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("funkopop");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	
    	entityTransaction.begin();
    	entityManager.persist(p1);
    	entityManager.persist(p2);
    	entityManager.persist(p3);
    	entityTransaction.commit();
    	
    }
}
