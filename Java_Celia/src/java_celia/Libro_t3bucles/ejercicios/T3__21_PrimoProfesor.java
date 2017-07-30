/**
 * @created on : 29-jul-2017, 12:58:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__21_PrimoProfesor {

    /**
     * Devuelve los primeros n números primos
     *
     * @param n - 4
     * @return
     */
    public int[] listaPrimos(int n) { // 4
        int cont = 0; // Número de primos encontrados hasta ahora
        int i = 2; // inicializa a 1
        int[] primos = new int[n]; // declara la long del array
        while (cont < n) { // long == n
            if (esPrimo(i)) { // entra como 1 y se incrementa 
                primos[cont] = i; // almacena en la posicion del array el valor de i
                System.out.println("Primos " + primos[cont]);
                cont++; // fija la salida del bucle while
            }
            i++; // Si NO es primo incrementa : 1 -> 2 -> 3 .... 
        }
        return primos;
    }

//    comprueba si un numero es mayor que 2
    public boolean esPrimo(int n) {
        boolean primo;
        int numDivisores;
        numDivisores = calculaNumDivisores(n);
        if (numDivisores > 2) { // si son más de 2 es PRIMO
            primo = false;
        } else {
            primo = true;
        }
        return primo;
    }

//    Devuelve el número de divisores de un número entero
    private int calculaNumDivisores(int n) {
        int max = (int) Math.abs(n); // valor absoluto
        int numDivisores = 0;
//                           100
        for (int i = 1; i <= max; i++) {
            if (max % i == 0) { // 
                numDivisores++; // veces 8
            }
        }
        return numDivisores; // n elemento divisibles por 0
    }

    public static void main(String[] args) {

        T3__21_PrimoProfesor t = new T3__21_PrimoProfesor();
        t.listaPrimos(169);
    }
}
