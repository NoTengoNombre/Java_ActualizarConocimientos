/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t4objetos.APi;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Para usar la API de GregorianCalendar
 *
 * 1º Calendar es una clase abstracta lo cual no tiene objetos instanciados
 *
 * 2º Calendar : sus atributos "estados" son CONSTANTES - public final STATIC
 *
 * @author RVS
 */
public class APIFecha {

    /**
     *
     * // 1º instancia la clase fecha Date date = new Date(); GregorianCalendar
     * calendario = new GregorianCalendar(); calendario.setTime }
     *
     */
    public static void main(String[] args) {
        Date date = new Date();
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(date);
        int dia = calendario.DAY_OF_MONTH;
        int mes = calendario.MONTH;
        int anio = calendario.YEAR;
        int hora = calendario.HOUR;
        int minuto = calendario.MINUTE;
        int segundo = calendario.SECOND;
        System.out.println(""
                + "Fecha y hora actual : "
                + " anio " + anio
                + " mes " + mes
                + " dia " + dia
                + " hora " + hora
                + " minuto " + minuto
                + " segundo " + segundo);

    }
}
