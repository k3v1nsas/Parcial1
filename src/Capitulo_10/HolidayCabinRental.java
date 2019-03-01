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
public class HolidayCabinRental extends CabinRental{
    public HolidayCabinRental(Integer cabina ) {
		super(cabina);
		
		if ( cabina <= 3 )
			super.weeklyRental  += 150;
			else{
		super.weeklyRental +=150;
			
		
		}
	}
    public static void main(String[] args) {
        CabinRental cabina1 = new CabinRental(5);
		CabinRental cabina2 = new CabinRental(3);
		HolidayCabinRental cabina3 = new HolidayCabinRental(3);
		HolidayCabinRental cabina4 = new HolidayCabinRental(2);
		HolidayCabinRental cabina5 = new HolidayCabinRental(10);
		
		System.out.println( " El Numero de Cabina es : " + cabina1.getCabinNumber() + "   " +  
				" El Costo de la Cabina es : $ " + cabina1.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina2.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina2.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina3.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina3.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina4.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina4.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina5.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina5.getWeeklyRental() );
		
    }
}
