/**
 * @created on : 30-jul-2017, 9:01:41
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__22_EratostenesProfesor {

// Devuelve el numDivisores de 'n'      
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
    public boolean esPrimo(int max) {
        boolean primo;
        int numDivisores;
//            3                             4
        numDivisores = calculaNumDivisores(max);
//            3
        if (numDivisores > 2) { // si el resultado de calculaNumDivisores > 2 
//         Como 6 que son 4 valores : NO ES PRIMO
            primo = false;
        } else {
            primo = true;
        }
        return primo; // 8
    }

//    Devuelve los primeros 'n' numeros primos
    private int[] listaNumeros(int n) {
        int cont = 0; // aumenta el numero 
        int i = 1;
        int[] primos = new int[n];
        while (cont < n) { // indica maximo elementos que recorrer
            if (esPrimo(i)) { // mediante el incremento i Comprueba si es primo mediante el metodo interior
//                               calculaNumDivisores que indica cuantos numeros son Multiplos de numero de i
                primos[cont] = i;
                cont++;
            }
            i++;
        }
        return primos;
    }

    public static void main(String[] args) {

        T3__22_EratostenesProfesor t = new T3__22_EratostenesProfesor();
        int[] listaNumeros = t.listaNumeros(168);

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Numeros Primos : " + listaNumeros[i]);
        }

    }

}
