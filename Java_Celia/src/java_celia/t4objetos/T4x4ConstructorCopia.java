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
 * Se busca que ambos objetos 'p1' y 'p2' se copien los datos no que sean el
 * mismo
 *
 * @author Portatil_Bot
 */
public class T4x4ConstructorCopia {

}

/**
 * Se busca copiar los valores NO QUE NO SEAN EL MISMO OBJETO CON DISTINTO
 * NOMBRE
 *
 * @param p
 */
class Persona4 {

    private String nombre;

    /**
     * Se busca copiar los valores NO QUE NO SEAN EL MISMO OBJETO CON DISTINTO
     * NOMBRE
     *
     * @param p
     */
    public Persona4(Persona3 p) {
        this.nombre = p.getNombre();
    }

    /**
     * Se devuelve una copia de los valores del objeto, no el objeto en si
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Se fija los valores de un nuevo objeto , no sobre el objeto en si
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Persona3 p3 = new Persona3();
        Persona4 p2 = new Persona4(p3); // constructor copia

        System.out.println("El nombre de p1 es : " + p3.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        p2.setNombre("Ana");

        System.out.println("Despues de cambiar el nombre de p2 : ");
        System.out.println("El nombre de p1 es : " + p3.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

    }

}
