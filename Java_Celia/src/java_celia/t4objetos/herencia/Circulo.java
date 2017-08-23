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
public class Circulo extends FIguraGeometrica {

    private double radio;

    public Circulo(double r) {
        radio = r;
    }

    public double area() {
        return 3.14 * radio * radio;
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }
}
