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
public class ArithmeticMethods2 {

     public static void main (String args[]){
        Integer x;
        Integer y;
        Scanner datos  = new Scanner (System.in);
        x = datos.nextInt();
        y = datos.nextInt();
        
        displayNumberPlus10(x,y);
        displayNumberPlus100(x,y);
        displayNumberPlus1000(x,y);
    }
    
    public static void displayNumberPlus10 (Integer x, Integer y){
        x = x+10;
        y = y+10;
        System.out.println("x = "+x+" y = "+y);
    }
    
    public static void displayNumberPlus100 (Integer x, Integer y){
        x = x+100;
        y = y+100;
        System.out.println("x = "+x+" y = "+y);
    }
    
    public static void displayNumberPlus1000 (Integer x, Integer y){
        x = x+1000;
        y = y+1000;
        System.out.println("x = "+x+" y = "+y);
    }
    
}
