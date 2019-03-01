/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_10;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class LexuryCarRental extends CarRental{

    public LexuryCarRental(String name, Integer zC, VehicleSize vS, Integer d) {
        super(name, zC, vS, d);
    }
    Scanner sc = new Scanner(System.in);
	Double wikiRenta = 0.0, total = 0.00, costoChofer = 0.00;
	String answer = null;

    @Override
    public void display() {
        
		System.out.println( " Renter Name : \t " + getRenterName() + " \n " );
		System.out.println( " Zip Code : \t " + getZipCode() + " \n " );
		System.out.println( " Vehicle Size : \t " + getSize() + " \n " );
		System.out.println( " Daily Rental : \t $ " + wikiRenta + " \n " );
		System.out.println( " Days of Rental : \t " + getDays() + " \n " );
		System.out.println( " Added Chauffeur? : \t " + answer + " \n " );
		System.out.println( " Cost Chauffeur : \t $ " + costoChofer + " \n " );
		System.out.println( " Total : \t $ " + total );
    }

    @Override
    public void setDailyRental(Double dailyRental) {
       wikiRenta = getDays() * 79.99;
    }
    private void question() {
		
		System.out.println( " \n Desea Agregar con un Minimo Costo. \n Con la Cuota Minima de $200.00 un Chofer? " );
		answer = sc.nextLine();
		
		if ( answer.equals("Si") || answer.equals("si") ) {
			
			costoChofer = (double) (getDays() * 200);
			total = wikiRenta + costoChofer;
			
		} else if ( answer.equals("No") || answer.equals("no") ) {
			
			total = wikiRenta;
			
		} else {
			System.out.println( " Ha Ingresado una Opcion Incorrecta. \n Solo Si/No. \n " );
		}
        
        
}
}
