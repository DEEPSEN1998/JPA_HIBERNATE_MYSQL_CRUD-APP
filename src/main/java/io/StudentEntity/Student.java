package io.StudentEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Column(name="STD_NAME" ,nullable=false) 
	private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int RollNo;
    
    @OneToOne(fetch = FetchType.LAZY)
    private StudentIdCard card;
    
    
    
    
	public StudentIdCard getCard() {
		return card;
	}
	public void setCard(StudentIdCard card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
    
    
}
