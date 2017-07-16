package java_celia.Libro_t2.T2_Ejercicios;

/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */

public class T2_2Conversor_divisas {

    private double tipoCambio;

    public T2_2Conversor_divisas() {
        tipoCambio = 0.85;
    }

    public T2_2Conversor_divisas(double tc) {
        tipoCambio = tc;
    }

    public double eurosToLibras(double e) {
        return e * tipoCambio;
    }

    public double libraToEuros(double d) {
        return d / tipoCambio;
    }

    public void setTipoCambio(double tc) {
        tipoCambio = tc;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

}
