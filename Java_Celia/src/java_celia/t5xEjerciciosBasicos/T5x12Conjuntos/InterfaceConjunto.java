/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t5xEjerciciosBasicos.T5x12Conjuntos;

/**
 * CONSTANTES
 *
 * Metodo public o abstract
 *
 * @author Portatil_Bot
 */
public interface InterfaceConjunto {

    /**
     * Metodo abstract void
     *
     * Inserta Elemento
     *
     * @param obj
     */
    public abstract void setInsertarElemento(Object obj);

    /**
     * Metodo abstract void
     *
     * Borra Elemento
     *
     * @param obj
     */
    public abstract void setBorrarElementos(Object obj);

    /**
     * Metodo abstract void
     *
     * Vacia Elementos
     */
//    public abstract void setVaciarConjunto();
    public void setVaciarConjunto();

    /**
     * Busca y comprueba si el elemento existe
     *
     * Metodo int sin modificador Abstract
     *
     * @param obj
     * @return -1 si no encuentra el objeto
     */
    public int getEsta(Object obj);

    /**
     * Metodo static implementado
     */
    public static void setMensaje() {
        System.out.println("Soy metodo static void de la Interfaz : " + Object.class.getName());
    }
}
