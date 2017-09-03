/**
 * @created on : 02-sep-2017, 22:54:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5x10EnteroGigantesProfesor {

    public static void main(String[] args) {

        EnteroGigante eg1 = new EnteroGigante();
        EnteroGigante eg2 = new EnteroGigante();
        System.out.println("--------------------------------------------------");
        System.out.println("Escribe el primer entero gigante");
        String n = SC.next();
        eg1.leerString(n);

        System.out.println("--------------------------------------------------");
        System.out.println("Escribe el segundo entero gigante");
        n = SC.next();
        eg2.leerString(n);

        EnteroGigante eg3 = eg1.sumar(eg2);
        System.out.println("La suma vale: ");
        eg3.imprimir();

    }
}

class EnteroGigante {

//    Los digitos del entero gigante se guardan en un array
    private final int[] numero;
//    Numero maximo de digitos
    private final int MAXIMO = 50;

    /**
     * El constructor inicializa el array de digitos a 0
     */
    public EnteroGigante() {
//Instancio un objeto
        numero = new int[MAXIMO];
        for (int i = 0; i < MAXIMO; i++) {
            numero[i] = 0;
        }
    }

    /**
     * Recibe el entero gigante dentro de un String y lo convierte a un Array de
     * digitos enteros
     *
     * @param n
     */
    public void leerString(String n) {
        int c = 0;
//               49       =      50 - 1
        int contadorArray = (MAXIMO - 1);
//                                                                   longitud de caracteres
        System.out.println("Numero de caracteres introducidos : " + (n.length()));
//           0  caracteres      = 1          - 1;      0         >= 0;   0
        for (int contadorString = n.length() - 1; contadorString >= 0; contadorString--) {
//Almacena en cada posicion un nuevo numero
//                                  devuelve el 1º caracter de la cadena   
            numero[contadorArray] = n.charAt(contadorString) - 48;
            System.out.println((c++) + " : valor : " + numero[contadorString]);
            contadorArray--;
        }
    }

    /**
     * Muestra el entero gigante por la consola
     */
    public void imprimir() {
        for (int i = 0; i < MAXIMO; i++) {
            System.out.print(numero[i]);
        }
        System.out.println();
    }

    /**
     * Modifica el digito situado en una posicion
     *
     * @param valor
     * @param posicion
     */
    public void setDigito(int valor, int posicion) {
        numero[posicion] = valor;
    }

    /**
     * Devuelve el digito situado en una posicion
     *
     * @param posicion
     * @return numero[posicion];
     */
    public int getDigito(int posicion) {
        return numero[posicion];
    }

    /**
     * Suma el entero gigante con otro , digito a digito
     *
     * @param eg
     * @return egSuma
     */
    public EnteroGigante sumar(EnteroGigante eg) {
        EnteroGigante egSuma = new EnteroGigante();
        int acarreo = 0;
//              49 =  50    - 1; 49>= 0           
        for (int i = MAXIMO - 1; i >= 0; i--) {
//                        49  +  
            int s = numero[i] + eg.getDigito(i) + acarreo;
            if (s >= 10) {
                egSuma.setDigito(s - 10, i);
                acarreo = 1;
            } else {
                egSuma.setDigito(s, i);
                acarreo = 0;
            }
        }
        return egSuma;
    }
}
