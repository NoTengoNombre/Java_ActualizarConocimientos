/**
 * @created on : 03-ago-2017, 18:28:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class T3__32CalculadoraDeEdadProfesorScanner {

    int contadord = 0;
    int hora = 0;
    int conta = 0;

    // Devuelve la edad en años de una persona
//                      2000        2017         9           8           14          4
    public int ano(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//            17         2017     2000
        int edadAnos = anoAct - anoNac;
//            9        8
        if (mesNac > mesAct) {
//            16
            edadAnos--;
        }
//              9         8          14       4
        if ((mesNac == mesAct) && (diaNac > diaAct)) {
//             16
            edadAnos--;
        }
        return edadAnos;
    }

    // Devuelve la edad en meses de una persona
//                      2000        2017          9          8           14          4
    public int mes(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//            16           2000    2017      9       8       14       4
        int edadAnos = ano(anoNac, anoAct, mesNac, mesAct, diaNac, diaAct);
//            192     =    16    * 12        
        int edadMeses = edadAnos * 12;
        int meses = 0;

        // Calculamos el números de meses transcurrido desde el último cumpleaños
//             9       8
        if (mesNac < mesAct) {	// El cumpleaños ya ha ocurrido en el año actual
//             1       8   -   9  
            meses = mesAct - mesNac;
        }  //  9       8
        if (mesNac > mesAct) {	// Aún no ha cumplido los años en el año actual
//            11  = (12 - 9 = 3 )    +   8                  
            meses = (12 - mesNac) + mesAct;
        }

        // Ajustamos el pico de meses mirando si ya ha llegado el "cumplemeses" o no
//            14        4
        if (diaNac > diaAct) {
//       11 - 1 = 10
            meses--;	// Aún no ha llegado el "cumplemeses", así que quitamos un mes
        }
//        202     =    192    + 10
        edadMeses = edadMeses + meses;
        return edadMeses;
    }

    // Devuelve la edad en días de una persona
    public int dia(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//                    1  2   3   4   5   6   7    8   9  10  11  12  13
        int[] mesr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int quitar = 0;
        int edadDias = 0;

//                   2000   2000 <= 2017
        for (int i = anoNac; i <= anoAct; i++) {
            if (esBisiesto(i) == true) {
//                 366        0     + 366
                edadDias = edadDias + 366;
            }
            if (esBisiesto(i) == false) {
//                 365        0     + 365
                edadDias = edadDias + 365;
            }
        }
//                      1 <   9 
        for (int i = 1; i < mesNac; i++) {	//para saber los dias del año en el que naciste
//            240           +   9 
            quitar = quitar + mesr[i];

            if (esBisiesto(anoNac) && (i == 2)) { // para el año bisiesto
                quitar++;
            }
        }
//       259       245  +  14
        quitar = quitar + diaNac;
//                      12 >  8 
        for (int i = 12; i > mesAct; i--) {	//para saber los dias del año actual
//           380   =   259  +  121
            quitar = quitar + mesr[i];

            if (esBisiesto(anoAct) && (i == 2)) {
                quitar++;
            }
        }
//         286 =  259   +       31    (27)     4  
        quitar = quitar + (mesr[mesAct] - diaAct);

//        6289   =    6575  - 286
        edadDias = edadDias - quitar;
        return edadDias;
    }

    // Devuelve la edad en horas de una persona
    public int hora(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int h = dia(anoNac, anoAct, mesNac, mesAct, diaNac, diaAct) * 24;
        return h;
    }

    // Devuelve la edad en minutos de una persona
    public int minuto(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int m = hora(anoNac, anoAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return m;
    }

    // Devuelve la edad en segundos de una persona
    public int segundo(int anoNac, int anoAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int s = minuto(anoNac, anoAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return s;
    }

    private boolean esBisiesto(int i) {
        if ((i % 4 == 0) && (i % 400 == 0 || i % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        T3__32CalculadoraDeEdadProfesorScanner c = new T3__32CalculadoraDeEdadProfesorScanner();
        Calendar ahora = Calendar.getInstance();
        int diaA = ahora.get(Calendar.DAY_OF_MONTH);
        int mesA = ahora.get(Calendar.MONTH) + 1;
        int anioA = ahora.get(Calendar.YEAR);
        System.out.println("Fecha actual: " + diaA + "/" + mesA + "/" + anioA);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu dia de nacimiento");
        int diaN = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        int mesN = sc.nextInt();
        System.out.println("Introduce tu año de nacimiento");
        int anioN = sc.nextInt();

        System.out.println("Tu edad es de: ");
        System.out.println(c.ano(anioN, anioA, mesN, mesA, diaN, diaA) + " años ");
        System.out.println(c.mes(anioN, anioA, mesN, mesA, diaN, diaA) + " meses ");
        System.out.println(c.dia(anioN, anioA, mesN, mesA, diaN, diaA) + " días ");
        System.out.println(c.hora(anioN, anioA, mesN, mesA, diaN, diaA) + " horas ");
        System.out.println(c.minuto(anioN, anioA, mesN, mesA, diaN, diaA) + " minutos ");
        System.out.println(c.segundo(anioN, anioA, mesN, mesA, diaN, diaA) + " segundos ");
    }
}
