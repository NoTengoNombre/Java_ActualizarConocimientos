/**
 * @created on : 22-ago-2017, 15:47:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ConstructorCopia;

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
class Persona {

    private String nombre;

    public Persona() {
    }

    public Persona(final Persona p) {
        this.nombre = p.getNombre();
    }

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

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setNombre("Diego");

        Persona p2 = new Persona(p1);

        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        System.out.println("Despues de cambiar el nombre de p2 : ");
        p2.setNombre("Ana");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

    }

}
