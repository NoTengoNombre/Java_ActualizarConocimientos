/**
 * @created on : 08-ago-2017, 1:56:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__39Ruleta {

    private static int numeroRuleta;
    private static int colorRuleta;
    private static int numElegido;
    private static int colorUsuario;

    private static int dineroInicial = 100;
//    private static int dineroInicial = 2;

// ☻ Devuelve el numero con el que voy a apostar
    public static int getNumUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ɵ Elige un numero de la Ruleta entre 1 y 20 : ");
        numElegido = sc.nextInt();
        while (numElegido < 1 || numElegido > 20) {
            System.out.println("Ɵ Elige otro numero de la Ruleta entre 1 y 20 : ");
            numElegido = sc.nextInt();
        }
        System.out.println("Ɵ El Usuario ha elegido el numero : " + numElegido);
        return numElegido;
    }

// ☻ Devuelve el color en forma de numero con el que voy a apostar
    public static int getColorUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Ѽ Elige el color con el que quieres jugar - 'Rojo' o 'Negro' : ");
        System.out.println("Ѽ Pulsa '1' para elegir el color 'Rojo' : ");
        System.out.println("Ѽ Pulsa '2' para elegir el color 'Negro' : ");
        colorUsuario = sc.nextInt();
        while (colorUsuario < 1 || colorUsuario > 2) {
            System.out.println("----------------------------------------");
            System.out.println("Ѽ Vuelve a elegir el color del numero para apostar : ");
            System.out.println("Ѽ Vuelve a pulsar '1' para elegir el color 'Rojo' : ");
            System.out.println("Ѽ Vuelve a pulsar '2' para elegir el color 'Negro' : ");
            System.out.println("----------------------------------------");
            colorUsuario = sc.nextInt();
        }
        if (colorUsuario == 1) {
            System.out.println("Ѽ El usuario eligio el color : 'Rojo' ");
            System.out.println("----------------------------------------");
        }
        if (colorUsuario == 2) {
            System.out.println("Ѽ El usuario eligio el color : 'Negro' ");
            System.out.println("----------------------------------------");
        }
        return colorUsuario;
    }

    public static void setDineroUsuario(boolean premio) {
        if (premio == true) {
            dineroInicial *= 10;
//            dineroInicial *= 1;
            System.out.println("○ Dinero Actual : " + dineroInicial);
        } else {
            dineroInicial -= 10;
//            dineroInicial -= 1;
            System.out.println("○ Dinero Actual : " + dineroInicial);
        }
    }

    public static void getNumRuleta() {
        numeroRuleta = (int) (Math.random() * (1 + 19) + 1);
//        numeroRuleta = (int) (Math.random() * (1 + 59) + 1);
        System.out.println("♥ El numero que ha salido en la Ruleta es el : " + numeroRuleta);
    }

    public static void getColorRuleta() {
        colorRuleta = (int) (Math.random() * (1 + 1) + 1);
        if (colorRuleta == 1) {
            System.out.println("♥ El Color de la Ruleta es 'Rojo' ");
        }
        if (colorRuleta == 2) {
            System.out.println("♥ El Color de la Ruleta es 'Negro' ");
        }
        System.out.println("----------------------------------------");
    }

    public static boolean getContinuarJugando() {
        boolean respuesta = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("∅ Si desea jugar introduzca 'si' o 'no' ");
        String teclado = sc.next();

        while ((!teclado.equals("si") && (!teclado.equals("no")))) {
            System.out.println("∅ El valor '" + teclado + "' no es correcto :\nPor favor introduzca 'si' o 'no' ");
            System.out.println("∅ Por favor introduzca 'si' o 'no' ");
            teclado = sc.next();
        }

        if (teclado.equals("si")) {
            respuesta = true;
        }

        if (teclado.equals("no")) {
            respuesta = false;
        }
        return respuesta;
    }

    //Obtengo los numerosRuleta 
    public static void setJuegoRuleta() {
        System.out.println("♠ Bienvenido al juego de la Ruleta");
        while ((dineroInicial > 0) && (getContinuarJugando() != false)) {
            getNumUsuario();
            getColorUsuario();

            getNumRuleta();
            getColorRuleta();

            if ((dineroInicial > 0)) {
                if ((numElegido == numeroRuleta) && (colorUsuario == colorRuleta)) {
                    System.out.println(" ❢❢❢ Premio ❢❢❢ : Gas ganado");
                    setDineroUsuario(true);
                } else {
                    System.out.println(" ☓ Lo siento ☓ : La Casa ha ganado ");
                    setDineroUsuario(false);
                }
            }
        }
        System.out.println("♣  Fin del juego ");
        System.out.println(" $$$  Dinero Conseguido : " + dineroInicial + " $$$ ");
    }

    public static void main(String[] args) {

        setJuegoRuleta();
    }

}
