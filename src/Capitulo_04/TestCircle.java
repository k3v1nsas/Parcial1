/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;

/**
 *
 * @author Sergio
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle a = new Circle();
	Circle b = new Circle();

        a.setRadio(10);
	b.setRadio(20);

        System.out.println("El area es "+ a.Area());
	System.out.println("El diametro es "+ a.getDiametro());

	System.out.println("El area es "+ b.Area());
	System.out.println("El diametro es "+ b.getDiametro());
    }
    
}
