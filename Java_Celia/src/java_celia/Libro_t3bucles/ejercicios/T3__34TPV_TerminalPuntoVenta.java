/**
 * @created on : 04-ago-2017, 12:26:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class T3__34TPV_TerminalPuntoVenta {

    private static int edadReal;
    private static double precioArti;

    public static int getPrecio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce el precio del articulo");
        int num = sc.nextInt();
        return num;
    }

    public static int getEdad() {
        int f;
        Scanner sc = new Scanner(System.in);
        System.out.println("♦ Introduce año de nacimiento");
        f = sc.nextInt();
        while (f > 2010 || f < 1932) {
            System.out.println("♦ Valor : " + f + " Introduce fecha de nacimiento valida");
            f = sc.nextInt();
        }
        System.out.println("♦ Fecha valida : " + f);
        return f; // 1999
    }

    public static int getAnioActual() {
        Calendar c = Calendar.getInstance();
        int anio = c.get(Calendar.YEAR);
        System.out.println("♠ Anio actual : " + anio); // 2017
        return anio;
    }

    public static int getEdadCliente() {
        edadReal = getAnioActual() - getEdad();
        System.out.println("♥ La edad del cliente es : " + edadReal);
        return edadReal;
    }

    public static double getDescuento(int edad) {
        double totalDesc = 0;
        double porcentaje = 0;

        int precio = getPrecio();

        while (precio >= 1) {

            if (edadReal >= 65) {
                porcentaje = 15;
                totalDesc = ((15 / 100d) * precio);
                System.out.println("Descuento 3º edad : " + totalDesc);
                precioArti = precio - totalDesc;
            }
            if (edadReal <= 25) {
                porcentaje = 10;
                totalDesc = ((10 / 100d) * precio);
                System.out.println("Descuento Joven : " + totalDesc);
                precioArti = precio - totalDesc;
            }
            System.out.println("El precio del articulo es de : " + precio);
            System.out.println("Se le aplica el porcentaje de : " + porcentaje);
            System.out.println("El precio final es de : " + precioArti);
            precio = getPrecio();
        }

        return precioArti;
    }

    public static void main(String[] args) {

        getDescuento(getEdadCliente());

    }
}
