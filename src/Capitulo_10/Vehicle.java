/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_10;

/**
 *
 * @author Sergio
 */
public class Vehicle {
    private Integer nWheels;
	private Double miles;
	
	
	public Vehicle( Integer w, Double miles ) {
		
		nWheels = w;
		this.miles = miles;
		
	}
	
	
	public Integer getnWheels() {
		return nWheels;
	}

	public void setnWheels(Integer nWheels) {
		this.nWheels = nWheels;
	}

	public Double getMiles() {
		return miles;
	}

	public void setMiles(Double miles) {
		this.miles = miles;
	}

    @Override
	public String toString() {
		
		return " Number of Wheels : " + nWheels + " " + " Miles : " + miles;
		
	}
    
}
