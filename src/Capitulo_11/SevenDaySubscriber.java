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
public class SevenDaySubscriber extends NewspaperSubscriber{
    private Double costo;
	private Subscription subs;

	public SevenDaySubscriber() {
	
		setRate(4.50);
		
	}
	
	
	public Subscription getSubs() {
		return subs;
	}



	public void setSubs(Subscription subs) {
		this.subs = subs;
	}


	@Override
	public String toString() {
		
		return " Direccion : " + getDireccion() + " Cuota : $ " + costo + " \n Tipo de Servicio : " + subs + " \n "; 
	}




	@Override
	public void setRate(Double cost) {

		costo = cost;
		
	}

    
}
