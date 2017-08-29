/**
 * @created on : 29-ago-2017, 16:23:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Maps;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Elementos ordenados por clave
 *
 * Definen 2 referencias de la interfaz SortedMap
 *
 * 1º se colocan las claves que se encuentran entre A y O - Metodo
 * submap("A","O");
 *
 * 2º Almacena las claves desde la P hacia el final
 *
 * Si se usa Clase String - comparteTo no se redifine
 *
 * Si se usa otras clases se tiene que redifinir , comparteTo , equals ,
 * hashCode
 *
 * @author Portatil_Bot
 */
public final class Person2 {

    private final String name;
    private final Gender gender;
    private final Date dateOfBirth;
    private final String address;
    private final String telephone;

    /**
     * Constructor Basico
     *
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param address
     * @param telephone
     */
    public Person2(String name, Gender gender, Date dateOfBirth, String address, String telephone) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephone = telephone;
    }

    public static void main(String[] args) {

        /**
         * ------ Clave , Valor ------ Mapa < String , Persona2 > que apunta a
         * HashMap
         */
        Map<String, Person2> mapa = new HashMap<>();
//      Instanciamos 3 constructores y le pasamos los valores
        Person2 jon0 = new Person2("Jon", Gender.MALE, new Date(), "Papel Street", "555-0829");
        Person2 jon1 = new Person2("Dante", Gender.MALE, new Date(), "Hell´s Street", "666-0829");
        Person2 jon2 = new Person2("Maria", Gender.FEMALE, new Date(), "Lipstick Street", "666-0829");

//      Agregamos al Mapa  
        mapa.put("Jon N", jon0);
        mapa.put("Dante", jon1);
        mapa.put("Maria", jon2);

//        Recorro el interface Map mediante una funcion lambda
        mapa.forEach((String k, Person2 v)
                -> System.out.println("Datos : " + k
                        + "\n • Nombre : " + v.name
                        + "\n • Direccion : " + v.address
                        + "\n • Genero : " + v.gender
                        + "\n • Fecha " + v.dateOfBirth
                        + "\n • Telefono " + v.telephone));
        System.out.println("------------------------------");

//        Recorro el mapa de objetos mediante un Iterador
        Iterator<Map.Entry<String, Person2>> entries = mapa.entrySet().iterator();
//        Mientras tiene objetos .hasNext
        while (entries.hasNext()) {
            Map.Entry<String, Person2> entry = entries.next();
            System.out.println("Key = " + entry.getKey()
                    + "\nValues - Direccion : " + entry.getValue().address
                    + " - Nombre -  " + entry.getValue().name
                    + " - Telefono - " + entry.getValue().telephone
                    + " - Fecha - " + entry.getValue().dateOfBirth
                    + " - Genero - " + entry.getValue().gender);
            System.out.println("----------------------------------------------");
        }

    }

}

enum Gender {
    FEMALE, MALE;
}
