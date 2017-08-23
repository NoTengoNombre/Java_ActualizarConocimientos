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
public class Rectangulo extends FIguraGeometrica {

    private double base, altura;

    /**
     *
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @return
     */
    public double area() {
        return base * altura;
    }

    /**
     *
     * @return
     */
    public double perimetro() {
        return 2 * (base * altura);
    }

}
