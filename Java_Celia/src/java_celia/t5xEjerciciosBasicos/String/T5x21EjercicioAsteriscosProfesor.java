/**
 * @created on : 25-sep-2017, 0:08:17
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

public class T5x21EjercicioAsteriscosProfesor {

}

class AsteriscosArrayChar {

    /**
     *
     */
    private char[] caracteres;

    /**
     *
     * @param s
     */
    public AsteriscosArrayChar(String s) {
// Convertimos el String en un array de caracteres
        caracteres = s.toCharArray();
    }

    /**
     * Muestra el contenido del array de caracteres
     */
    public void mostrar() {
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }

    /**
     * Convertir las vocales en asteriscos
     */
    public void convertir() {
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                caracteres[i] = '*';
            }
        }
    }
}

class AsteriscosStringBuilder {

    /**
     * Clase que modifica los valores del objeto de la cadena 'mutable'
     */
    private StringBuilder frase;

    /**
     *
     * @param s
     */
    public AsteriscosStringBuilder(String s) {
        frase = new StringBuilder(s);
    }

    /**
     * Muestra el contenido del string
     */
    public void mostrar() {
        System.out.println(frase);
    }

    /**
     * Reemplazar las vocales por asteriscos
     */
    public void convertir() {
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                frase.replace(i, i, "*");
            }
        }
    }
}

class AstericosString {

    /**
     * Cadena : No se modifica , crea una copia de objeto
     */
    private String frase;

    /**
     * Constructor : cada vez que se crea un objeto tipo String se almacena en
     * los atributos de clase
     *
     * @param frase
     */
    public AstericosString(String frase) {
        this.frase = frase;
    }

    /**
     * Mostrar el estado actual del String
     */
    public void mostrar() {
        System.out.println(frase);
    }

    /**
     * Sustituimos las vocales por asteriscos
     */
    public void convertir() {
        frase = frase.replace('a', '*');
        frase = frase.replace('e', '*');
        frase = frase.replace('i', '*');
        frase = frase.replace('o', '*');
        frase = frase.replace('u', '*');
    }
}

class LanzarApp {

    public static void main(String[] args) {

        String str = "Hello, Friend";
        AsteriscosArrayChar a1 = new AsteriscosArrayChar(str);
        AsteriscosStringBuilder a2 = new AsteriscosStringBuilder(str);
        AstericosString a3 = new AstericosString(str);

        a1.convertir();
        a2.convertir();
        a3.convertir();

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();

    }
}
