/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2;

public class T2_4Persona_Definitiva_main {

    /**
     * El objeto tiene una copia de todos los atributos de la clase que sera la
     * encargada de guardar/almacenar los datos que le pasemos por medio de los
     * metodos SET y que luego recuperaremos mediante los metodos GET
     *
     * @param args
     */
    public static void main(String[] args) {
        T2_4Persona_Definitiva.get_num_personas();
        System.out.println("----------------------------------");
        T2_4Persona_Definitiva t2 = new T2_4Persona_Definitiva();
        System.out.println("- Nombre  : " + t2.getNombre());
        System.out.println("- Apellido : " + t2.getApellido());
        System.out.println("- Sexo : " + t2.getSexo());
        System.out.println("- Edad : " + t2.getEdad());
        System.out.println("----------------------------------");
        T2_4Persona_Definitiva t22 = new T2_4Persona_Definitiva();
        System.out.println("- Nombre  : " + t22.getNombre());
        System.out.println("- Apellido : " + t22.getApellido());
        System.out.println("- Sexo : " + t22.getSexo());
        System.out.println("- Edad : " + t22.getEdad());
        System.out.println("----------------------------------");
        T2_4Persona_Definitiva t222 = new T2_4Persona_Definitiva();
        System.out.println("- Nombre  : " + t222.getNombre());
        System.out.println("- Apellido : " + t222.getApellido());
        System.out.println("- Sexo : " + t222.getSexo());
        System.out.println("- Edad : " + t222.getEdad());
        System.out.println("----------------------------------");

        System.out.println("- Total Numero de personas : ");
        T2_4Persona_Definitiva.get_num_personas();
    }
}
