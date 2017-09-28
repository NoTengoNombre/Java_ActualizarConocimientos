/**
 * @created on : 28-sep-2017, 16:57:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ObjectOutputInputStream;

public class Persona implements java.io.Serializable {

    protected String nombre;
    protected int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Nombre : " + getNombre() + " - Edad : " + getEdad());
    }
}
