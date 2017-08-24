/**
 * @created on : 24-ago-2017, 20:15:02
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej51Calculadora;

import java.util.Scanner;

public class Calculadora {

    public int getNumerosTeclado() {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int numero = Integer.valueOf(n);
        return numero;
    }

    public int getSuma() {
        System.out.println("Suma ");
        System.out.println("Introduce 1º numero ");
        int suma = getNumerosTeclado();
        System.out.println("Introduce 2º numero ");
        int suma2 = getNumerosTeclado();
        int resultado = suma + suma2;
        return resultado;
    }

    public int getMultiplicacion() {
        System.out.println("Multiplicacion ");
        System.out.println("Introduce 1º numero ");
        int suma = getNumerosTeclado();
        System.out.println("Introduce 2º numero ");
        int suma2 = getNumerosTeclado();
        int resultado = (suma * suma2);
        return resultado;
    }

    public int getResta() {
        System.out.println("Resta ");
        System.out.println("Introduce 1º numero ");
        int suma = getNumerosTeclado();
        System.out.println("Introduce 2º numero ");
        int suma2 = getNumerosTeclado();
        int resultado = (suma - suma2);
        return resultado;
    }

    public int getDivision() {
        System.out.println("Division ");
        System.out.println("Introduce 1º numero ");
        int suma = getNumerosTeclado();
        System.out.println("Introduce 2º numero ");
        int suma2 = getNumerosTeclado();
        if (suma == 0 && suma2 == 0) {
            while (suma == 0 && suma2 == 0) {
                System.out.println("Introduce otra vez el 2º numero ");
                suma2 = getNumerosTeclado();
            }
        }
        int resultado = (suma / suma2);
        return resultado;
    }

    public int getModulo() {
        System.out.println("Modulo ");
        System.out.println("Introduce 1º numero ");
        int suma = getNumerosTeclado();
        if (suma == 0) {
            while (suma == 0) {
                System.out.println("Introduce otra vez el 1º numero ");
                suma = getNumerosTeclado();
            }
        }
        System.out.println("Introduce 2º numero ");
        int suma2 = getNumerosTeclado();
        if (suma2 == 0) {
            while (suma2 == 0) {
                System.out.println("Introduce otra vez el 2º numero ");
                suma2 = getNumerosTeclado();
            }
        }
        int resultado = (suma % suma2);
        return resultado;
    }

    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        System.out.println(c.getSuma());
        System.out.println(c.getResta());
        System.out.println(c.getMultiplicacion());
        System.out.println(c.getDivision());
    }
}
