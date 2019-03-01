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
public class MotorCycle extends Vehicle{
    public MotorCycle(Integer w, Double miles) throws MotorCycleWheelInvalidException {
		super(2, miles);
		
		
		if ( getnWheels() != 2 ) {
			
			throw new MotorCycleWheelInvalidException( "\nLa Moto Solo Puede Tener 2 Llantas!. \n " );
			
			
		}
		
		
	}
}
