/**
 * @created on : 28-ago-2017, 23:38:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones;

import java.util.ArrayList;

public class T5ColeccionesBasicasArrayListMismoTipo {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(Integer.MAX_VALUE);
        array.add(Integer.MIN_VALUE);
        array.add(Integer.BYTES);
        array.add(Integer.SIZE);

//        foreach mejorado - functional
        array.forEach((integer) -> {
            System.out.println("Valor : " + integer);
        });

    }

}
