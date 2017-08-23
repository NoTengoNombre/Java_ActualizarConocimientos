/**
 * @created on : 22-ago-2017, 15:51:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Objetos;

public class NaveEspacialConObjetos {

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
    public NaveEspacialConObjetos() {
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
        NaveEspacialConObjetos nave1 = new NaveEspacialConObjetos();
        System.out.println("Nave 1 : naves = " + nave1.getNaves() + " vidas " + nave1.getVidas());

        System.out.println("• Estamos reasignando un valor a los atributos de la clase ");
        System.out.println("mediante el uso de un objeto que se almacena dentro de una variable local");
        System.out.println(" int x = nave1.vidas = 10; ");
        int x = nave1.vidas = 10;
        System.out.println("• El valor de un atributo de INSTANCIA de la clase es : " + x);

        double p = Math.pow(1, 2);

    }
}
