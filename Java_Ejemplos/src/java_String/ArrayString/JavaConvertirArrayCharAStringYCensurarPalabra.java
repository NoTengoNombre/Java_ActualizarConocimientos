/**
 * @created on : 11-sep-2017, 16:52:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String.ArrayString;

public class JavaConvertirArrayCharAStringYCensurarPalabra {

    public String[] getMensajeCensurado() {
        String[] st = {"El", "perro", "de", "San", "Roque"};
        String palabraCensurar = "perro";
        String intercambio = null;

        boolean stop = true;

        for (int i = 0; i < st.length && stop; i++) {
            if (palabraCensurar == st[i]) {
                String palabra = st[i];
                char[] cambia = new char[palabra.length()];

                for (int j = 0; j < palabra.length(); j++) {
                    cambia[j] = palabra.charAt(j);
                    cambia[j] = '*';
                }
                intercambio = new String(cambia);
                stop = false;
            }
            if (palabraCensurar == st[i]) {
                st[i] = intercambio;
            }
        }

        for (String st1 : st) {
            System.out.println(st1);
        }
        return st;
    }

    public static void main(String[] args) {

        JavaConvertirArrayCharAStringYCensurarPalabra v = new JavaConvertirArrayCharAStringYCensurarPalabra();
        v.getMensajeCensurado();
    }
}
