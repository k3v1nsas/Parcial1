/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class TestState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        State st = new State();
        Scanner datos =  new Scanner (System.in);
        System.out.println("datos del estado: \nnombre: ");
        String edo = datos.nextLine();
        st.setedo(edo);
        System.out.println("poblacion: ");
        Integer po = datos.nextInt();
        st.setpoblacion(po);
        datos.nextLine();
        System.out.println("datos de la capital: \nnombre: ");
        String cap = datos.nextLine();
        System.out.println("poblacion: ");
        Integer pob = datos.nextInt();
        st.setc1(cap, pob);
        datos.nextLine();
        System.out.println("datos de la ciudad mas poblada: \nnombre: ");
        String ccap = datos.nextLine();
        System.out.println("poblacion: ");
        Integer cpob = datos.nextInt();
        st.setc2(ccap, cpob);
        
        System.out.println("\ndatos del estado: \nnombre: "+st.getedo()+
                "\npoblacion: "+st.getpoblacion());
        System.out.println("datos de la capital: \nnombre: " +st.getc1()+
                "\npoblacion: "+st.getpc1());
        System.out.println("datos de la ciudad mas poblada: \nnombre: " +st.getc2()+
                "\npoblacion: "+st.getpc2());
        
    }
    
}
