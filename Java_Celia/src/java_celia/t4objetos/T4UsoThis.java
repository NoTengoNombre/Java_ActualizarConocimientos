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

public class T4UsoThis {

}

class NaveEspacial {

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
        NaveEspacial nave1 = new NaveEspacial();
        try {
            NaveEspacial nave2 = (NaveEspacial) nave1.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(NaveEspacial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
