/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T3__10_mostrar_pares_impares {

    private int a = 0;
    private int b = 0;
    private static int ab = 1;

    public T3__10_mostrar_pares_impares(int aa, int bb) {
        a = aa;
        b = bb;
    }

    public void getImpares() {
        int aa;
        if (a < b) {
            aa = a;
            do {
                if (aa % 2 != 0) {
                    System.out.printf("\u001B[31m Impar " + aa + " \n");
                }
                aa++;
            } while (aa <= b);
            System.out.println("Fin lista de Impares");
        } else {
            System.out.println("La variable Impar 'B' "
                    + "con valor '" + b + "' no puede ser menor");
        }
    }

    public void getPares() {
        int aa;
        if (a < b) {
            aa = a;
            do {
                if (aa % 2 == 0) {
                    System.out.printf("\u001B[32m Par " + aa + " \n");
                }
                aa++;
            } while (aa <= b);
            System.out.println("Fin lista de Pares");
        } else {
            System.out.println("La variable Par 'B' "
                    + "con valor '" + b + "' no puede ser menor");
        }
    }

    private static int getNumero() {
        System.out.println("Introduce el " + ab++ + "º numero");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int teclado = 0;
        try {
            teclado = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(T3__10_mostrar_pares_impares.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teclado;
    }

    private static String getTeclado() {
        getOpciones();
        System.out.println("Introduce un texto: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String teclado = null;
        try {
            teclado = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(T3__10_mostrar_pares_impares.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teclado;
    }

    private static void getOpciones() {
        System.out.println("-- Menu de opciones --");
        System.out.println("1 - Par");
        System.out.println("2 - Impar");
        System.out.println("0 - Para salir");
    }

    /**
     * Los metodos getPares/getImpares no necesitan un objeto para ser invocado
     * porque estan dentro de un metodo que ha sido invocado a traves de un
     * objeto de la clase. Ademas comparten las mismas propiedades
     *
     * @param menu
     */
    public void menu(int menu) {
        do {
            switch (menu) {
                case 1:
                    getPares();
                    break;
                case 2:
                    getImpares();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    getOpciones();
                    break;
            }
            menu = Integer.parseInt(getTeclado());
        } while (menu != 0);
    }

    public static void main(String[] args) {
        T3__10_mostrar_pares_impares t = new T3__10_mostrar_pares_impares(getNumero(), getNumero());
        t.menu(Integer.parseInt(getTeclado()));

    }
}
