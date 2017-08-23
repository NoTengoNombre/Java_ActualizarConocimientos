/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t4objetos.herencia;

/**
 *
 * @author Portatil_Bot
 */
public class FIguraGeometrica {

    String color;

    /**
     *
     * Metodos que seran heredados por las clases hijas
     *
     * @param s
     */
    public void setColor(String s) {
        color = s;
    }

    /**
     * Metodos que seran heredados por las clases hijas
     *
     * @return
     */
    public String getColor() {
        return color;
    }
    
    

    public static void main(String[] args) {

        Circulo c = new Circulo(2);
        Rectangulo r = new Rectangulo(4, 7);

        c.setColor("Rojo");
        r.setColor("Verde");

        System.out.println("El circulo es de color : " + c.getColor());
        System.out.println("Area del circulo : " + c.area());
        System.out.println("El rectangulo es de color : " + r.getColor());
        System.out.println("Area del rectangulo es : " + r.area());
    }
}
