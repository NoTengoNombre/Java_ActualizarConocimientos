/**
 * @created on : 31-jul-2017, 0:23:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_calculadora;

import java.util.Scanner;

public class T3__26_Calculadora1Objetos {

    private static Scanner sc;

    private static int valor;
    private static int con = 0;
//    private static int num = 0;

    private static int numeroA = 0;
    private static int numeroA2 = 0;

    private static int numeroB = 0;
    private static int numeroB2 = 0;

    private static String cadena;
    private static String confirma;

    public static void setNumero() {
        sc = new Scanner(System.in);
        con++;
        if (con == 1) {
            System.out.println("Introduce un numero A: ");
            numeroA = sc.nextInt();
            con--;
        }
        if (con == 0) {
            System.out.println("Introduce un numero B: ");
            numeroB = sc.nextInt();
        }
    }

    public static void setSimbolo() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("• Introduce los simbolos : '+' , '-' , '*' , '/' , '%' ");
        cadena = sc1.next();
        while (!(cadena.equals("+") || (cadena.equals("-")) || (cadena.equals("/")) || (cadena.equals("*")))) {
            System.out.println("♦ Error : Has introducido un caracter erroneo --> " + cadena);
            System.out.println("♦ Intro un simbolo entre  '/' , '+' , '*' , '-' ");
            cadena = sc1.next();
        }
    }

    public static int getNumero() {
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println("• Introduce los simbolos : '+' , '-' , '*' , '/' , '%' ");
            cadena = sc1.next();
            while (!(cadena.equals("+") || (cadena.equals("-")) || (cadena.equals("/")) || (cadena.equals("*")))) {
                System.out.println("♦ Error : Has introducido un caracter erroneo --> " + cadena);
                System.out.println("♦ Intro un simbolo entre  '/' , '+' , '*' , '-' ");
                cadena = sc1.next();
            }
            switch (cadena) {
                case "+":
                    setNumero();
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA + numeroB;
                    break;
                case "-":
                    setNumero();
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA - numeroB;
                    break;
                case "*":
                    setNumero();
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA * numeroB;
                    break;
                case "/":
                    setNumero();
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA / numeroB;
                    break;
                case "%":
                    setNumero();
                    System.out.println("A : " + numeroA);
                    System.out.println("B : " + numeroB);
                    valor = numeroA % numeroB;
                    break;
                default:
                    System.out.println("Elige un simbolo : '+' , '-' , '*' , '/' , '%' ");
            }

            System.out.println("• " + numeroA + " " + cadena + " " + numeroB + " obtenido es : " + valor);
            System.out.println("• ¿ Desea continuar ? 's' o 'n' :");
            confirma = sc.next();
        } while ("s".equals(confirma) || ((!confirma.equals("n"))));
        return valor;
    }

    public static void main(String[] args) {

        int numero = getNumero();
        System.out.println("Valor : " + numero);

    }
}
