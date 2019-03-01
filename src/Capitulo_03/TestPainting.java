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
public class TestPainting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner (System.in);
        String t, a, m;
        double pre;
        
        Painting p = new Painting();
        Painting p1 = new Painting();
        Painting p2 = new Painting();
        
        System.out.println("ARTICULO: ");
        t = datos.nextLine();
        p.setTitulo(t);
        System.out.println("ARTISTA: ");
        a = datos.nextLine();
        p.setArtista(a);
        System.out.println("MEDIO: ");
        m = datos.nextLine();
        p.setMedio(m);
        System.out.println("PRECIO: ");
        pre = datos.nextDouble();
        p.setPrecio(pre);
        datos.nextLine();
        System.out.println("ARTICULO: ");
        t = datos.nextLine();
        p1.setTitulo(t);
        System.out.println("ARTISTA: ");
        a = datos.nextLine();
        p1.setArtista(a);
        System.out.println("MEDIO: ");
        m = datos.nextLine();
        p1.setMedio(m);
        System.out.println("PRECIO: ");
        pre = datos.nextDouble();
        p1.setPrecio(pre);
        
        System.out.println("Articulo: "+p.getTitulo());
        System.out.println("Artista: "+p.getArtista());
        System.out.println("Medio: "+p.getMedio());
        System.out.println("Precio: "+p.getPrecio());

        System.out.println("pieza 2: ");
        System.out.println("Articulo: "+p1.getTitulo());
        System.out.println("Artista: "+p1.getArtista());
        System.out.println("Medio: "+p1.getMedio());
        System.out.println("Precio: "+p1.getPrecio());
        
        System.out.println("Articulo: "+p2.getTitulo());
        System.out.println("Artista: "+p2.getArtista());
        System.out.println("Medio: "+p2.getMedio());
        System.out.println("Precio: "+p2.getPrecio());
        
        double comtot = p.comision()+p1.comision()+p2.comision();
        System.out.println("la tasa de comision es de: "+comtot);
    }
    
}
