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
public class Car extends Vehicle{

    public Car(Integer w, Double miles) throws CarWheelInvalidException {
		super(4, miles);
		
		if( getnWheels() != 4 ) {
			
			throw new CarWheelInvalidException(" \nEl Auto Solo Puede Tener 4 Llantas!. \n " );
			
		}
		
	}

    public static void main(String[] args) {
        CarRental carro = new CarRental("Freed", 2100, VehicleSize.MID_SIZE, 4);
		carro.display();
		
		LexuryCarRental deLujo = new LexuryCarRental("Jordy", 4000, VehicleSize.MID_SIZE, 3);
		deLujo.display();
		LexuryCarRental lujo = new LexuryCarRental("Bob", 4010, VehicleSize.FULL_SIZE, 9);
		lujo.display(); 
    }
    
}
