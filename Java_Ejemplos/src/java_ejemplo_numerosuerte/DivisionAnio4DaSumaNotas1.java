/**
 * @created on : 28-jul-2017, 13:02:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

public class DivisionAnio4DaSumaNotas1 {

    public static int valor;
    public static int total;

    public static int dividirAnioGeneral(int valor) {
        System.out.println("Anio a dividir :  " + valor);
        int c1 = valor / 1000;
        System.out.println(" cociente 1º : " + c1);
        int r1 = valor % 1000;
        System.out.println(" 1º resto : " + r1);
        System.out.println("-----------------");
        
        int c2 = r1 / 100;
        System.out.println(" cociente 2º : " + c2);
        int r2 = r1 % 100;
        System.out.println(" 2º resto : " + r2);
        System.out.println("-----------------");
        
        int c3 = r2 / 10;
        System.out.println(" cociente 3º  : " + c3);
        int r3 = r2 % 10;
        System.out.println(" 3º resto : " + r3);
        System.out.println("-----------------");
        
        int c4 = r3 / 1;
        System.out.println(" cociente 4º : " + c4);
        int r4 = r3 % 1;
        System.out.println(" 4º resto : " + r4);

        System.out.println("-----------------");
        total = c1 + c2 + c3 + c4;
        System.out.println("VER TOTAL : " + total);
        System.out.println("-----------------");

        int valor2 = total;
        System.out.println("valor2 : " + valor2);
        
        int c5 = valor2 / 10;
        System.out.println(" cociente 5º  : " + c5);
        int r5 = valor2 % 10;
        System.out.println(" 5º resto : " + r5);
        System.out.println("-----------------");
        int c6 = r5 / 1;
        System.out.println(" cociente 6º : " + c6);
        int r6 = r5 % 1;
        System.out.println(" 6º resto : " + r6);

        int total2 = c5 + c6;
        System.out.println("VER TOTAL 2 : " + total2);

        int c7 = total2 / 10;
        System.out.println(" cociente 7º  : " + c7);
        int r7 = total2 % 10;
        System.out.println(" 7º resto : " + r7);

        int valor4 = c7 + r7;
        System.out.println("Valor final : " + valor4);

        return valor4;
    }

    public static void main(String[] args) {

        int fechaParaDividir = dividirAnioGeneral(1974);
        System.out.println("Dividir la fecha : " + fechaParaDividir);

        System.out.println("---------------------");

    }
}
