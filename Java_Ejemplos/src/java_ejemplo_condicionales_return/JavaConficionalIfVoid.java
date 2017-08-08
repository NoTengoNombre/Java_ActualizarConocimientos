/**
 * @created on : 02-ago-2017, 23:42:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_condicionales_return;

public class JavaConficionalIfVoid {

    private static int numero;

    public static void getNumero(int numero) {
        if (numero == 1) {
            JavaConficionalIfVoid.numero = 1;
        }
        if (numero == 2) {
            JavaConficionalIfVoid.numero = numero = 2; // no asigna a static
        }
        if (numero == 3) {
            System.out.println("Pierde el valor");
            numero = 3; // no asigna a static
        }
        if (numero == 4) {
            System.out.println("Pierde el valor");
            numero = 4;
        }
    }

    public static void main(String[] args) {
        getNumero(1); // realiza la asignacion
        System.out.println("Valor metodo : " + numero);

        int numero1 = numero; // muestra el valor asignado
        System.out.println("Valor atributo static : " + numero1);

//        getNumero(2); // realiza la asignacion
//        System.out.println("Valor metodo : " + numero);
//
//        int numero2 = numero; // muestra el valor asignado
//        System.out.println("Valor atributo static : " + numero2);

//        getNumero(3); // realiza la asignacion
//        System.out.println("Valor metodo : " + numero);
//
//        int numero3 = numero; // muestra el valor asignado
//        System.out.println("Valor atributo static : " + numero3);
//
        getNumero(4); // realiza la asignacion
        System.out.println("Valor metodo : " + numero);

        int numero4 = numero; // muestra el valor asignado
        System.out.println("Valor atributo static : " + numero4);

//        getNumero(1); // realiza la asignacion
//        System.out.println("Valor metodo : " + numero);
//
//        int numero11 = numero; // muestra el valor asignado
//        System.out.println("Valor atributo static : " + numero11);

    }
}
