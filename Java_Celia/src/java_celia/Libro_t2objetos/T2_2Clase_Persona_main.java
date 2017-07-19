/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

public class T2_2Clase_Persona_main {

    /**
     * El objeto tiene una copia de todos los atributos de la clase que sera la
     * encargada de guardar/almacenar los datos que le pasemos por medio de los
     * metodos SET y que luego recuperaremos mediante los metodos GET
     *
     * @param args
     */
    public static void main(String[] args) {
        // Invocar contabilizador de objetos
        T2_1Clase_Persona.contarNuevaPersona();
        // Ver cantidad de objetos

        T2_1Clase_Persona persona = new T2_1Clase_Persona();

        persona.setNombre("Miguel");
        persona.setApellido("Perez");
        persona.setEdad(23);
        persona.setSexo('H');

// Ahora vamos a mostrar por pantalla la informacion
// para asegurarnos que todo se ha almacenado 
        System.out.println("Nombre : " + persona.getNombre() + " - Apellido " + persona.getApellido());
        System.out.println("Edad : " + persona.getEdad());
        System.out.println("Sexo : " + persona.getSexo());

        T2_3Constructor c_persona = new T2_3Constructor("Pepe C", "Perez C", (int) (Math.random() * (1 + 100) + 1), (char) (Math.random() * (26) + ('a')));

        System.out.println("........ Constructor ........");
        System.out.println("Nombre : " + c_persona.getNombre());
        System.out.println("Apellido : " + c_persona.getApellido());
        System.out.println("Edad : " + c_persona.getEdad());
        System.out.println("Sexo : " + c_persona.getSexo3());
        System.out.println("..............................");

        T2_1Clase_Persona.ver_total_personas();
    }
}
