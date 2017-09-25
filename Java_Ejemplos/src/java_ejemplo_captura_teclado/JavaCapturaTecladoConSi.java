/**
 * @created on : 25-sep-2017, 13:15:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_captura_teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCapturaTecladoConSi {

    private String contesta;
    private boolean respuesta;

    /**
     *
     * @param txt
     * @return
     */
    public String dimePalabras(String txt) {
        contesta = "";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n");
        System.out.printf(txt);
        try {
            contesta = buffer.readLine();
        } catch (IOException e) {
            System.out.println("Error de lectura de datos : " + e.getMessage());
        }
        return contesta;
    }

    /**
     *
     * @param txt
     */
    public void bucle(String txt) {
        respuesta = false;
        do {
            if (dimePalabras(txt.toLowerCase()).equals("si")) {
                System.out.println("Correcto");
                respuesta = true;
            }
        } while (respuesta == false);

    }

    public static void main(String[] args) {

        JavaCapturaTecladoConSi jctcs = new JavaCapturaTecladoConSi();
        jctcs.dimePalabras("Hola");
        jctcs.bucle("si");

    }

}
