/**
 * @created on : 28-jul-2017, 23:15:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

public class DivisionMes {

    public static int mesFormateado(int mes) {

        int mesDecenas;
        int mesResto;
        int mesModulo1;
        int mesSumaDecenas;

        mesDecenas = mes * 10;
        mesResto = mesDecenas / 100;

        int mesModulo = mes % 100;
        mesModulo1 = mesModulo % 10;

        mesSumaDecenas = mesResto + mesModulo1;

        System.out.println("mes : " + mes);

        System.out.println("Primer numero : " + mesResto);
        System.out.println("Segundo numero : " + mesModulo1);
        System.out.println("Suma Primer y Segundo : " + mesSumaDecenas);

        int mesUnidades;
        int mesDivide100;
        int mesModulo10;
        int mesUnidadesFinal;

        mesUnidades = mesSumaDecenas * 10;
        mesDivide100 = mesUnidades / 100;
        int mesModulo2 = mesSumaDecenas % 100;
        mesModulo10 = mesModulo2 % 10;
        mesUnidadesFinal = mesDivide100 + mesModulo10;
        System.out.println("Valor : " + mesUnidadesFinal);
        return mesUnidadesFinal;
    }

    public static void main(String[] args) {

        System.out.println("-------------------");
        int mesFormateado = mesFormateado(12);
        System.out.println("mes : " + mesFormateado);

    }
}
