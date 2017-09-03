/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t5xEjerciciosBasicos.T5x12ConjuntosArrayList;

import java.util.ArrayList;

/**
 * CONSTANTES
 *
 * Metodo public o abstract
 *
 * @author Portatil_Bot
 */
public interface InterfaceConjuntoArrayList {

    /**
     * Metodo abstract void
     *
     * Inserta Elemento
     *
     * @param e
     */
    public abstract void setInsertarElemento(ArrayList e);

    /**
     * Metodo abstract void
     *
     * Borra Elemento
     *
     * @param e
     */
    public abstract void setBorrarElementos(ArrayList e);

    /**
     * Metodo abstract void
     *
     * Vacia Elementos
     */
    public abstract void setVaciarConjunto();
//    Metodo no abstract 
//    public void setVaciarConjunto();

    /**
     * Busca y comprueba si el elemento existe
     *
     * Metodo int sin modificador abstract
     *
     * @param e
     * @return
     */
    public int getEsta(ArrayList e);

    /**
     * Metodo static implementado
     */
    public static void setMensaje() {
        System.out.println("Soy metodo static void de la Interfaz : " + Object.class.getName());
    }
}
