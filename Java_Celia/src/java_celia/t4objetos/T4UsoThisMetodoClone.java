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

public class T4UsoThisMetodoClone {

}

class NaveEspacialClone {

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
        NaveEspacialClone nave1 = new NaveEspacialClone();
        try {
            NaveEspacialClone nave2 = (NaveEspacialClone) nave1.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(NaveEspacialClone.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
