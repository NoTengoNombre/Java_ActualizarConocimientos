/**
 * @created on : 29-jul-2017, 12:58:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__21_Primo {

    /**
     * Tiene errores , solución incorrecta
     *
     * @param n
     * @return
     */
//    public static void setNumeroPrimo(int n) {
//        for (int i = 0; i <= n; i++) {
//            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7) {
//                System.out.println("El valor de " + i);
//            }
//            if (i / 2 >= 1 && i % 2 != 0) { // elimina todos los pares
//                if ((i / 3 >= 1) && (i % 3 != 0)) {
//                    if ((i / 5 >= 1) && (i % 5 != 0)) {
//                        if ((i / 7 >= 1) && (i % 7 != 0)) {
////                            if ((i / 11 >= 1) && (i % 11 != 0)) {
////                                if ((i / 13 >= 1) && (i % 13 != 0)) {
//                            System.out.println("El valor de " + i);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public static int getNumber() {
//        System.out.println("Introduce un num : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 0 || n == 1) {
//            do {
//                if (n == 1) {
//                    System.out.println("El " + n + "  El número " + n + " por convenio, no se considera ni primo ni compuesto ");
//                } else if (n <= 0) {
//                    System.out.println("El " + n + " no se permite - Tampoco los negativos ");
//                }
//                System.out.println("Intro num valido mayor que 1 : ");
//                n = sc.nextInt();
//            } while (n < 2);
//        }
//        return n;
//    }
    
    /**
     * Solo comprueba si el numero es primo o no
     *
     * @param n
     * @return true o false
     */
    public static boolean esPrimo(int n) {
//          6
        if (n < 2) {
            return false;
        }
//                      2    6
        for (int i = 2; i <= n / 2; i++) {
//                                         6
            System.out.println("Valor: " + i);
//              6   2
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        setNumeroPrimo(100);
        System.out.println("Los primos entre 1 y 100 son: ");
        for (int n = 1; n <= 100; n++) {
            if (esPrimo(n)) {
                System.out.print(n + "\t");
            }
        }
    }
}
