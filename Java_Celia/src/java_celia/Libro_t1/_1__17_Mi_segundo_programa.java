package java_celia.Libro_t1;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class _1__17_Mi_segundo_programa {

    /**
     * Devuelve un caracter del abecedario.
     *
     * @return caracter
     */
    public static char get_letras() {
        return (char) ((Math.random() * (26) + 'a'));
    }

    /**
     * Devuelve un caracter del tipo. a , e , i , o , u
     *
     * @return caracter
     */
    public static char get_letras_vocales() {
        char valor = ' ';
        char x = (char) ((Math.random() * (26) + 'a'));
        if (x == 'a') {
            valor = x;
        } else if (x == 'e') {
            valor = x;
        } else if (x == 'i') {
            valor = x;
        } else if (x == 'o') {
            valor = x;
        } else if (x == 'u') {
            valor = x;
        }
        return valor;
    }

    /**
     * Metodo genera vocales y espacios en blanco.
     *
     * Cuando genera un espacio en blanco sigue ejecutando el bucle.
     *
     * Cuando genera una vocal sale del bucle , almacena el valor y lo devuelve
     *
     * @return valor
     */
    public static char get_letras_vacias() {
        char valor = get_letras_vocales();
        do {
            valor = get_letras_vocales();
        } while (valor == ' ');
        return valor;
    }

    public static void generar_cinco_vocales() {
        for (int i = 0; i < 5; i++) {
            System.out.print(get_letras_vacias());
            System.out.print(" ");
        }
        System.out.println("");
    }

    /**
     * Escribe un programa en Java que genere cinco caracteres al azar.
     *
     * Cuando lo hayas conseguido, modifícalo para que genere únicamente vocales
     * al azar.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("%5$2s %4$2s %3$2s %2$2s %1$2s\n",
                get_letras_vacias(),
                get_letras_vacias(),
                get_letras_vacias(),
                get_letras_vacias(),
                get_letras_vacias());

        System.out.println("------------------");
        generar_cinco_vocales();
    }

}
