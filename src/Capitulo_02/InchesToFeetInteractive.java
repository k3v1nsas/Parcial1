/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_02;


import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float pulgada=(float).08333;
        float a  ;
        float res;
        
        Scanner datos = new Scanner (System.in);
        System.out.println("ingrese las pulgadas a convertir");
        a = datos.nextInt();
        res= a*pulgada;
        System.out.println(+a +" pulgadas es igual a " +res);
    }
    
}
