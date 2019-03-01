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
public class MetricConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner datos = new Scanner(System.in);
       Integer d;
       d = datos.nextInt();
       pulgadas(d);
       galones(d);
    }
    
    public static void pulgadas(Integer a){
        System.out.println("en "+a+" pulgadas hay "+ a*2.54 + " centimetros");
    }
    
    public static void galones(Integer b){
        System.out.println("en "+b+ " galones hay "+ b*3.7854 + " litros");
    }
}
