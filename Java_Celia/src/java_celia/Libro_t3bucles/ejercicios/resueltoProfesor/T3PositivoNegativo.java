/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T3PositivoNegativo {

    public int leerPorTeclado() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try {
            System.out.println("Escriba un numero entero : ");
            i = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(T3PositivoNegativo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public int comprobarNumero(int n) {

        if (n > 0 || n == 0) {
            System.out.println("El numero " + n + " es Positivo ");
        }
        if (n < 0) {
            System.out.println("El numero " + n + " es Negativo ");
        }
        return n;
    }
}
