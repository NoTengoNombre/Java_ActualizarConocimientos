/**
 * @created on : 23-ago-2017, 20:09:10
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ClasesAnidadas;

class ClaseExterna {

    class ClaseInterna {

    }

    public static void main(String[] args) {
        ClaseExterna e = new ClaseExterna();
        System.out.println(e.toString());
        ClaseInterna i = e.new ClaseInterna();
        System.out.println(i.toString());

    }
}
