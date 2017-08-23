/**
 * @created on : 23-ago-2017, 20:16:17
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4xobjetos.Ejercicios.Utilidades.matematicas;

public class Potenciar {

    private double num1;
    private double num2;

    public Potenciar() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Potenciar(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void potencia(int num1, int num2) {
        double x = (int) Math.pow(num1, num2);
        System.out.println("valor : " + x);
    }

    public void potencia(double num1, int num2) {
        double x = (int) Math.pow(num1, num2);
        System.out.println("valor : " + x);
    }

}
