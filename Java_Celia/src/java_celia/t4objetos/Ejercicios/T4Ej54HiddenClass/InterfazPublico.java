/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t4objetos.Ejercicios.T4Ej54HiddenClass;

/**
 *
 * @author Portatil_Bot
 */
public interface InterfazPublico {

    public static final String MENSAJE = "Soy Una Interfaz";
    public static final int NUMERO = 1;
    public static final double DECIMAL = 12.34;
    public static final boolean FALSO = false;

    void getString(String s);

    void getNumero(int n);

    void getDecimal(double d);

    void getBoolean(boolean b);

    void getVer();

}
