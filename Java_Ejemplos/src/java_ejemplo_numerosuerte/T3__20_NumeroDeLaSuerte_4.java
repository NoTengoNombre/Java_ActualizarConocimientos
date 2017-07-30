/**
 * @created on : 28-jul-2017, 10:48:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

import java.util.Calendar;
import java.util.Scanner;

public class T3__20_NumeroDeLaSuerte_4 {

    private static int dia;
    private static int mes;
    private static int anio;
    private static int totalFecha;

    public static int dia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un día : ");
        dia = sc.nextInt();
        do {
            if (dia <= 0 || dia > 31) {
                System.out.println("♦ Dia incorrecto : " + dia + " -> Vuelve a intro otro numero");
            } else {
                return dia;
            }
            System.out.println("♦ Introduce un día correcto : ");
            dia = sc.nextInt();
        } while (dia <= 0 || dia > 31);
        return dia;
    }

    public static int mes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un mes : ");
        mes = sc.nextInt();
        do {
            if (mes <= 0 || mes > 12) {
                System.out.println("♦ Mes incorrecto : " + mes + " -> Vuelve a intro otro numero");
            } else {
                return mes;
            }
            System.out.println("♦ Introduce un mes correcto : ");
            dia = sc.nextInt();
        } while (mes <= 0 || mes > 12);
        return mes;
    }

    public static int anios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un anio : ");
        anio = sc.nextInt();
        do {
            if (anio < 1917 || anio > anioActual()) {
                System.out.println("♦ Anio incorrecto : " + anio + " -> Vuelve a intro otro numero");
            } else {
                return anio;
            }
            System.out.println("♦ Introduce un anio correcto : ");
            anio = sc.nextInt();
        } while (anio <= 1900 || anio > anioActual());
        return anio;
    }

    public static int dividir2cifrasDia(int dia) {
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

    public static int dividir2cifrasMes(int mes) {
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

    public static int dividir2cifrasAnio(int anio) {
        System.out.println("--------- ANIO -----------");
        int total2dividir;
        int total3;
        int total3_resto;
        int total4;
        int total_final;

        total2dividir = anio;
        total2dividir = total2dividir * 10;
        total3 = total2dividir / 100;
        total3_resto = total2dividir % 100;
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

    public static int dividirAnioGeneral(int anio) {
        System.out.println("Anio : " + anio);
        int d1 = anio / 1000;
        int r1 = anio % 1000;
        int d2 = r1 / 100;
        int r2 = anio % 100;
        int d3 = r2 / 10;
        int r3 = anio % 10;
        int d4 = r3 / 1;
        anio = d1 + d2 + d3 + d4;
        System.out.println("=========" + anio + "=========");
        return anio; // devuelve la suma de todo el año
    }

    public static int sumarTodasFechas(int dia, int mes, int anio) {
//        System.out.println("dia : " + dia);
//        System.out.println("mes : " + mes);
//        System.out.println("anio : " + anio);
//        
        int sumaTotal = dia + mes + anio;
//        int sumaTotal = 29;

        System.out.println("suma total :" + sumaTotal);

        int calculo = sumaTotal * 10;

        int divide_calculo = calculo / 100;
        System.out.println("♦ divide_calculo : " + divide_calculo);

        int resto_calculo = calculo % 100;
        System.out.println("resto calculo : " + resto_calculo);

        int divide_calculo2 = resto_calculo / 10;

        System.out.println("resto calculo : " + divide_calculo2);

        int resto_final = divide_calculo + divide_calculo2;

        System.out.println("resto final : " + resto_final);

        int final_calculo = resto_final * 10;
        System.out.println("Final : " + final_calculo);

        int final_calculo1 = final_calculo / 100;
        System.out.println("Final : " + final_calculo1);

        int final_calculo2 = final_calculo1 % 100;
        System.out.println("Final 2 : " + final_calculo2);

        int final_calcula3 = final_calculo1 + final_calculo2;

        System.out.println("Final 3 : " + final_calcula3);

        return sumaTotal; // 
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static int totalFecha() {
        totalFecha = dia + mes + anio;
        return totalFecha;
    }

    public static void main(String[] args) {

        System.out.println("dia : " + dia());
        System.out.println("mes : " + mes());
        System.out.println("anio : " + anios());
        System.out.println("------------------");
        System.out.println("Dia introducido : " + dia);
        System.out.println("Mes introducido : " + mes);
        System.out.println("Anio introducido : " + anio);
        System.out.println("Division : " + dividirAnioGeneral(anio));
        int anioDividido = dividirAnioGeneral(anio);
        System.out.println("Anio total " + anioDividido);

        System.out.println("Division final : " + dividir2cifrasAnio(anioDividido));
        int anioResto = dividir2cifrasAnio(anioDividido);
        System.out.println("Anio total : " + anioResto);
//        System.out.println(".................................");

        int dividir2cifrasMes = dividir2cifrasMes(mes);
        System.out.println("Mes total : " + dividir2cifrasMes);

        int dividir2cifrasDia = dividir2cifrasDia(dia);
        System.out.println("Dia total : " + dividir2cifrasDia);

        System.out.println("---------------------------------");
        sumarTodasFechas(dividir2cifrasDia, dividir2cifrasMes, anioResto);
    }
}
