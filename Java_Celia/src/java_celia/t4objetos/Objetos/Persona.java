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
public class Persona {

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

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setNombre("Diego");
        p2.setNombre("Santiago");

        System.out.println(" --------- Objetos Independientes --------- ");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        p2 = p1;

        System.out.println(" --------- Objetos Dependientes --------- ");
        System.out.println("Despues de hacer p2 = p1 : Se igualan las posiciones de memoria ");
        System.out.println("Cualquier cambio en uno implica al otro ");
        System.out.println(" --------- ------------------- ---------- ");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        System.out.println(" --------- Objetos Dependientes --------- ");

        p2.setNombre("Ana");
        System.out.println("Despues de hacer p2 = p1 : ");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

    }
}
