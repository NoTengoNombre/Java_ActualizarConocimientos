/**
 * @created on : 28-jul-2017, 21:19:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class ModuloResto {

    public static void main(String[] args) {

        int resto_calculo = 290 % 100;

        System.out.println("Resto : " + resto_calculo);

        int total = resto_calculo / 10;

        System.out.println("Total : " + total);

        boolean modulo31 = 3 % 1 == 0;
        System.out.println("" + modulo31);
        boolean modulo32 = 3 % 2 == 0;
        System.out.println("" + modulo32);
        boolean modulo33 = 3 % 3 == 0;
        System.out.println("" + modulo33);
        boolean valor2 = 2 > 2;
        System.out.println("" + valor2);

    }
}
