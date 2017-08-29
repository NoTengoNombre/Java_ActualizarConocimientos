/**
 * @created on : 29-ago-2017, 12:13:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Set;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Clases : TreeSet ( Arbol binario equilibrado, para busqueda de informacion )
 *
 * @author Portatil_Bot
 */
public class MercadoTreeSet {

    /**
     *
     * @param lista
     */
    public static void mostrarLista(Collection lista) {
        System.out.println("Lista del mercado con " + lista.size() + " productos");

        for (Iterator it = lista.iterator(); it.hasNext();) {
            Producto productos = (Producto) it.next();
            System.out.println(productos);
        }
    }

    public static void main(String[] args) {

        Producto pan = new Producto("Pan", 6);
        Producto leche = new Producto("Leche", 2);
        Producto manzanas = new Producto("Manzanas", 5);
        Producto brocoli = new Producto("Brocoli", 5);
        Producto carne = new Producto("Carne", 2);
        Producto res = new Producto("Carne", 3);

        TreeSet lista = new TreeSet();
        lista.add(pan);
        lista.add(leche);
        lista.add(manzanas);
        lista.add(brocoli);
        lista.add(carne);
        lista.add(res);
        System.out.println("-----------------------");
        System.out.println("Lista Basica : " + lista);
        System.out.println("-----------------------");

//        Imprimir contenido de TreeSet
//        Aunque se agregan 6 elementos , el Treeset solo contiene 5
//        TreeSet detecta que el elemento 'carne' esta duplicado
//        Notese que el orden del Treeset refleja un orden ascendente
        mostrarLista(lista);

//        No es posible eliminar elementos por indice
//        Un TreeSet solo elimina por valor de Objeto
        System.out.println("-----------------------");
        lista.remove(manzanas);
        mostrarLista(lista);

        System.out.println("-----------------------");
//        Elimina todos los valor<es del TreeSet
        lista.clear();
        mostrarLista(lista);
    }
}

/**
 * Clase Producto que tiene 2 atributos para almacenar el nombre y la cantidad
 *
 * @author Portatil_Bot
 */
class Producto implements Comparable<Object> {

    /**
     * Atributos para el constructor
     */
    private String nombre;
    private int cantidad;

    /**
     * Constructor basico
     *
     * @param s
     * @param i
     */
    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }

    /**
     * Regresa los elementos que tiene cada objeto de la clase Producto
     *
     * @return
     */
    @Override
    public String toString() {
        return ("• Nombre : " + nombre + " Cantidad " + cantidad);
    }

    /**
     * Sobreescribe el metodo de la clase Object
     *
     * @param objeto
     *
     * @return Compara 2 objetos y los devuelve
     */
    @Override
    public int compareTo(Object objeto) {
//        Indica en base a que atributos se compara el objeto
//        Devuelve +1 si this es > que objeto   
//        Devuelve -1 si this es < que objeto   
//        Devuelve 0 si this si son iguales

        Producto producto = (Producto) objeto;
        String nombreObjeto = producto.nombre.toLowerCase();
        String nombreThis = this.nombre.toLowerCase();
        return (nombreThis.compareTo(nombreObjeto));
    }
}
