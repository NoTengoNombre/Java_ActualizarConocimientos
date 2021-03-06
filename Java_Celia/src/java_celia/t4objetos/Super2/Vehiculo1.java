/**
 * @created on : 23-ago-2017, 19:23:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Super2;

/**
 * Hace referencia al objeto actual
 *
 * Ejecutara versiones de los metodos de la SuperClase en vez de la clase Actual
 *
 * A miembros protected de la superClase pero no a private
 *
 * No accede a metodos Static
 *
 * @author Portatil_Bot
 */
public class Vehiculo1 {

    protected String marca;

    public Vehiculo1(String marca) {
        this.marca = marca;
    }

    /**
     * superClase
     *
     * @param m
     */
    public void setMarca(String m) {
        marca = m;
    }

    /**
     * superClase
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo de la SUPERCLASE - Vehiculo
     */
    public void info() {
        System.out.println("• 1 Soy un vehiculo de la marca " + marca);
    }
}

/**
 * SubClase
 *
 * @author Portatil_Bot
 */
class Bicicleta1 extends Vehiculo1 {

    private int tamRueda; // tamaño de rueda
    protected String marca;

    /**
     * Para recibir las 2 marcas distintas
     *
     * 1 para Vehiculo1
     *
     * 1 para Bicicleta1
     *
     * @param marca1
     * @param marca2
     */
    public Bicicleta1(String marca1, String marca2) {
        super(marca1);
        this.marca = marca2;
    }

    /**
     * metodo subclase
     *
     * @param m1
     * @param m2
     */
    public void setMarca(String m1, String m2) {
        super.marca = m1; // Establece el valor del atributo SuperClase
        this.marca = m2; // Establece el valor del atributo Clase hija
    }

    /**
     * metodo subclase
     *
     * @param tamanio
     */
    public void setTamRueda(int tamanio) {
        tamRueda = tamanio;
    }

    /**
     * metodo subclase
     *
     * @return
     */
    public int getTamRueda() {
        return tamRueda;
    }

    /**
     * Este metodo se ejecutara cuando se invoque desde un objeto de la clase
     * Bicicleta1
     */
    @Override
    public void info() {
        super.info(); // invoca al metodo de la SuperClase 
        System.out.println("♦ 2 Soy Clase Bicicleta : metodo que invoca al de la SuperClase Vehiculo ");
        System.out.println("♦ 3 Soy una bicicleta de marca : " + marca + " y tamaño de rueda " + tamRueda + " pulgadas");
    }

}
