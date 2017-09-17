/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces;

/**
 *
 * @author Portatil_Bot
 */
public interface SopaDeLetraMatriz {

    public char[][] getGenerarMatrizCaracterAleatorios(int fila, int col);

    /**
     * Devuelve una palabra en base a una longitud
     *
     * @param longitudMatriz
     * @return Longitud vertical u horizontal
     */
    public String getElegirPalabraSopaLetras(int longitudMatriz);

}
