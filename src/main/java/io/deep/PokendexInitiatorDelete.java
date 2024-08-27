package io.deep;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokendexInitiatorDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("funkopop");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	Pokemon p=entityManager.find(Pokemon.class, "pikachu");
        
        System.out.println(p);
        
        if(p!=null) {
        	p.setPower(100);
        	entityTransaction.begin();
            entityManager.remove(p);
            entityTransaction.commit();
        }else {
        	System.out.println("Entity doesn't exits");
        }

	}

}
