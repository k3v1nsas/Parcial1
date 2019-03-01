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
public class Eggs {
    public static void main(String[] args) {
        //Declaracion de cantidad de huevos
        int eggs;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud de la cantidad de huevos
        System.out.print("Dame la cantidad de huevos: ");
        eggs = entrada.nextInt();        
        
        //Variables para obtener la cantidad de docenas y sueltos
        int docena;
        int suelto;
        //Aplicacion de las respectivas operaciones
        docena = eggs/12;
        suelto= eggs%12;
        //Calculo del total a pagar
        float total;
        total=(docena*3.25f)+(suelto*0.45f);
        
        //Muestra de resultados
        System.out.println("Usted pidio "+eggs+" huevos/n"+
                "Eso es: "+docena+" a $3.25 y "+suelto+
                " huevo(s) suelto(s) a $.45 que hacen un total de $"+total);
        
    }
}
