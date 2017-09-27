/**
 * @created on : 27-sep-2017, 11:48:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.Serializacion;

import java.io.Serializable;

public class T6ObjectInputOutputStream {

}

/**
 * Clase a serializar
 *
 * Se busca crear un objeto y transmitirlo
 *
 * @author Portatil_Bot
 */
class PersonaBasica implements Serializable {

    protected String nombre;
    protected int edad;

    public PersonaBasica() {
    }

    public PersonaBasica(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre : " + nombre + " edad " + edad);
    }

}
