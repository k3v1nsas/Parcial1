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

public class Dollars {
    public static void main(String[] args) {
        //Declaracion de variable principal
        int cant;
        Scanner entrada = new Scanner(System.in);
        //Solicitud del dato
        System.out.println("Ingrese la cantidad de dolares a convertir");
        cant = entrada.nextInt();
        //Declaracion de las variables que ayudaran
        int m20,m10,m5,m1,aux;
        aux=cant;//Se usa aux para mostrar al final los datos mas bonitos
        m20=cant/20;//Cantidad de monedas de 20
        cant%=20;//Se asigna el nuevo valor a cant restando las monedas de 20
        m10=cant/10;//Cantidad de monedas de 10
        cant%=10;//Se asigna el nuevo valor a cant restando las monedas de 10
        m5=cant/5;//Cantidad de monedas de 15
        cant%=5;//Se asigna el nuevo valor a cant restando las monedas de 5
        m1=cant;//Cantidad de monedas de 1
        //Muestra de resultados
        System.out.println("Sus "+aux+" dollars equivalen a \n "+
                m20+" monedas de 20\n "+
                m10+" monedas de 10\n "+
                m5+" monedas de 5\n "+
                m1+" monedas de 1");
    }
}
