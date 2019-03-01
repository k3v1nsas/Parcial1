/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

import Objeto.Fraccion;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Fracciones {
    public static void main(String[] args) {
        Objeto.Fraccion f1 = new Fraccion(1, 2);
        Objeto.Fraccion f2 = new Fraccion(1, 2);
        System.out.println(f1);
        System.out.println(f2);
        f1.agregar(f2);
         System.out.println(f1);
         if (f1.equals(f2)) {
             System.out.println("son iguales");
        }else{
             System.out.println("No son Iguales");
         }
         ArrayList<Fraccion> Fracciones = new ArrayList<>();
         Fracciones.add(f1);
         Fracciones.add(f2);
         
         Fraccion f4 = new Fraccion(3, 6);
         System.out.println(Fracciones.contains(f4));
        
         
    }
}
