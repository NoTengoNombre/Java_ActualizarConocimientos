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

public class T4UsoThisMetodoFinalize {

}

class NaveEspacialFinalize {

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

        try {
            NaveEspacialFinalize nave1 = new NaveEspacialFinalize();

            System.out.println("paquete.subpaquete.clase@direccionDeMemoriaHexadecimal");
            nave1.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(NaveEspacialFinalize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
