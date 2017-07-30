/**
 * @created on : 30-jul-2017, 9:01:41
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__22_Omirps {

    private static int resto;

    private int calculaNumDivisores(int max) {
        int numDivisores = 0;
//       6                 
        max = (int) Math.abs(max);
//                            6
        for (int i = 1; i <= max; i++) {
//               6  % 1/2/4 == 0 - 3 veces
            if (max % i == 0) { // Comprueba si es MULTIPLO : Siempre divide por el mismo y sus multiplos
                numDivisores++;
            }
        }
        return numDivisores; // 2
    }

//  Si el valor pasado por parametro es MENOR de 2 es primo
//                              4
    private boolean esPrimo(int max) {
        boolean primo;
        int numDivisores;
//            3                             4
        numDivisores = calculaNumDivisores(max);
//            3
        if (numDivisores > 2) { // si numero de divisores es mayor > 2 NO ES PRIMO
            primo = false;
        } else {
            primo = true;
        }
        return primo; // 8
    }

//    Devuelve los primeros 'n' numeros primos
    public int[] listaNumeros(int n) {
        int cont = 0; // aumenta el numero 
        int i = 1;
        int[] primos = new int[n]; // solo almacena los numeros primos
        while (cont < n) { // indica maximo elementos que recorrer
            if (esPrimo(i)) { // mediante el incremento "i" Comprueba si es primo mediante el metodo interior
//                               "calculaNumDivisores" que indica cuantos numeros son Multiplos de numero de i
                primos[cont] = i;
                cont++;
            }
            i++;
        }
        return primos;
    }

    public static int getNumeroDividido(int numero) { // 1234
        int dividendo = resto * 10; // 12340
        int cociente = dividendo / 10000;
        resto = dividendo % 10000;
        return cociente;
    }

    public static int getNumeroInvertido() {
        int temp;
        double totalTemp = 0;
        int restoComp = resto;
        while (resto > 0) {
            temp = getNumeroDividido(resto);
            totalTemp = ((totalTemp + temp) / 10);
        }
        double numero = totalTemp * 10000;

        if (restoComp >= 0 && restoComp <= 9) {
            numero = Math.round(numero);
            numero /= 1000;
        }
        if (restoComp >= 10 && restoComp <= 99) {
            numero = Math.round(numero);
            numero /= 100;
        }
        if (restoComp >= 100 && restoComp <= 999) {
            numero = Math.round(numero);
            numero /= 10;
        }
        if (restoComp >= 999 && restoComp <= Integer.MAX_VALUE) {
            numero = Math.round(numero);
        }
        return (int) numero;
    }

    public static void main(String[] args) {
        T3__22_Omirps t = new T3__22_Omirps();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la lista de numeros Primos entre 1 y 100");
        System.out.println("Recuerda que el orden de los numeros Primos NO ES igual al de los Enteros");
        int longLista = (int) (sc.nextInt() * 1.69);
        int[] listaNumeros = t.listaNumeros(longLista);

        System.out.println("Introduce un numero : ");
        int numero = sc.nextInt();
        boolean esPrimo = t.esPrimo(numero);

        if (esPrimo == true) {
            System.out.println("El numero " + numero + " ES primo");
        } else {
            System.out.println("El numero " + numero + " NO ES primo");
        }

        if (esPrimo == true) {
            resto = numero;

            int omirps = getNumeroInvertido();

            for (int i = 0; i < listaNumeros.length; i++) {
                int valoresPrimos = listaNumeros[i];
                if (valoresPrimos == omirps) {
                    System.out.println("El numero es omirps : " + numero + " = " + valoresPrimos);
                }
            }
        } else {
            System.out.println("El numero " + numero + " NO ES omirps");
        }

        System.out.println(".......................");

        for (int i = 0; i < listaNumeros.length; i++) {
//            System.out.println("obtener : " + listaNumeros[i]);
        }

        System.out.println("------- Lista --------");

        int[] listaNumeros2 = listaNumeros.clone();

        for (int i = 0; i < listaNumeros.length; i++) {
            resto = listaNumeros[i];
            listaNumeros2[i] = getNumeroInvertido();
        }

        for (int i = 0; i < listaNumeros2.length; i++) {
            System.out.println("Primos : " + listaNumeros[i] + " Omirps : " + listaNumeros2[i]);
        }

    }

}
