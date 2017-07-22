/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__12_Dibujando_rombo {

    public static void triangulo(int distancia) {
        System.out.println("La distancia minima para mostar un triangulo es de 3");
        if (distancia == 1) {
            distancia = distancia + 3;
        }
        if (distancia <= 3) {
            distancia = distancia + 2;
        }
        for (int i = 1; i < distancia; i = i + 2) {
            for (int k = distancia; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rombo() {
        for (int i = 1; i < 7; i = i + 2) {
            for (int k = 7; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 7; i >= 1; i = i - 2) {
            for (int k = i; k <= 7 + 2; k = k + 2) {
                System.out.print(" ");
            }
            for (int j = i - 2; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rombo2() {

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= 2 * (i - 1) + 1; d++) {
                System.out.print("-");
            }
            System.out.println("");
        }

        for (int f = 7; f >= 1; f = f - 2) {
            for (int c = f; c <= 7 + 2; c = c + 2) {
                System.out.print(" "); // 1 - 
            }
            for (int x = f - 2; x > 0; x--) {
                System.out.print("-");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        rombo();
        rombo2();
        triangulo(1);

    }
}
