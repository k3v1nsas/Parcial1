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
public class Novella extends Story{
    Integer aux;
	
	public Novella(String ti, String nom, Integer pages) {
		super(ti, nom, pages);
		
		setPagesNumber(pages);

	}
	
	@Override
	public void setPagesNumber(Integer pagesNumber) {
	
		if ( pagesNumber < 50 ) {
			
			aux = 50 - pagesNumber;
			setMessage( " " + aux + " Paginas Deben ser Agregadas Para Calificar Como Novella. \n " );
			
		}
		
		if ( pagesNumber > 100 ) {
			
			aux = pagesNumber - 100;
			setMessage( " " + aux + " Paginas Deben ser Cortadas Para Calificar Como Novella. \n " );
			
		}
		
		else {
			setMessage( " " );
		}
			
			
		
	}
    
}
