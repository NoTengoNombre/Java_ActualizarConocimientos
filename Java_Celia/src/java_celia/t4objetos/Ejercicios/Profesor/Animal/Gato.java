/**
 * @created on : 24-ago-2017, 23:56:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.Animal;

public class Gato extends Animal {

    private int numVidas = 7;

    /**
     * Constructor por defecto
     */
    public Gato() {
        super();
        numVidas = 7;
    }

    /**
     * Constructor Basico del profesor
     *
     * @param nombre
     * @param edad
     */
    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor copia
     *
     * @param a
     */
    public Gato(Animal a) {
        this.edad = a.getEdad();
        this.nombre = a.getNombre();
    }

    /**
     *
     * @param numVidas
     */
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    /**
     * Obtener nº de vidas 
     *
     * @return
     */
    public int getNumVidas() {
        return this.numVidas;
    }

    public void quitaVida() {
        numVidas--;
    }

    @Override
    public String toString() {
        return "Hola , soy un ♥ Gato , me llamo " + nombre + " tengo " + edad + " anio y me quedan " + numVidas + " vidas";

    }
}
