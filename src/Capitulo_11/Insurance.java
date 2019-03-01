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
public abstract class Insurance {
    
	private String insurance;
	private Double monthCost;
	
	public Insurance( String ins ) {
	
		insurance = ins;
		
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public Double getMonthCost() {
		return monthCost;
	}

	public abstract void setMonthCost(Double monthCost);

	public abstract void display();
	
    
}
