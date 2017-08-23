/**
 * @created on : 22-ago-2017, 9:38:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

public class T4x1AtributosInstancia {

}

class NaveEspacialStatic {

// Atributo de clase
    private static int naves = 0;
// Atributo de instancia
    private int vidas = 0;

    /**
     * Constructor
     */
    public NaveEspacialStatic() {
        naves++;
        vidas++;
    }

    /**
     * Metodo que llama al atributo de clase
     *
     * @return
     */
    public int getNaves() {
        return naves;
    }

    /**
     * Metodo que llama al atributo de instancia
     *
     * @return
     */
    public int getVidas() {
        return vidas;
    }

    public static void main(String[] args) {
        
        NaveEspacialStatic nave1 = new NaveEspacialStatic();
        System.out.println("Nave 1 : naves = " + nave1.getNaves() + " vidas " + nave1.getVidas());

        NaveEspacialStatic nave2 = new NaveEspacialStatic();
        System.out.println("Nave 1 : naves = " + nave2.getNaves() + " vidas " + nave2.getVidas());

    }

}
