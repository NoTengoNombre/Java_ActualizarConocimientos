/**
 * @created on : 27-jul-2017, 23:31:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

public class Fibonnaci {

    public static int fibonnaci(int n) {
        int actual = 0; // variable contador
        int ant1 = 0; // minimo
        int ant2 = 1; // maximo
//Para crear la serie fibonnaci 
//se necesita tener declarados al menos
//los valores mínimos que manejan la sucesion.
//El 1º valor es el ant1 = 0 -> donde empieza
//El 2º valor es el ant2 = 1 -> el siguiente valor de la sucesión.
//Con estos valores se puede continuar la sucesión de numeros
//La formula es (n - 1 + n - 2)
        if (ant1 < 0 || ant2 < 1) {
//El valor mínimo es será 1 si algunos de los elementos de la sucesión es menor
            return actual = 1;
        }
        for (int i = 2; i <= n; i++) {
            System.out.println(actual);
//                  anterior + siguiente
//            1        0  +  1
            actual = ant1 + ant2;
//            0  <- 0
            ant2 = ant1;
//            1 <- 1
            ant1 = actual;
        }
//               1
        return actual;
    }

    public static void main(String[] args) {
        int fibonnaci = fibonnaci(15);
        System.out.println("Valor : " + fibonnaci);
    }
}
