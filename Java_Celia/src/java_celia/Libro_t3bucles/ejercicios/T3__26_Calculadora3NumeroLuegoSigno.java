/**
 * @created on : 31-jul-2017, 0:23:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__26_Calculadora3NumeroLuegoSigno {

    private static Scanner sc = new Scanner(System.in);

    private static double valor;
    private static int con = 0;

    private static double numeroA = 0;
    private static double numeroB = 0;

    private static String cadena;
    private static String simbolo;
    private static String confirma;

    public static String setNumero() {
        con++;
        if (con == 1) {
            System.out.println("∎ Introduce un numero A: ");
            numeroA = sc.nextDouble();
            con--;
        }
        System.out.println("• Introduce un simbolo : '+' , '-' , '*' , '/' , '%' ");
        cadena = sc.next();
        simbolo = setSimbolo();
        if (con == 0) {
            System.out.println("∎ Introduce un numero B: ");
            numeroB = sc.nextDouble();
        }
        return simbolo;
    }

    public static String setSimbolo() {
        while (!(cadena.equals("+") || (cadena.equals("-")) || (cadena.equals("/")) || (cadena.equals("*") || (cadena.equals("%"))))) {
            System.out.println("♦ Error : Has introducido un caracter erroneo --> " + cadena);
            System.out.println("♦ Intro un simbolo entre  '/' , '+' , '*' , '-' ");
            cadena = sc.next();
        }
        return cadena;
    }

    public static double getNumero() {
        do {
            String setNumero = setNumero();
            switch (setNumero) {
                case "+":
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA + numeroB;
                    break;
                case "-":
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA - numeroB;
                    break;
                case "*":
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA * numeroB;
                    break;
                case "/":
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA / numeroB;
                    break;
                case "%":
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA % numeroB;
                    break;
                default:
                    System.out.println("Elige un simbolo : '+' , '-' , '*' , '/' , '%' ");
            }
            System.out.println("• " + numeroA + " " + simbolo + " " + numeroB + " obtenido es : " + valor);
            System.out.println("• ¿ Desea continuar ? 's' o 'n' :");
            confirma = sc.next();
        } while ("s".equals(confirma) || ((!confirma.equals("n"))));
        return valor;
    }

    public static void main(String[] args) {

        double numero = getNumero();
        System.out.println("Valor : " + numero);

    }
}
