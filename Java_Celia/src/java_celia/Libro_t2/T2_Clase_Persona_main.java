/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2;

public class T2_Clase_Persona_main {

    /**
     * El objeto tiene una copia de todos los atributos de la clase que sera la
     * encargada de guardar/almacenar los datos que le pasemos por medio de los
     * metodos SET y que luego recuperaremos mediante los metodos GET
     *
     * @param args
     */
    public static void main(String[] args) {
        T2_Clase_Persona persona = new T2_Clase_Persona();
        persona.setNombre("Miguel");
        persona.setApellido("Perez");
        persona.setEdad(23);
        persona.setSexo('H');

// Ahora vamos a mostrar por pantalla la informacion
// para asegurarnos que todo se ha almacenado 
        System.out.println(
                "Nombre : "
                + persona.getNombre()
                + " - Apellido "
                + persona.getApellido());
        System.out.println("Edad : " + persona.getEdad());
        System.out.println("Sexo : " + persona.getSexo());

    }
}
