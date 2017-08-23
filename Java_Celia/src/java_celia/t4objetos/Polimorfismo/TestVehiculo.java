/**
 * @created on : 23-ago-2017, 13:17:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Polimorfismo;

public class TestVehiculo {

    public static void main(String[] args) {
//      Clase Padre       Clase hija - Automovil deriva de Vehiculo
        Vehiculo v1 = new Automovil();
//v1 -> solo invoca metodo/atributos de la clase PADRE 'Vehiculo'
        v1.setMarca("Seat");
//        v1.setConsumo(4.8); // Dara error porque ese metodo no pertenece a Vehiculo
        // para Evitarlo hacer casting explicito
//Esto provoca que momentaneamente Automovil se comporte como Vehiculo
//Clase Hija 'Automovil' sea Clase Padre 'Vehiculo'
        ((Automovil) v1).setConsumo(4.8);

//Las siguientes líneas repetimos la idea, asignando un Todoterreno a una variable Automovil (v2). 
//v2 es una variable de tipo Automovil, está referenciando a un objeto de tipo Todoterreno, 
//y el método getConsumo() está sobreescrito en esta clase. 
//Por ello, el intérprete de Java preferirá ejecutar el getConsumo() de Todoterreno.
        Automovil v2 = new TodoTerreno();
        v2.setMarca("Toyota");
        v2.setConsumo(7.0);
        System.out.println(v2.getConsumo());

    }
}
