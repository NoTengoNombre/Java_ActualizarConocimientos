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
public class T4x3ParametrosPorReferenciaEjemplo {

}

class Persona {

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

//        Objeto 1
        Persona p = new Persona(); // Creamos un objeto Persona

        p.setNombre("♦ Raul");
        System.out.println("♦ Nombre : " + p.getNombre());

        cambiarNombre(p); // Este metodo recibe el objeto 'p' y le cambia el nombre
        System.out.println("♦ El nombre es : " + p.getNombre());
    }

    /**
     * Paso de parametros por Referencia Este objeto es independiente del objeto
     * del metodo MAIN()
     *
     * @param p
     */
//                                   parametro formal
    private static void cambiarNombre(Persona p) {
//        Parametro actual
//Se pasa por VALOR 
//        Objeto 2
        p = new Persona();
        p.setNombre("• Laur");
        System.out.println("• El nombre es : " + p.getNombre());
    }
}
