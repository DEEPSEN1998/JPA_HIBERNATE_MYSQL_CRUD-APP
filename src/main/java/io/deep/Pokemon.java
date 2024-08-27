package io.deep;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //set entity as table
@Table(name="POKEMONS") // set table name
public class Pokemon {
	@Id //// set name as primary key
    @Column(name="POKEMON_NAME" ) // set tables attributes name
	private String name;
    @Column(name="POKEMON_TYPE") // set tables attributes name
	private String type;
    @Column(nullable=false) // set not null value
	private int power;
    @Column(name="POKEMON_COLOR")
    private int Color; 
	
	public int getColor() {
		return Color;
	}
	public void setColor(int color) {
		Color = color;
	}
	@Override
	public String toString() {
		return this.getName()+""+this.getType()+""+this.getPower();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
}
