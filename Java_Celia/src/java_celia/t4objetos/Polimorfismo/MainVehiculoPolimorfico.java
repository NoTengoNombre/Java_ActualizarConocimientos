/**
 * @created on : 23-ago-2017, 12:38:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Polimorfismo;

public class MainVehiculoPolimorfico {

    public static void main(String[] args) {

//        clase padre                clase hija
        VehiculoPolimorfico v1 = new Automovil1();
        v1.setMarca("Seat");
        //v1.setConsumo(4.8); // ERROR : no esta implementado dentro de VehiculoPolimorfico

//        clase intermedia     clase intermedia
        Automovil1 v2 = new Todoterreno1();
        v2.setMarca("Toyota"); // metodo de la SuperClase 1º VehiculoPolimorfico
        v2.setConsumo(7.0); // metodo de la SuperClase 2º Automovil1
        System.out.println(v2.getConsumo());

    }
}
