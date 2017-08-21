/**
 * @created on : 20-ago-2017, 23:52:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3MayorMenorMedianoPrueba {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Por favor : introduce tres numeros : ");

        System.out.println("  Primer numero ");
        a = Integer.parseInt(System.console().readLine());

        System.out.println("  Segundo numero ");
        b = Integer.parseInt(System.console().readLine());

        System.out.println("  Tercer numero ");
        c = Integer.parseInt(System.console().readLine());

        T3MayorMenorMediano numeros = new T3MayorMenorMediano(a, b, c);

        System.out.println("El menor es : " + numeros.getMenor());
        System.out.println("El mediano es : " + numeros.getMediano());
        System.out.println("El mayor es : " + numeros.getMayor());

    }
}
