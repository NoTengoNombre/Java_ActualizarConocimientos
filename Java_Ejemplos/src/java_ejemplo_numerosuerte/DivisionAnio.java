/**
 * @created on : 28-jul-2017, 13:02:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

public class DivisionAnio {

    public static int valor;
    public static int total;

    public static int dividirAnioGeneral(int valor) {
        System.out.println("r0 " + valor);
        int d1 = valor / 1000;
        System.out.println(" 1 divison : " + d1);
        int r1 = valor % 1000;
        System.out.println(" 1 resto : " + r1);
        System.out.println("-----------------");
        System.out.println("r1 " + r1);
        int d2 = r1 / 100;
        System.out.println(" 2 divison : " + d2);
        int r2 = valor % 100;
        System.out.println(" 2 resto : " + r2);
        System.out.println("-----------------");
        System.out.println("r2 " + r2);
        int d3 = r2 / 10;
        System.out.println(" 3 divison : " + d3);
        int r3 = valor % 10;
        System.out.println(" 3 resto : " + r3);
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("r3 " + r3);
        int d4 = r3 / 1;
        System.out.println(" 4 divison : " + d4);
        int r4 = valor % 1;
        System.out.println(" 4 resto : " + r4);
        System.out.println("-----------------");
        System.out.println("r4 " + r4);
        total = d1 + d2 + d3 + d4;
        System.out.println("VER TOTAL : " + total);
        return total;
    }

    public static int dividir2cifras(int resto) {
        System.out.println("♦ Valor total : " + total);
        int total2dividir;
        int total3;
        int total3_resto;
        int total4;
        int total4_resto;
        int total_final;

        System.out.println("-----------------------");
        total2dividir = total;

        total2dividir = total2dividir * 10;
        System.out.println("Total2 : " + total2dividir); // 100

        total3 = total2dividir / 100;
        System.out.println("Total 3 : " + total3); // 1

        total3_resto = total2dividir % 100;
        System.out.println("Totalr 3 : " + total3_resto); // 1

        total4 = total3_resto / 10;
        System.out.println("Total 4 : " + total4); // 1

        total4_resto = total3_resto % 10;
        System.out.println("Totalr 4 : " + total4_resto); // 1

        total_final = total3 + total4;

        if (total_final == 10) {
            total_final = 1;
        }

        System.out.println("Total final : " + total_final);

        return total_final;
    }

    public static void main(String[] args) {

        int fechaParaDividir = dividirAnioGeneral(1984);
        System.out.println("Dividir la fecha " + valor + "  : " + fechaParaDividir);

//        System.out.println("---------------------");
//        int dividir2cifras = dividir2cifras(fechaParaDividir);
//        System.out.println("---------------------");
//        System.out.println("Sumar las 2 cifras " + total + " : " + dividir2cifras);
    }
}
