/**
 * @created on : 21-ago-2017, 0:09:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3Pares {

    public static int leerNumero() {
        int n;

        System.out.println("Escriba un numero entero : ");
        n = Integer.parseInt(System.console().readLine());
        return n;
    }

    public void mostrarPares(int a, int b) {
        int i;
        int inicio;
        int fin;

//          1   2 
        if (a < b) {
//              1    1 
            inicio = a;
//           2    2 
            fin = b;
        } else {
//             2     2
            inicio = b;
//           1    1
            fin = a;
        }

        if (inicio % 2 != 0) {
            inicio++;
        }

        i = inicio;
        while (i <= fin) {
            System.out.println(i);
            i += 2;
        }
    }

}
