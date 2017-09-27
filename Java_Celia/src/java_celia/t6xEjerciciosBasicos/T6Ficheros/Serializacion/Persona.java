/**
 * @created on : 27-sep-2017, 12:06:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion;

public class Persona implements java.io.Serializable {

    /**
     * Atributos basicos
     */
    protected String nombre;
    protected int edad;

    /**
     * Constructor basico
     *
     * @param n
     * @param e
     */
    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    /**
     * Metodo para ver el contenido del objeto
     */
    public void mostrar() {
        System.out.println("Nombre : " + nombre + " edad " + edad);
    }

}
