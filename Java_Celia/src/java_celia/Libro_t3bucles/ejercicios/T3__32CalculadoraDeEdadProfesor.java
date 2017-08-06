/**
 * @created on : 03-ago-2017, 18:28:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;

public class T3__32CalculadoraDeEdadProfesor {

    int contadord = 0;
    int hora = 0;
    int conta = 0;

//    Devuelve la edad en anios de una persona
//                       2000         2017          11           8           6          4
    public int anio(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//            17           2017    2000
        int edadAnios = anioAct - anioNac;
//            11        8
        if (mesNac > mesAct) {
            edadAnios--; //  2017 - 2000 = 17
        }
//             11         8           6        4
        if ((mesNac == mesAct) && (diaNac > diaAct)) {
            edadAnios--;  //  2017 - 2000 = 17
        }
        return edadAnios; // 17 o 16
    }

//    Devuelve la edad en meses de una persna
    public int mes(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//                            2000     2017     11       8       6        4
        int edadAnios = anio(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct);
//            204     = 17 o 16  * 12
        int edadMeses = edadAnios * 12;
        int meses = 0;

//        Calculamos el numeros de meses transcurrido desde el último cumpleaños
//            11        8
        if (mesNac < mesAct) { // El cumpleaños ya ha ocurrido en el año actual
//            3        8   -   11
            meses = mesAct - mesNac;
        }
//             11       8
        if (mesNac > mesAct) { // Aún no ha cumplido los años en el año actual
//            9   =  12 -   11    +    8 
            meses = (12 - mesNac) + mesAct;
        }

//        Ajustamos el pico de meses mirando si ya ha llegado el "cumplemeses" o no
//            6    >   4
        if (diaNac > diaAct) {
//            8
            meses--;
//                        204     +  9
            edadMeses = edadMeses + meses;
        }
//                213
        return edadMeses;
    }

    // Devuelve la edad en días de una persona
    public int dia(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
//                    1   2   3   4   5  6   7    8  9   10  11  12  13
        int[] mesr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int quitar = 0;
        int edadDias = 0;

//                    2000  ; 2000 <= 2017
        for (int i = anioNac; i <= anioAct; i++) {
            if (esBisiesto(i) == true) {
                edadDias = edadDias + 366;
            }
            if (esBisiesto(i) == false) {
                edadDias = edadDias + 365;
            }
        }
//                      1 < 11
        for (int i = 1; i < mesNac; i++) { // para saber lo dias del año en el que nacistes
//             31    =   0    +  31
            quitar = quitar + mesr[i];
            if (esBisiesto(anioNac) && (i == 2)) {
                quitar++;
            }
        }
//        17        11        6
        quitar = quitar + diaNac;

//                             8
        for (int i = 12; i > mesAct; i--) { // para saber los dias del año actual
            quitar = quitar + mesr[i];
            if (esBisiesto(anioNac) && (i == 2)) {
                quitar++;
            }
        }
        quitar = quitar + diaNac;

        for (int i = 12; i > mesAct; i--) {
            quitar = quitar + mesr[i];
            if (esBisiesto(anioAct) && (i == 2)) {
                quitar++;
            }
        }
        quitar = quitar + (mesr[mesAct] - diaAct);

        edadDias = edadDias - quitar;
        return edadDias;
    }

//    Devuelve la edad en horas de una persona
    public int hora(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int h = dia(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 24;
        return h;
    }

    public int minuto(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int m = hora(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return m;
    }

    public int segundos(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int s = hora(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return s;
    }

    private boolean esBisiesto(int i) {
        if ((i % 4 == 0) && (i % 400 == 0 || i % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        T3__32CalculadoraDeEdadProfesor c = new T3__32CalculadoraDeEdadProfesor();
        Calendar ahora = Calendar.getInstance();
        int diaA = ahora.get(Calendar.DAY_OF_MONTH);
        int mesA = ahora.get(Calendar.MONTH) + 1;
        int anioA = ahora.get(Calendar.YEAR);
        System.out.println("Fecha actual: " + diaA + "/" + mesA + "/" + anioA);

        System.out.println("Introduce tu dia de nacimiento");
        int diaN = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce tu mes de nacimiento");
        int mesN = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce tu año de nacimiento");
        int anioN = Integer.parseInt(System.console().readLine());

        System.out.println("Tu edad es de: ");
        System.out.println(c.anio(anioN, anioA, mesN, mesA, diaN, diaA) + " años ");
        System.out.println(c.mes(anioN, anioA, mesN, mesA, diaN, diaA) + " meses ");
        System.out.println(c.dia(anioN, anioA, mesN, mesA, diaN, diaA) + " días ");
        System.out.println(c.hora(anioN, anioA, mesN, mesA, diaN, diaA) + " horas ");
        System.out.println(c.minuto(anioN, anioA, mesN, mesA, diaN, diaA) + " minutos ");
        System.out.println(c.segundos(anioN, anioA, mesN, mesA, diaN, diaA) + " segundos ");
    }
}
