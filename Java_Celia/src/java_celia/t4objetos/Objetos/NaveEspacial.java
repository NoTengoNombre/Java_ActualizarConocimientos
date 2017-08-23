/**
 * @created on : 22-ago-2017, 15:51:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Objetos;

public class NaveEspacial {

//    ATRIBUTO DE CLASE
//    Contador de objetos : 1 copia para todos los objetos
//    Se incrementa cada vez que se instancia un objeto
    private static int naves = 0;
//    ATRIBUTO DE INSTANCIA
//    Muchas copias por cada objeto
//    NO Se incrementa cada vez que se instancia un objeto
    private int vidas = 0;

    /**
     * Construtor
     */
    public NaveEspacial() {
        naves++;
        vidas++;
    }

    /**
     * Devuelve 1 copia del objeto Naves
     *
     * @return
     */
    public static int getNaves() {
        return naves;
    }

    /**
     * Devuelve x copias del objeto vidas con valor 0 porque siempre es una
     * copia del 1º
     *
     * @return
     */
    public int getVidas() {
        return vidas;
    }

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        System.out.println("Nave 1 : naves = " + nave1.getNaves() + " vidas " + nave1.getVidas());
        NaveEspacial nave2 = new NaveEspacial();
        System.out.println("Nave 2 : naves = " + nave2.getNaves() + " vidas " + nave2.getVidas());
//     Forma correcta : Para acceder a los atributos de clase Usar el nombre de la clase
//        System.out.println("Nave 2 : naves = " + NaveEspacial.getNaves() + " vidas " + nave2.getVidas());

        int x = nave1.vidas = 10;
        System.out.println("valor es : " + x);

    }
}
