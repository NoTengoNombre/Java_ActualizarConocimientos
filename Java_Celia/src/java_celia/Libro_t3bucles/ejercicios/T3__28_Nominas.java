/**
 * @created on : 31-jul-2017, 19:54:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__28_Nominas {

    public static double sueldo;
    public static double sueldoHorasAdicionales;
    public static double precioPagarXhora;
    public static double numHoraSemanales;

    public static void horasSemana(double numHoraSemanales, double precioPagarXhora) {
        System.out.println("------- Salario Normal ---------");
        if (numHoraSemanales <= 40) {
            sueldo = (numHoraSemanales) * precioPagarXhora;
            System.out.println("• Sueldo base : " + sueldo);
        }

        if (numHoraSemanales > 40) {
            sueldo = (numHoraSemanales) * precioPagarXhora;
            System.out.println("• Sueldo base : " + sueldo);
            double horasAdicionales = numHoraSemanales - 40;
            System.out.println("┼ Horas adicionales : " + horasAdicionales);
            sueldoHorasAdicionales = (precioPagarXhora * 1.5) * horasAdicionales;
            System.out.println("┼ Complementos por 40 horas superadas : " + sueldoHorasAdicionales);
            sueldo += sueldoHorasAdicionales;
            System.out.println("┼ Sueldo base + horas extras : " + sueldo);

        }

    }

    public static void salarioBruto(double numHoraSemanas, double precioPagarXhora) {
        System.out.println("------- Salario Bruto ---------");
        if (numHoraSemanas <= 40) {
            sueldo = (numHoraSemanales) * precioPagarXhora;
            System.out.println("• Sueldo base : " + sueldo);
        }

        if (numHoraSemanas > 40) {

            sueldo = (numHoraSemanas) * precioPagarXhora;
            System.out.println("• Sueldo base : " + sueldo);
            double horasAdicionales = numHoraSemanas - 40;

            if (horasAdicionales <= 5) {

                System.out.println("┼ Horas adicionales : " + horasAdicionales);
                sueldoHorasAdicionales = (precioPagarXhora * 1.5) * horasAdicionales;
                System.out.println("┼ Complementos: " + horasAdicionales + " horas adicionales : horas < 45 : " + sueldoHorasAdicionales);
                sueldo += sueldoHorasAdicionales;
                System.out.println("┼ Sueldo base + horas extras : " + sueldo);

            } else if (horasAdicionales > 5) {

                sueldoHorasAdicionales = (precioPagarXhora * 3.0) * horasAdicionales;
                System.out.println("♦ Complementos: " + horasAdicionales + " horas adicionales : 45 > horas : " + sueldoHorasAdicionales);
                sueldo += sueldoHorasAdicionales;
                System.out.println("♦ Sueldo base + horas extras : " + sueldo);
            }

        }

    }

    public static void descuentoImpuestos() {
        System.out.println("------- Descuentos al sueldo ---------");
        if (sueldo <= 1000) {
            double descuento = sueldo * 0.10;
            sueldo -= descuento;
        } else if (sueldo > 1000) {
            double descuento = sueldo * 0.15;
            sueldo -= descuento;
        }
        System.out.println("Sueldo neto : " + sueldo);
    }

    public static void main(String[] args) {

//        horasSemana(41, 10);
        salarioBruto(46, 20);
        descuentoImpuestos();

    }
}
