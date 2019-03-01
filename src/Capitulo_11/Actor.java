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
public class Actor implements Player {

	public void play() {
		
		System.out.println( " \n La Interface es un Contrato que Acuerda la Implementacion \n " + 
		"de Todos los Metodos Abstractos que Contenga. En este Caso es play(). " );
		System.out.println( " La Interface es Implementada y es Llamada Desde Actor. \n " );
		
	}
    
}
