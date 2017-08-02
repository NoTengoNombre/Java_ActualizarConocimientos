/**
 * @created on : 31-jul-2017, 0:23:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_calculadora;

import java.util.Scanner;

public class T3__26_Calculadora {

    private static Scanner sc;

    private static int valor;
    private static int con = 0;
    private static int num = 0;

    private static int numeroA = 0;
    private static int numeroA2 = 0;
    private static int numeroB = 0;
    private static int numeroB2 = 0;

    private static String cadena;
    private static String confirma;

    public static int setNumero() {
        sc = new Scanner(System.in);
        int num = 0;
        con++;
        if (con == 1) {
            System.out.println("Introduce un numero A: ");
            num = sc.nextInt();
        } else if (con == 2) {
            con++;
            System.out.println("Introduce un numero B: ");
            num = sc.nextInt();
        }
        return num;
    }

    public static int getNumero() {
        sc = new Scanner(System.in);
        int numeroA = setNumero();
        int numeroB = setNumero();
        System.out.println("• Introduce los simbolos : '+' , '-' , '*' , '/' , '%' ");
        cadena = sc.next();
        while (!(cadena.equals("+") || (cadena.equals("-")) || (cadena.equals("/")) || (cadena.equals("*")))) {
            System.out.println("♦ Error : Has introducido un caracter erroneo --> " + cadena);
            System.out.println("♦ Intro un simbolo entre  '/' , '+' , '*' , '-' ");
            cadena = sc.next();
        }
        do {
            System.out.println("• Introduce Otros numeros : ");
            numeroA2 = setNumero();
            numeroB2 = setNumero();
            switch (cadena) {
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
