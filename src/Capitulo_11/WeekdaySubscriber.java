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
public class WeekdaySubscriber extends NewspaperSubscriber{
    
    	private Double costo;
	private Subscription sub;
	
	public WeekdaySubscriber() {

		setRate(3.50);
		
	}

	public Subscription getSub() {
		return sub;
	}

	public void setSub(Subscription sub) {
		this.sub = sub;
	}




	@Override
	public String toString() {

		return " Direccion : " + getDireccion() + " Cuota : $" + costo + " \n Tipo de Servicio : " + sub + " \n ";
	}

	@Override
	public void setRate(Double cos) {
		
		costo = cos;
	}
	
	
}
