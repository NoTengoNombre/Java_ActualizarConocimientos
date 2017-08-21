/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3RaizCuadradaPrueba {

    public static void main(String[] args) {
        T3RaizCuadrada rc = new T3RaizCuadrada();
        System.out.println("Intro un numero : ");
        double n = Double.parseDouble(System.console().readLine());
        double raiz = rc.calcularRaizCuadrada(n);
        System.out.println("La raiz de " + n + " es " + raiz);
    }
}
