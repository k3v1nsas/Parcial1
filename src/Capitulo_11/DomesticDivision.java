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
public class DomesticDivision extends Division{
    private String state;   //Pudiera ser enum pa Facilitar!.
	
	
	public DomesticDivision(String n, Integer cuen, String edo ) {
		super(n, cuen);
		
		state = edo;
		
	}
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	


	public void display() {
		
		System.out.println( " \n Kind of Company : \t " + getClass().getSimpleName() );
		System.out.println( " Name Company : \t " + getName() );
		System.out.println( " Number of Account : \t " + getNumber() );
		System.out.println( " State Located : \t " + state );
		
		
		
	}
    
}
