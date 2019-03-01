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
public class Novel extends Story{
    Integer aux;
	
	public Novel(String ti, String nom, Integer pages) {
		super(ti, nom, pages);
		
		setPagesNumber(pages);
		
	}


	@Override
	public void setPagesNumber(Integer pagesNumber) {
		
		if ( pagesNumber < 100 ) {
			
			aux = 100 - pagesNumber;
			
			setMessage( " " + aux + " Paginas Deben ser Agregadas Para Calificar Como Novela. \n " );
			
		}
		
		else
		setMessage( " " );
		
		
	}

}
