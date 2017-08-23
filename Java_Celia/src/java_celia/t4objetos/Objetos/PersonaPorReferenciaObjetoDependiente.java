/**
 * @created on : 22-ago-2017, 15:47:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Objetos;

/**
 * Paso de parametro por Referencia Solo Para Objetos
 *
 * - Parametro formal = parametro de la cabecera del metodo
 *
 * - Parametro actual = variables / valores fuera del metodo
 *
 * Cuando el argumento es un OBJETO en lugar de un primitivo lo que se pasa es
 * su REFERENCIA
 *
 * Le pasamos la posicion de memoria como valor , así que cuando se modifica un
 * parametro formal , también modifica el parametro actual de los elementos de
 * un objeto a otro , podemos acceder a las tripas del objeto y modificar su
 * contenido desde dentro del metodo
 *
 * @author Portatil_Bot
 */
public class PersonaPorReferenciaObjetoDependiente {

    private String nombre;

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Copia la direccion de memoria del objeto
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se ha creado un nuevo OBJETO 'persona' y se ha asignado a 'p'
     *
     * @param p
     */
    private static void cambiarNombre(PersonaPorReferenciaObjetoDependiente p) {
//        Dependo del Objeto 'p' Instanciado dentro del MAIN
//        p = new PersonaPorReferenciaObjetoDependiente(); // si lo dejo estaria creando una nueva referencia a un nuevo OBJETO INDEPENDIENTE DEL MAIN
        System.out.printf("\u001b[32m -> Dentro del metodo 'cambiarNombre' "
                + "las modificaciones y asignaciones que haga al objeto 'p' afectaran "
                + "al objeto que esta instanciado con el mismo nombre de la clase dentro del metodo MAIN");
        p.setNombre("• Santiago");
        System.out.println("• El nombre es : " + p.getNombre());
    }

    public static void main(String[] args) {
        PersonaPorReferenciaObjetoDependiente p = new PersonaPorReferenciaObjetoDependiente(); // Creamos un objeto Persona
        p.setNombre("\u001b[35m ♦ Diego"); // le asignamos un nombre
        System.out.printf("\u001b[36m ♦ Nombre : " + p.getNombre());
        cambiarNombre(p); // Este metodo recibe el objeto 'p' y le cambia el nombre
        System.out.printf("\u001b[35m ♦ El nombre es : " + p.getNombre());
        System.out.println("");
    }
}
