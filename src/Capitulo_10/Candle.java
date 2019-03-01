/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_10;

/**
 *
 * @author Sergio
 */
public class Candle {
    private Colors color;
    private Double altura;
    public Double precio;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        precio = altura *2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public static void main(String[] args) {
         Candle vela = new Candle();
		vela.setAltura(2.2);
		vela.setColor(Colors.AZUL);
		
		ScentedCandle aromatica = new ScentedCandle();
		aromatica.setAltura(4.0);
		aromatica.setColor(Colors.AMARILLO);
		aromatica.setScent(Escencia.EUCALIPTO);
		
		System.out.println( " Vela Normal : \n " );
		System.out.println( " El Color de la vela es : \t " + vela.getColor() );
		System.out.println( " La Altura de la Vela es : \t " + vela.getAltura() );
		System.out.println( " El Precio de la Vela es : \t $ " + vela.getPrecio() );
		
		System.out.println( " \n Vela Aromatica : \n " );
		System.out.println( " El Color de la vela Aromatica es : \t " + aromatica.getColor() );
		System.out.println( " LA Escencia de la Vela Aromatica es : \t " + aromatica.getScent() );
		System.out.println( " La Altura de la Vela Aromatica es : \t " + aromatica.getAltura() );
		System.out.println( " El Precio de la Vela Aromatica  es : \t $ " + aromatica.getPrecio() );
    }
    
}
