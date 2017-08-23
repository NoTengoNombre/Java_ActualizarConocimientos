/**
 * @created on : 22-ago-2017, 10:57:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

/**
 * NO EXISTE parametro por Referencia
 *
 * @author Portatil_Bot
 */
public class T4x3ParametrosPorReferenciaEjemplo2 {

}

class Persona2 {

    private String nombre;

    /**
     * Pasando el valor por referencia
     *
     * @return referencia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Pasando el valor por referencia
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
// Esta instancia hace Referencia al 'objeto' que esta dentro del metodo cambiarNombre
// porque actua como unica REFERENCIA 
        Persona p = new Persona(); // Creamos un objeto Persona

        p.setNombre("♦ Raul");
        System.out.println("♦ Nombre : " + p.getNombre());

        cambiarNombre(p); // Este metodo recibe el objeto 'p' y le cambia el nombre
        System.out.println("♦ El nombre es : " + p.getNombre());
    }

    /**
     * Paso de parametros por Referencia
     *
     * cambiarNombre actua sobre la misma region de la memoria que el main
     *
     * @param p Objeto que hace referencia a la misma posicion de memoria que el
     * objeto principal
     */
//                                   parametro formal
    private static void cambiarNombre(Persona p) {
//        Parametro actual 
//Se pasa por REFERENCIA : lo cambios se hacen sobre el objeto real y unico
// Se trata de cambios en un solo OBJETO para toda la clase
        p.setNombre("• Laur");
        System.out.println("• El nombre es : " + p.getNombre());
    }
}
