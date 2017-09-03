/**
 * @created on : 03-sep-2017, 17:14:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12Conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase no invoca la "Interfaces" - InterfaceConjunto pero puede llamar a
 * su metodo implementado STATIC llamado setMensaje()
 *
 *
 * @author Portatil_Bot
 */
public class ConjuntoDeEnteros extends AbstractConjunto {

    private static final List<Integer> ARRAY2 = new ArrayList<Integer>();

    public static List<Integer> getARRAY2() {
        return Collections.unmodifiableList(ARRAY2);
    }

    @Override
    public void setInsertarElemento(Object obj) {
        ARRAY2.add((Integer) obj);
    }

    @Override
    public void setBorrarElementos(Object obj) {
        ARRAY2.remove(obj);
    }

    @Override
    public void setVaciarConjunto() {
        ARRAY2.clear();
    }

    @Override
    public int getEsta(Object obj) {
        return ARRAY2.indexOf(obj);
    }

    public static void main(String[] args) {

        InterfaceConjunto.setMensaje();

        Integer i1 = Integer.MAX_VALUE;
        Integer i2 = Integer.MIN_VALUE;
        Integer i3 = Integer.SIZE;
        Integer i4 = Integer.reverse(123456);
        Integer i5 = Integer.compare(i1, i2);
        Integer i6 = Integer.parseInt("12345");

        ConjuntoDeEnteros cde = new ConjuntoDeEnteros();
        System.out.println("Invertir numero de bytes : " + i4);

        cde.setInsertarElemento(i1);
        cde.setInsertarElemento(i2);
        cde.setInsertarElemento(i3);
        cde.setInsertarElemento(i4);
        cde.setInsertarElemento(i5);
        cde.setInsertarElemento(i6);

        ConjuntoDeEnteros.getARRAY2().forEach((indice) -> {
            System.out.println(indice);
        });

    }

}
