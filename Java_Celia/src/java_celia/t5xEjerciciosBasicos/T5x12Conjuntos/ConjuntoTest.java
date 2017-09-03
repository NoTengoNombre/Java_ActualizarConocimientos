/**
 * @created on : 03-sep-2017, 19:34:04
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.T5x12Conjuntos;

import java.util.Iterator;

public class ConjuntoTest {

    public static void main(String[] args) {

        ConjuntoDeCaracteres cdc = new ConjuntoDeCaracteres();

        String st2 = "String 2";
        String st3 = "String 3";
        String st4 = "String 4";
        String st10 = "String No Existe";

        cdc.setInsertarElemento("String 1"); // Posicion en array : 0
        cdc.setInsertarElemento("String 5"); // Posicion en array : 4
        cdc.setInsertarElemento(st2); // Posicion en array : 1
        cdc.setInsertarElemento(st3); // Posicion en array : 2
        cdc.setInsertarElemento(st4); // Posicion en array : 3

//• Iiterator
//
        for (Iterator<String> it = ConjuntoDeCaracteres.getARRAY().iterator(); it.hasNext();) {
            String string = it.next();
            System.out.println("\u001b[33mValor Almacenado dentro del ArrayList : " + string);
        }

        if (cdc.getEsta("String 4") > 0) {
            System.out.println("Elemento en la posicion : " + cdc.getEsta("String 4"));
        } else {
            System.out.println("Elemento no existe ");
        }

        cdc.getEsta(st10);

        if (cdc.getEsta(st10) > 0) {
            System.out.println("Elemento en la posicion");
        } else {
            System.out.println("Elemento no existe " + cdc.getEsta(st10));
        }

        cdc.setBorrarElementos(st4);

        System.out.println("-----------------------");
        //•For each 
        System.out.println("Borrar el elemento : " + st4);
        for (String string : ConjuntoDeCaracteres.getARRAY()) {
            System.out.println("\u001b[32mElementos dentro del ArrayList : " + string);
        }

        cdc.setVaciarConjunto();

        System.out.println("-----------------------");
        System.out.println("Vaciar de elementos el ArrayList ");
        //• Funcional Operation
        System.out.println("\u001b[35mValores dentro del ArrayList : " + ConjuntoDeCaracteres.getARRAY());
        ConjuntoDeCaracteres.getARRAY().forEach((string) -> {
            System.out.println("\u001b[34mValores dentro del ArrayList : " + string);
        });

    }
}
