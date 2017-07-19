/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

public class T2_1Clase_Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

//   Al crear la 1º persona , esta variable se pondra a 0
    private static int numPersonas = 0;

    static void contarNuevaPersona() {
//        Incrementamos el contador de personas
        T2_1Clase_Persona.numPersonas++;
    }

    static void ver_total_personas() {
        System.out.println("total de personas : " + T2_1Clase_Persona.numPersonas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String txt) {
        nombre = txt;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String txt) {
        apellido = txt;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int n) {
        edad = n;
    }

    public String getSexo() {
        String s = null;
        if (sexo == 'H') {
            s = "Hombre";
        }
        if (sexo == 'M') {
            s = "Mujer";
        }
        if ((sexo != 'H') && (sexo != 'M')) {
            s = "Desconocido";
        }
        return s;
    }

    public void setSexo(char s) {
        sexo = s;
    }

    public void setDatos(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

}
