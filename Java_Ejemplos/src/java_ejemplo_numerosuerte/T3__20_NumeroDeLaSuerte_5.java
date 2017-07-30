/**
 * @created on : 28-jul-2017, 10:48:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

import java.util.Scanner;
import static java_ejemplo_numerosuerte.T3__20_NumeroDeLaSuerte_1.anioActual;

public class T3__20_NumeroDeLaSuerte_5 {

    private static int dia;
    private static int mes;
    private static int anio;
    
    private static int total;

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
            mes = sc.nextInt();
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

    public static int dividir2cifrasAnio(int valor) {
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
       
        total = c1 + c2 + c3 + c4;
        System.out.println("VER TOTAL : " + total);

        int valor2 = total;
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

        return valor4;
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
        System.out.println("dia : " + dia);
        System.out.println("mes : " + mes);
        System.out.println("anio : " + anio);
//        
        int sumaTotal = dia + mes + anio;

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

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("dia : " + dia());
        System.out.println("mes : " + mes());
        System.out.println("anio : " + anios());
        System.out.println("------------------");
        System.out.println("Dia introducido : " + dia);
        System.out.println("Mes introducido : " + mes);
        System.out.println("Anio introducido : " + anio);
        System.out.println("------------------");
        System.out.println("Division : " + dividir2cifrasAnio(anio));
        int anioDividido = dividir2cifrasAnio(anio);
        System.out.println("Anio total " + anioDividido);

        System.out.println("Division final : " + dividir2cifrasAnio(anioDividido));
        int anioResto = dividir2cifrasAnio(anioDividido);
        System.out.println("Anio total : " + anioResto);

        int dividir2cifrasMes = dividir2cifrasMes(mes);
        System.out.println("Mes total : " + dividir2cifrasMes);

        int dividir2cifrasDia = dividir2cifrasDia(dia);
        System.out.println("Dia total : " + dividir2cifrasDia);

        sumarTodasFechas(dividir2cifrasDia, dividir2cifrasMes, anioResto);
//        
//        System.out.println("-------------------------------------------");
        
//        dividir2cifrasAnio(1984);
    }
}
