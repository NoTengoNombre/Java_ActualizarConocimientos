/**
 * @created on : 22-ago-2017, 9:38:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class T4UsoThisMetodotoString {

}

class NaveEspacialToString {

//    atributo de instancia
    private int vidas;

    /**
     * Metodo de instancia
     *
     * @return vidas
     */
    public int getVidas() {
        return this.vidas;
    }

    /**
     * Aqui usamos 'this' para distinguir el parametro 'vidas' del atributo
     * 'vidas'
     *
     * @param vidas
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public static void main(String[] args) {

        NaveEspacialToString nave1 = new NaveEspacialToString();


        System.out.println("paquete.subpaquete.clase@direccionDeMemoriaHexadecimal");
        System.out.println(nave1.toString());
    }

}
