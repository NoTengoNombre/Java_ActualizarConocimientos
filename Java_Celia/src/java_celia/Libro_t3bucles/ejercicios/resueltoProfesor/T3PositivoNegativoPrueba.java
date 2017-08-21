/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3PositivoNegativoPrueba {

    public static void main(String[] args) {

        T3PositivoNegativo posneg = new T3PositivoNegativo();
        int n = posneg.leerPorTeclado();
        System.out.println(posneg.comprobarNumero(n));

    }
}
