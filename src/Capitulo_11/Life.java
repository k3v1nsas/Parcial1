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
public class Life extends Insurance{
    private Double cost;
	
	public Life(String ins) {
		super(ins);
		setMonthCost(196.00);
		// Como Llamar Otro Constuctor; por default hay que llamar al del Padre....
	}


	@Override
	public void setMonthCost(Double monthCost) {
		cost = monthCost;
		
	}

	@Override
	public void display() {
		
		System.out.println( " \n Tipo de Seguro : \t " + getClass().getSimpleName()  );
		System.out.println( " Costo Mensual : \t $ " + cost );
		
	}
    
}
