/**
 * @created on : 27-sep-2017, 18:20:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.AccessRandomInput;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsoAccessRandomInput {

    private static final Scanner SC = new Scanner(System.in);
    private static RandomAccessFile fichero = null;

    public static void main(String[] args) {

        int numero;

        try {
//            Se Abre el fichero para lectura y escritura
            fichero = new RandomAccessFile("enteros.dat", "rw");

            mostrarFichero();

            System.out.println("Introduce un numero entero para añadir al final del fichero");
            numero = SC.nextInt();
            fichero.seek(fichero.length());
            fichero.writeInt(numero);

            mostrarFichero();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsoAccessRandomInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsoAccessRandomInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(UsoAccessRandomInput.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void mostrarFichero() {
        int n;
        try {
            fichero.seek(0);
            while (true) {
                n = fichero.readInt();
                System.out.println(n);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");

        } catch (IOException ex) {
            Logger.getLogger(UsoAccessRandomInput.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     */
    public static void mostrarFichero2() {
        int n;
        try {
            fichero.seek(0);
            long posicionActual = fichero.getFilePointer();
            while (posicionActual < fichero.length()) {
                n = fichero.readInt();
                System.out.println(n);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero : " + e.getMessage() + " Localizacion : " + e.getLocalizedMessage());

        } catch (IOException ex) {
            Logger.getLogger(UsoAccessRandomInput.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
