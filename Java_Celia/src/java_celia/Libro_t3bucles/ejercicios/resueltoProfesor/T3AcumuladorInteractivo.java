/**
 * @created on : 21-ago-2017, 10:24:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3AcumuladorInteractivo {

    private int suma = 0;
    private int numValores = 0;

    /**
     * Acumula valores del numero
     *
     * Cuenta las veces que entra un nuevo numero
     *
     * @param n
     */
    public void anadirNumero(int n) {
        suma += n;
        numValores++;
    }

    public int getSuma() {
        return suma;
    }

    public double getMedia() {
        return (double) suma / numValores;
    }

    public static void main(String[] args) {

        T3AcumuladorInteractivo acum = new T3AcumuladorInteractivo();

        int n;

        do {
            System.out.println("Introduzca un numero ");
            System.out.println(" (negativo para terminar) ");
//            n = Integer.parseInt(System.console().readLine());
            n = SC.nextInt();
            if (n >= 0) {
                acum.anadirNumero(n);
            }
        } while (n >= 0);

        System.out.println("La suma es : " + acum.getSuma());
        System.out.println("La media es : " + acum.getMedia());

    }

}
