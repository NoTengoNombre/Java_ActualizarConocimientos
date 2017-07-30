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

public class T3__20_NumeroDeLaSuerte_Final {

    private static int dia;
    private static int mes;
    private static int anio;
    private static int totalFecha;
    private static int total;
    private static int valor;

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

//    Version arreglada - llega hasta resto 0
    public static int dividir2CifrasAnio(int valor) {
        System.out.println("Anio a dividir :  " + valor);
        int c1 = valor / 1000;
//        System.out.println(" cociente 1º : " + c1);
        int r1 = valor % 1000;
//        System.out.println(" 1º resto : " + r1);
//        System.out.println("-----------------");
        int c2 = r1 / 100;
//        System.out.println(" cociente 2º : " + c2);
        int r2 = r1 % 100;
//        System.out.println(" 2º resto : " + r2);
//        System.out.println("-----------------");
        int c3 = r2 / 10;
//        System.out.println(" cociente 3º  : " + c3);
        int r3 = r2 % 10;
//        System.out.println(" 3º resto : " + r3);
//        System.out.println("-----------------");
        int c4 = r3 / 1;
//        System.out.println(" cociente 4º : " + c4);
        int r4 = r3 % 1;
//        System.out.println(" 4º resto : " + r4);

        total = c1 + c2 + c3 + c4;
//        System.out.println("VER TOTAL : " + total);

        int valor2 = total;
        int c5 = valor2 / 10;
//        System.out.println(" cociente 5º  : " + c5);
        int r5 = valor2 % 10;
//        System.out.println(" 5º resto : " + r5);
//        System.out.println("-----------------");
        int c6 = r5 / 1;
//        System.out.println(" cociente 6º : " + c6);
        int r6 = r5 % 1;
//        System.out.println(" 6º resto : " + r6);

        int total2 = c5 + c6;
//        System.out.println("VER TOTAL 2 : " + total2);

        int c7 = total2 / 10;
//        System.out.println(" cociente 7º  : " + c7);
        int r7 = total2 % 10;
//        System.out.println(" 7º resto : " + r7);

        int valor4 = c7 + r7;
//        System.out.println("Valor final : " + valor4);

        return valor4;
    }

//    Devuelve el mes en un solo numero
    public static int dividir2cifrasMes(int mes) {
        System.out.println("----------- MES ---------------");
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

//    Devuelve el dia en un solo numero
    public static int dividir2cifrasDia(int dia) {
        System.out.println("----------- DIA ---------------");
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

    public static int sumarTodasFechas(int dia, int mes, int anio) {
        System.out.println("dia : " + dia);
        System.out.println("mes : " + mes);
        System.out.println("anio : " + anio);
        int sumaTotal = dia + mes + anio;
        System.out.println("- Ver suma total : " + sumaTotal);

        System.out.println("suma total :" + sumaTotal);

        int calculo = sumaTotal * 10;
        System.out.println("♦ calculo : " + calculo);

        int divide_calculo = calculo / 100;
        System.out.println("♦♦ divide_calculo : " + divide_calculo);

        int resto_calculo = calculo % 100;
        System.out.println("resto calculo : " + resto_calculo);

        int divide_calculo2 = resto_calculo / 10;

        System.out.println("resto calculo : " + divide_calculo2);

        int resto_final = divide_calculo + divide_calculo2;

        System.out.println("resto final : " + resto_final);

        System.out.println("-----------------------------");

        int calculo2 = resto_final * 10;
        System.out.println("calculo2 " + calculo2);
        int divide_calculo_resto = calculo2 / 100;
        System.out.println("divide_calculo_resto " + divide_calculo_resto);
        int resto_calculo2 = calculo2 % 100;
        System.out.println("resto_calculo2 : " + resto_calculo2);
        int final_resto = resto_calculo2 / 10;
        System.out.println("Resto Final : ");
        System.out.println(final_resto + divide_calculo_resto);

        return sumaTotal; // 
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static int totalFecha() {
        totalFecha = dia + dia + anio;
        return totalFecha;
    }

    public static void main(String[] args) {

        System.out.println("dia : " + dia());
        System.out.println("mes : " + mes());
        System.out.println("anio : " + anios());
//        System.out.println("------------------");
        System.out.println("Dia introducido : " + dia);
        System.out.println("Mes introducido : " + mes);
        System.out.println("Anio introducido : " + anio);

        int dividirAnioGeneral = dividir2CifrasAnio(1986);
//        System.out.println("VALOR DEL AÑO DIVIDIDO : " + dividirAnioGeneral);
        System.out.println("---------------------------------");

        int dividir2cifrasMes = dividir2cifrasMes(12);
        System.out.println("Mes total : " + dividir2cifrasMes);
        System.out.println("---------------------------------");
        int dividir2cifrasDia = dividir2cifrasDia(17);
        System.out.println("Dia total : " + dividir2cifrasDia);
        System.out.println("---------------------------------");

        System.out.println("------------- SALIDA --------------------");
        sumarTodasFechas(dividir2cifrasDia, dividir2cifrasMes, dividirAnioGeneral);
    }
}
