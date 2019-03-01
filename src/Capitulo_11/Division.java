/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_11;

/**
 *
 * @author Sergio
 */
public abstract class Division {
    private String name;
	private Integer number;
	
	public Division( String n, Integer cuen ) {
		
		name = n;
		number = cuen;
		
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}




	public abstract void display();
	
	
	
}
