package io.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentTable");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
       // Student s1 =entityManager.find(Student.class, 1);
        
        //System.out.println(s1.getName()+"   "+s1.getCard().getSoftwareVersion()+"  "+s1.getCard().getCardNumber());
        
       // StudentIdCard c1=entityManager.find(StudentIdCard.class, 3);
        
       // System.out.println(c1.getStudent().getName()+" "+c1.getStudent().getRollNo()+" "+c1.getCardNumber());
        
        Course cc1=entityManager.find(Course.class, 5);
        
        System.out.println(cc1.getCourseName()+"  "+cc1.getStudent().getName());

	}

}
