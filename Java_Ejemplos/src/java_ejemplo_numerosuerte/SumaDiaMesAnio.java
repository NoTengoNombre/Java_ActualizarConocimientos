/**
 * @created on : 29-jul-2017, 12:18:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

public class SumaDiaMesAnio {

    /**
     * Hacer suma de fecha y dividirlo correctamente
     *
     * @param dia
     * @param mes
     * @param anio
     * @return
     */
    public static int sumarTodasFechas(int dia, int mes, int anio) {
        System.out.println("dia : " + dia);
        System.out.println("mes : " + mes);
        System.out.println("anio : " + anio);
        int sumaTotal = dia + mes + anio;
        System.out.println("Suma Total : " + sumaTotal);
        int calculo = sumaTotal * 10; // quita esto
        int divide_calculo = calculo / 100;
        int resto_calculo = calculo % 100;
        int divide_calculo2 = resto_calculo / 10;
        int resto_final = divide_calculo + divide_calculo2;
        int calculo2 = resto_final * 10;
        int divide_calculo_resto = calculo2 / 100;
        int resto_calculo2 = calculo2 % 100;
        int final_resto = resto_calculo2 / 10;
        System.out.println("Aqui : " + final_resto + divide_calculo_resto / 10);
        return sumaTotal;
    }

    /**
     * Hacer suma de fecha y dividirlo correctamente
     *
     * @param dia
     * @param mes
     * @param anio
     * @return
     */
    public static int sumarTodasFechas2(int dia, int mes, int anio) {
        System.out.println("dia : " + dia);
        System.out.println("mes : " + mes);
        System.out.println("anio : " + anio);

        int sumaTotal = dia + mes + anio;
        System.out.println("Suma Total : " + sumaTotal);

        int calculo = sumaTotal * 10; // quita esto
        int divide_calculo = calculo / 100;
        int resto_calculo = calculo % 100;
        int divide_calculo2 = resto_calculo / 10;
        int resto_final = divide_calculo + divide_calculo2;
        int calculo2 = resto_final * 10;
        int divide_calculo_resto = calculo2 / 100;
        int resto_calculo2 = calculo2 % 100;
        int final_resto = resto_calculo2 / 10;
        System.out.println("Aqui : " + final_resto + divide_calculo_resto);
        int final_resto2 = final_resto + divide_calculo_resto / 10;
        System.out.println("Aqui 2: " + final_resto2);

        return final_resto2;
    }

    public static void main(String[] args) {

        sumarTodasFechas2(8, 3, 6);
    }
}
