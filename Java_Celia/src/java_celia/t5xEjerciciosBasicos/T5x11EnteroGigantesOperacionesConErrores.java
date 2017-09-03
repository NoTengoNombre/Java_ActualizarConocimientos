/**
 * @created on : 02-sep-2017, 22:54:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5x11EnteroGigantesOperacionesConErrores {

    public static void main(String[] args) {

        EnteroGigante2 eg1 = new EnteroGigante2();
        System.out.println("--------------------------------------------------");
        System.out.println("Escribe el primer entero gigante");
        String n = SC.next();
        eg1.leer(n);

        EnteroGigante2 eg2 = new EnteroGigante2();
        System.out.println("--------------------------------------------------");
        System.out.println("Escribe el primer entero gigante");
        n = SC.next();
        eg2.leer(n);

        EnteroGigante2 eg3 = eg1.division(eg2);
        System.out.println("La suma es : ");
        eg3.imprimir();
    }
}

class EnteroGigante2 {

    private int[] numero;
//    Longitud 50 - Posiciones/Espacios en el array 49
    private final int MAXIMO = 50;

    /**
     * Constructor inicializa el array de digitos a 0
     */
    public EnteroGigante2() {
        numero = new int[MAXIMO];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = 0;
        }
    }

    /**
     * Recibe una cadena larga de String y lo convierte a un array de digitos
     * enteros
     *
     * @param n 1
     */
    public void leer(String n) {
//             49         50   - 1
        int contArray = MAXIMO - 1;
// n.length - 1; le resta -1 al total de caracteres introducidos por teclado                 
//                     0    = 1          - 1           0 >= 0      
        for (int contString = n.length() - 1; contString >= 0; contString--) {
// Coge el caracter de la lista y lo almacena dentro del Array el cual tiene 49 espacios
            numero[contArray] = n.charAt(contString) - 48;
            contArray--;
        }
    }

    public void imprimir() {
        for (int i = 0; i < MAXIMO; i++) {
            System.out.print(numero[i]);
        }
        System.out.println();
    }

    /**
     *
     *
     * @param eg
     * @return Objeto egSuma
     */
    public EnteroGigante2 sumar(EnteroGigante2 eg) {
        EnteroGigante2 egSuma = new EnteroGigante2();
        int acarreo = 0;
//              49              49       -1
        for (int i = MAXIMO - 1; i >= 0; i--) {
//              1       1[49] +       0         +   0
            int s = numero[i] + eg.getDigito(i) + acarreo;
//              1 >= 10
            if (s >= 10) {
//                               1 - 10  1
                egSuma.setDigito(s - 10, i);
                acarreo = 1;

            } else {
//                               1  1
                egSuma.setDigito(s, i);
                acarreo = 0;
            }
        }
        return egSuma;
    }

    /**
     * Error
     *
     * @param eg
     * @return
     */
    public EnteroGigante2 resta(EnteroGigante2 eg) {
        EnteroGigante2 egResta = new EnteroGigante2();
        int acarreo = 0;
        for (int i = MAXIMO - 1; i >= 0; i--) {
            int s = numero[i] - eg.getDigito(i);
            if (s >= 10) {
                egResta.setDigito(s - 10, i);
                acarreo = 1;
            } else {
                egResta.setDigito(s, i);
                acarreo = 0;
            }
        }
        return egResta;
    }

    /**
     * Error
     *
     * @param eg
     * @return
     */
    public EnteroGigante2 division(EnteroGigante2 eg) {
        EnteroGigante2 egResta = new EnteroGigante2();
        int acarreo = 0;
        for (int i = MAXIMO - 1; i >= 0; i--) {
            int s = numero[i] / eg.getDigito(i);
            if (s >= 10) {
                egResta.setDigito(s - 10, i);
                acarreo = 1;
            } else {
                egResta.setDigito(s, i);
                acarreo = 0;
            }
        }
        return egResta;
    }

    /**
     * Le pasas la posicion y te devuelve el valor dentro del array
     *
     * @param posicion
     * @return Numero
     */
    public int getDigito(int posicion) {
        return numero[posicion];
    }

    /**
     * Fijas la posicion y su valor dentro del array
     *
     * @param valor
     * @param posicion
     */
    public void setDigito(int valor, int posicion) {
        numero[posicion] = valor;
    }

}
