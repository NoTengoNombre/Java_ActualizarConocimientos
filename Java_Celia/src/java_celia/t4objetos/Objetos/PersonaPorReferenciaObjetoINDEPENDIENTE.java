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
public class PersonaPorReferenciaObjetoINDEPENDIENTE {

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
    private static void cambiarNombre(PersonaPorReferenciaObjetoINDEPENDIENTE p) {
//        Soy un OBJETO INDEPENDIENTE del OBJETO INSTANCIADO dentro del metodo MAIN()
//        Las modificaciones que realice aqui no se veran afectadas en el objeto 'p'
//        que esta dentro del metodo MAIN
        p = new PersonaPorReferenciaObjetoINDEPENDIENTE(); // si lo dejo estaria creando una nueva referencia a un nuevo OBJETO
        p.setNombre("• Santiago : Soy un Objeto Independiente del Objeto que esta Instanciado dentro del Main() ");
        System.out.println("• El nombre es : " + p.getNombre() + " dentro del metodo cambiarNombre ");
    }

    public static void main(String[] args) {
        PersonaPorReferenciaObjetoINDEPENDIENTE p = new PersonaPorReferenciaObjetoINDEPENDIENTE(); // Creamos un objeto PersonaPorReferenciaObjetoINDEPENDIENTE
        p.setNombre("♦ Diego : soy un objeto instanciado dentro del MAIN"); // le asignamos un nombre
        System.out.println("♦ Nombre : " + p.getNombre());
        cambiarNombre(p); // Este metodo recibe el objeto 'p' y le cambia el nombre
        System.out.println("♦ El nombre es : " + p.getNombre() + " Utiliza el objeto del MAIN ");
    }
}
