/**
 * @created on : 20-ago-2017, 21:53:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3NumerosOrdenadosPruebas {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Por favor , Introduzca tres numeros : ");

        System.out.println("\tPrimer numero : ");
        a = Integer.parseInt(System.console().readLine());

        System.out.println("\tSegundo numero : ");
        b = Integer.parseInt(System.console().readLine());

        System.out.println("\tTercer numero : ");
        c = Integer.parseInt(System.console().readLine());

        T3NumerosOrdenados num = new T3NumerosOrdenados(a, b, c);

        if (num.estanOrdenados()) {
            System.out.println("Los numeros estan ordenados");
        } else {
            System.out.println("Los numeros No estan ordenados");
        }

        if (num.sonConsecutivos()) {
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("Los numeros NO son consecutivos");
        }
    }
}
