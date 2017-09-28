/**
 * @created on : 28-sep-2017, 23:26:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.BorrarRegistrosPorMarca;

/**
 * Marcar registro que se va a borrar como 'no valido'
 *
 * @author Portatil_Bot
 */
public class Alumno implements java.io.Serializable {

    private char[] nombre;
    private short edad;
    private int expediente;
    private boolean borracho;

    public Alumno() {
    }

    public Alumno(char[] nombre, short edad, int expediente, boolean borracho) {
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = expediente;
        this.borracho = borracho;
    }

    public void setNombre(char[] paramNombre) {
        this.nombre = paramNombre;
    }

    public char[] getNombre() {
        return nombre;
    }

    public void getEdad(short paramEdad) {
        this.edad = paramEdad;
    }

    public short getEdad() {
        return edad;
    }

    public void getExpediente(int paramExpediente) {
        this.expediente = paramExpediente;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setBorracho(boolean paramBorracho) {
        this.borracho = paramBorracho;
    }

    public boolean getBorracho() {
        return borracho;
    }

}
