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
public class T4x3ObjetosReferenciaEntreVarios {

}

class Persona3 {

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

}

class Test {

    public static void main(String[] args) {
//Se pasa por referencia la posicion de memoria de un objeto a otro
//Los 2 objetos apuntan a la misma zona de memoria , eso significa
// que si se modifica 1 , el otro también se modificara.

        Persona3 p1 = new Persona3();
        Persona3 p2 = new Persona3();

        p1.setNombre("Dennis");
        p2.setNombre("Tom");

        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

//        Ahora ambos objetos estan apuntando a la misma posicion de memoria
        p2 = p1;

        System.out.println("Despues de hacer p2 = p1 ");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        p2.setNombre("Ada");

        System.out.println("Despues de cambiar el nombre de p2 ");
        System.out.println("El nombre de p1 es : " + p1.getNombre());
        System.out.println("El nombre de p2 es : " + p2.getNombre());

        System.out.println("\n"
                + "Al asignar p2 = p1 hemos igualado sus posiciones "
                + "de memoria, y cualquier cambio en uno implica\n"
                + "un cambio en el otro. "
                + "Desde ese momento, en realidad los "
                + "dos objetos han pasado a ser el mismo");

    }
}
