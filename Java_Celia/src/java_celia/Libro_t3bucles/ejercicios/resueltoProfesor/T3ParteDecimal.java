/**
 * @created on : 20-ago-2017, 21:41:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3ParteDecimal {

    private double numero;

    /**
     * Metodo para fijar valores
     *
     * @param n
     */
    public void setNumero(double n) {
        numero = n;
    }

    /**
     * Metodo para devolver valores
     *
     * @return numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     *
     * @return decimales
     */
    public boolean tieneDecimales() {

        boolean decimales;

//        if (numero == Math.round(numero)) {
//            decimales = false;
//        } else {
//            decimales = true;
//        }
        decimales = numero != Math.round(numero);
        return decimales;
    }
}
