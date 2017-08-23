/**
 * @created on : 23-ago-2017, 19:40:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Super;

public class TestSuperVehiculos {

    public static void main(String[] args) {
        Bicicleta b = new Bicicleta();
//        Esta invocando metodo de la SUPERCLASE
        b.setMarca("BH", "EasyMotion");
//        Esta invocando metodo de la SUPERCLASE
        b.setTamRueda(28);
//        Esta invocando metodo de la SUPERCLASE
        b.info();
    }
}
