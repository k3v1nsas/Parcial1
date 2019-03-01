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
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        //Variable para °F
        float gF;
        Scanner entrada = new Scanner(System.in);
        //Solicitud del dato a usar
        System.out.print("Dame la cantidad de grados Fahrenheit: ");
        gF= entrada.nextFloat();
        //Declaracion de la variable para °Celsius
        float celsius;
        //Calculo con la formula dada
        celsius = (gF-32)*(0.55556f);
        //Muestra de resultados
        System.out.println("Sus "+gF+" °F son equivalentes a "+celsius+" °Celsius");
        
    }
}
