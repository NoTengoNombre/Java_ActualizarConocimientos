/**
 * @created on : 28-jul-2017, 23:15:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

public class DivisionDiaMes {

    public static int diaFormateado(int dia) {

        int dia2;
        int total1;
        int total2;
        int total3;

        dia2 = dia * 10;
        total1 = dia2 / 100;
        int total_resto = dia % 100;
        total2 = total_resto % 10;
        total3 = total1 + total2;

        System.out.println("dia " + dia);

        System.out.println("Primer numero : " + total1);
        System.out.println("Segundo numero : " + total2);
        System.out.println("Tercer numero : " + total3);

        int dia22;
        int total11;
        int total22;
        int total33;

        dia22 = total3 * 10;
        total11 = dia22 / 100;
        int total_resto2 = total3 % 100;
        total22 = total_resto2 % 10;
        total33 = total11 + total22;
        System.out.println("Valor " + total33);
        return total33;
    }

    public static int mesFormateado(int dia) {

        int diaDecenas;
        int diaResto;
        int diaModulo1;
        int diaSumaDecenas;

        diaDecenas = dia * 10;
        diaResto = diaDecenas / 100;

        int diaModulo = dia % 100;
        diaModulo1 = diaModulo % 10;

        diaSumaDecenas = diaResto + diaModulo1;

        System.out.println("dia " + dia);

        System.out.println("Primer numero : " + diaResto);
        System.out.println("Segundo numero : " + diaModulo1);
        System.out.println("Tercer numero : " + diaSumaDecenas);

        int diaUnidades;
        int diaDivide100;
        int diaModulo10;
        int diaUnidadesFinal;

        diaUnidades = diaSumaDecenas * 10;
        diaDivide100 = diaUnidades / 100;
        int diaModulo2 = diaSumaDecenas % 100;
        diaModulo10 = diaModulo2 % 10;
        diaUnidadesFinal = diaDivide100 + diaModulo10;
        System.out.println("Valor " + diaUnidadesFinal);
        return diaUnidadesFinal;
    }

    public static int anioFormateado(int anio) {
        System.out.println("--------- ANIO -----------");
        int total2dividir;
        int total3;
        int total3_resto;
        int total4;
        int total_final;

        total2dividir = anio;
        total2dividir = total2dividir * 10;
        System.out.println("Anio : " + total2dividir);
        total3 = total2dividir / 100;
        System.out.println("total : " + total3);
        total3_resto = total2dividir % 100;
        System.out.println("♦ total : " + total3_resto);
        total4 = total3_resto / 10;
        total_final = total3 + total4;

        System.out.println("Total : " + total_final);
        if (total_final == 10) {
            total_final = 1;
        }
        System.out.println("Anio unido en 1 cifra : " + total_final);
        System.out.println("---------------------------------");

        return total_final; // devuelve la suma del año de 2 cifras
    }

    public static void main(String[] args) {

        System.out.println("-------------------");
        int diaFormateado = diaFormateado(29);
        System.out.println("dia : " + diaFormateado);

        System.out.println("-------------------");
        int mesFormateado = mesFormateado(9);
        System.out.println("mes : " + mesFormateado);

        int anioFormateado = anioFormateado(1999);
        System.out.println("anio : " + anioFormateado);

    }
}
