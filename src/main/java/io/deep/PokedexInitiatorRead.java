package io.deep;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("funkopop");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
        Pokemon p=entityManager.find(Pokemon.class, "pickachu");
        
        System.out.println(p);
	}

}
