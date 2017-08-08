/**
 * @created on : 02-ago-2017, 23:42:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_condicionales_return;

public class JavaConficionalIfReturn {

    private static int numero;

    public static int getNumero(int numero) {
        if (numero == 1) {
            return numero; // no asigna a static
        }
        if (numero == 2) {
            numero = 2;
            return numero; // no asigna a static
        }
        if (numero == 3) {
            return numero = 3; // no asigna a static
        }
        if (numero == 4) {
            JavaConficionalIfReturn.numero = 4;
            return numero;
        }
        return numero;
    }

    public static void main(String[] args) {
//        int numero1 = getNumero(1);
//        System.out.println("Valor metodo metodo : " + numero1);
//
//        int numero11 = numero;
//        System.out.println("Valor atributo static : " + numero11);

//        int numero2 = getNumero(2);
//        System.out.println("Valor metodo metodo : " + numero2);
//
//        int numero22 = numero;
//        System.out.println("Valor atributo static : " + numero22);

//        int numero3 = getNumero(3);
//        System.out.println("Valor metodo metodo : " + numero3);
//
//        int numero33 = numero;
//        System.out.println("Valor atributo static : " + numero33);

        int numero4 = getNumero(4);
        System.out.println("Valor metodo metodo : " + numero4);

        int numero44 = numero;
        System.out.println("Valor atributo static : " + numero44);

    }
}
