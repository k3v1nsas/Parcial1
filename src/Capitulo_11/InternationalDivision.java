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
public class InternationalDivision extends Division{
    private String country;  
	private String languaje;
	
	// Igual Seria Mejor un enum, para cada campo;
	//pero serian muy largos con muchos paises e idiomas....
	
	
	public InternationalDivision(String n, Integer cuen, String coun, String len ) {
		super(n, cuen);
		
		country = coun;
		languaje = len;
		
	}

	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLenguaje() {
		return languaje;
	}

	public void setLenguaje(String lenguaje) {
		languaje = lenguaje;
	}



	public void display() {
		
		System.out.println( " \n Kind of Company : \t " + getClass().getSimpleName() );
		System.out.println( " Name Company : \t " + getName() );
		System.out.println( " Number of Account : \t " + getNumber() );
		System.out.println( " Country Located : \t " + country );
		System.out.println( " Language Spoken : \t " + languaje ); 
		
		
		
	}
}
