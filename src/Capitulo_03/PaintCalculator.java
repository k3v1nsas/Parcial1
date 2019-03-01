/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_03;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class PaintCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner (System.in);
        Integer ancho;
        Integer largo;
        Integer alto;
        ancho = datos.nextInt();
        largo = datos.nextInt();
        alto = datos.nextInt();
        
        System.out.println("para pintar una habitacion de "+ancho+" pies de ancho, "+ largo +" pies de largo "+
                alto + " pies de alto se necesitan $"+
                gastos(area(ancho, largo, alto)));
    }
    
    public static int area (Integer x, Integer y, Integer z){
        return (x*z*2)+(y*z*2);
    }
    
    public static double gastos(Integer area){
        return (area/350)*32;
    }
}
