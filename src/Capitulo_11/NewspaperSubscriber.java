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
public abstract class NewspaperSubscriber {
    private String direccion;
	private Double rate;
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Double getRate() {
		return rate;
	}
	
	public abstract void setRate( Double cost );
	
	
	public boolean equals( NewspaperSubscriber nps ) {
		
		if ( direccion.equals(nps.direccion ) ) {
			System.out.println( " The Same Street Adress already Exist!. \n " );
		}
		
		return super.equals(nps);
	}
	
	
	
	public abstract String toString();
    
}
