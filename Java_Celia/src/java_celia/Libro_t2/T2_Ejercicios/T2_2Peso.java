/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

public class T2_2Peso {

    private double libras;
    private double onzas;
    private double kg;

    public T2_2Peso(double peso, double k, double l, double o) {
        this.libras = 0.002204623 * peso;
        this.onzas = 0.3527396 / peso;
        this.kg = 1000 * peso;
    }

    public double getLibras() {
        return libras;
    }

    public double getKg() {
        return kg;
    }

    public double getOnzas() {
        return onzas;
    }

    public static void main(String[] args) {

        T2_2Peso p = new T2_2Peso(10, 10, 10, 10);
        double kg1 = p.getKg();
        double lb1 = p.getLibras();
        double oz1 = p.getOnzas();
        System.out.println(kg1);
        System.out.println(lb1);
        System.out.println(oz1);
    }
}
