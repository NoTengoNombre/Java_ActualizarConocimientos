/**
 * @created on : 23-ago-2017, 20:16:17
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4xobjetos.Ejercicios.Utilidades.matematicas;

public class Sumar {

//    Cada vez que creo un objeto , se genera una copia 
//    Donde se guardaran los valores que se le asignen a la variables
    private int num1;
    private int num2;

    /**
     *
     */
    public Sumar() {
        this.num1 = 0;
        this.num2 = 0;
    }

    /**
     *
     * @param num1
     * @param num2
     */
    public Sumar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    /**
     *
     *
     * @param num1
     * @param num2
     * @return
     */
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public int sumar(double num1, double num2) {
        return (int) (num1 + num2);
    }

}
