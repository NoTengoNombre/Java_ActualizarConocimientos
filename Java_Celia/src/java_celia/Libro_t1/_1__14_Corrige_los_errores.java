package java_celia.Libro_t1;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class _1__14_Corrige_los_errores {

    static int n1 = 50;

    public static void main(String[] args) {

        System.out.println("Apartado A");
        int n2 = 30, suma, n3 = 0;
        suma = n1 + n2;
        System.out.println("La suma es : " + suma);
        suma = suma + n3;
        System.out.println("Suma :  " + suma);

        System.out.println("Apartado B");
        int n2a = 5, n2b = 6;
        boolean suma2 = true;
        suma2 = (0 != (n2a + n2b));
        System.out.printf(" el valor es %b - ", suma2);

        System.out.println("Apartado C");
        int n3a = 8;
        int cuad = n3a * n3a;
        System.out.println("El cuadrado de " + n3a + " es : " + cuad);

    }
}
