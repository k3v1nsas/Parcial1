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
public class ShortStory extends Story{
    Integer aux;
	
	public ShortStory(String ti, String nom, Integer pages) {
		super(ti, nom, pages);
		
		setPagesNumber(pages);
	
	}
	
	@Override
	public void setPagesNumber(Integer pagesNumber ) {
		
		if ( pagesNumber > 50 ) {
			
			aux = pagesNumber - 50;
			setMessage( " " + aux + " Paginas Deben ser Cortadas Para Calificar Como Historia Corta. \n ");
			
		}
		
		else
		setMessage( " " );
	
		
	}
}
