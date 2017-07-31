/**
 * @created on : 31-jul-2017, 23:26:42
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__29_Poligonos {

    private static double area;
    private static double perimetro;
    private static int numLados;
    private static double longitudLados;
    private static double apotema;

    public static double perimetro(int numLados, double longitudLados) {
        perimetro = numLados * longitudLados;
        return perimetro;
    }

    public static double area(double longitudLados, double apotema) {
        perimetro = perimetro(numLados, longitudLados);
        area = (perimetro * apotema) / 2;
        return area;
    }

    public static double getPoligono() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de lados : ");
        numLados = sc.nextInt();

        System.out.println("Introduce la longitud de los lados : ");
        longitudLados = sc.nextDouble();

        System.out.println("Introduce la apotema : ");
        apotema = sc.nextDouble();

        switch (numLados) {
            case 3:
                area = area(longitudLados, apotema);
                System.out.println("triangulo - trigono");
                break;
            case 4:
                area = area(longitudLados, apotema);
                System.out.println("tetragono, cuadrangulo o cuadrilátero");
                break;
            case 5:
                area = area(longitudLados, apotema);
                System.out.println("pentagono");
                break;
            case 6:
                area = area(longitudLados, apotema);
                System.out.println("hexagono");
                break;
            case 7:
                area = area(longitudLados, apotema);
                System.out.println("heptagono");
                break;
            case 8:
                area = area(longitudLados, apotema);
                System.out.println("octogono u octagono");
                break;
            case 9:
                area = area(longitudLados, apotema);
                System.out.println("eneagono o nanogono");
                break;
            case 10:
                area = area(longitudLados, apotema);
                System.out.println("decagono");
                break;
            case 11:
                area = area(longitudLados, apotema);
                System.out.println("endecagono o undecagono");
                break;
            case 12:
                area = area(longitudLados, apotema);
                System.out.println("dodecaedro");
                break;
            default:
                System.out.println("Polígono regular no determinado");
        }
        return area;
    }

    public static void main(String[] args) {
        double poligono = getPoligono();
        System.out.println("Area :" + poligono);
        System.out.println("Perimetro :" + perimetro);
    }
}
