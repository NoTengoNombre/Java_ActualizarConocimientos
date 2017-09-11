/**
 * @created on : 10-sep-2017, 18:42:39
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

import java.util.ArrayList;
import java.util.List;

public class JavaxConvertirStringCharConEspaciosEnBlanco {

    public static void main(String[] args) {

        Subcadena subcadena = new Subcadena();
        subcadena.setStringToArrayChar("Introduce una frase por teclados");
    }
}

class Subcadena {

    public String[] getArrayStringSinNull(String[] arrayString) {
        List<String> list = new ArrayList<>();

        for (String s : arrayString) {
            if (s != null && s.length() > 0) {
                list.add(s);
            }
        }
        arrayString = list.toArray(new String[list.size()]);
        return arrayString;
    }

    /**
     * Convierte un String a un array de character para poder encontrar la parte
     * que se encuentra el espacio
     *
     * @param cad
     * @return
     */
    public String[] setStringToArrayChar(String cad) {
//       Añadimos un espacio en blanco para que tenga en cuenta la ultima frase
        String cadena = cad + " ";
        String str = null;
        String[] contenedorString = null;

        System.out.println("cadena : " + cadena.toCharArray().length);

        char[] caracteres = new char[cadena.toCharArray().length];

        for (int i = 0; i < cadena.length(); i++) {

            caracteres[i] = cadena.charAt(i);
            contenedorString = new String[cadena.length()];

            if (caracteres[i] == ' ') {
                str = String.valueOf(caracteres);
                contenedorString[i] = str;
                System.out.println(contenedorString[i]);
            }
        }

        return contenedorString;
    }
}
