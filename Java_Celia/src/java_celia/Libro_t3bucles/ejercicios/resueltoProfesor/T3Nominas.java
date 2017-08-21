/**
 * @created on : 21-ago-2017, 19:19:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3Nominas {

    private double numHorasSemanales = 0;
    private double salarioHora = 0;

    public T3Nominas(double numHoras, double salario) {
        numHorasSemanales = numHoras;
        salarioHora = salario;
    }

    /**
     *
     * @return
     */
    public double getSalarioSemanal() {
        double salarioSemanal;

        if (numHorasSemanales > 45) {
            salarioSemanal = (40 * salarioHora) + (5 * salarioHora * 1.5) + ((numHorasSemanales - 45) * salarioHora * 2);
        } else if (numHorasSemanales > 40) {
            salarioSemanal = (40 * salarioHora) + ((numHorasSemanales - 40) * (salarioHora * 1.15));
        } else {
            salarioSemanal = numHorasSemanales * salarioHora;
        }
        return salarioSemanal;
    }

    /**
     *
     * @return
     */
    public double getSalarioBrutoMensual() {
        return getSalarioSemanal() * 4;
    }

    /**
     *
     * @return
     */
    public double getSalarioNetoMensual() {
        return getSalarioBrutoMensual() - getDescuentos();
    }

    /**
     *
     * @return
     */
    public double getDescuentos() {
        double descuentos;

        if (getSalarioBrutoMensual() <= 1000) {
            descuentos = getSalarioBrutoMensual() * 0.1;
        } else {
            descuentos = getSalarioBrutoMensual() * 0.15;
        }
        return descuentos;
    }

    public static void main(String[] args) {

        double numH, sal;

        System.out.println("Introduzca nº horas trabajadas : ");
//        numH = Double.parseDouble(System.console().readLine());
        numH = SC.nextDouble();
        System.out.println("Introduzca salario por horas : ");
//        sal = Double.parseDouble(System.console().readLine());
        sal = SC.nextDouble();

        T3Nominas nomimas = new T3Nominas(numH, sal);

        System.out.println("Salarios brutos semanal : " + nomimas.getSalarioSemanal());
        System.out.println("Salarios brutos mensual : " + nomimas.getSalarioBrutoMensual());
        System.out.println("Descuento por impuesto : " + nomimas.getDescuentos());
        System.out.println("Salarios neto mensual : " + nomimas.getSalarioNetoMensual());

    }

}
