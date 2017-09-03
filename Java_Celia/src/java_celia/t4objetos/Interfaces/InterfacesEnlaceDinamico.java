/**
 * @created on : 03-sep-2017, 16:21:15
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces;

public class InterfacesEnlaceDinamico {

    public static void main(String[] args) {

        Elemento elem;
        NombreAble inter;

        elem = new Elemento("Wulf");
        elem.mostrarNombre();

//        Una referencia a interfaz puede
//        utilizar con una instancia de una
//        clase que lo implemente
        inter = elem;
        inter.mostrarNombre();

    }
}
