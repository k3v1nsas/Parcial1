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

public class DogBoarding {
    public static void main(String[] args) {
        //Declaracion de cantidad de libras y dias
        float lb;
        int dias;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud de los datos a ocupar
        System.out.print("Ingrese la cantidad de libras que pesa el perro: ");
        lb = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de dias: ");
        dias = entrada.nextInt();
        //Calculo del monto a pagar
        float costo = (0.5f*lb)*dias;
        //muestra de resultado
        System.out.println("El precio total es: $"+costo);
    }
}
