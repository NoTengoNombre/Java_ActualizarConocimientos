/**
 * @created on : 07-ago-2017, 19:24:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_moduloResto;

public class ModuloRestoDecimales {

    public static void main(String[] args) {

        int numero = 71245;
        int numero2 = 71245;

        if (numero > 10000) {
            int resto = numero / 10000;
            if (resto % 2 == 0) {
                System.out.println("Par : " + numero);
            } else {
                System.out.println("Impar : " + numero);
            }
            numero2 = numero - (resto * 10000);
            System.out.println("Numero 1 : " + numero2);
        }
        if (numero > 1000) {
            int resto = numero / 1000;
            if (resto % 2 == 0) {
                System.out.println("Par : " + numero);
            } else {
                System.out.println("Impar : " + numero);
            }
            numero2 = numero - (resto * 1000);
            System.out.println("Numero 2 : " + numero2);
        }
        if (numero > 100) {
            int resto = numero / 100;
            if (resto % 2 == 0) {
                System.out.println("Par : " + numero);
            } else {
                System.out.println("Impar : " + numero);
            }
            numero2 = numero - (resto * 100);
            System.out.println("Numero 2 : " + numero2);
        }
        if (numero > 10) {
            int resto = numero / 10;
            if (resto % 2 == 0) {
                System.out.println("Par : " + numero);
            } else {
                System.out.println("Impar : " + numero);
            }
            numero2 = numero - (resto * 10);
            System.out.println("Numero 2 : " + numero2);
        }
        if (numero > 1) {
            int resto = numero / 1;
            if (resto % 2 == 0) {
                System.out.println("Par : " + numero);
            } else {
                System.out.println("Impar : " + numero);
            }
            numero2 = numero - (resto * 1);
            System.out.println("Numero 2 : " + numero2);

        }

    }
}
