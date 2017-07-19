/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

public class T2_4Persona_Definitiva {

    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private static int numPersonas = 0;

    public T2_4Persona_Definitiva() {
        nombre = "1º Anonymous";
        apellido = "2º Anonymous ";
        edad = get_edad_aleatorio();
        sexo = get_sexo_aleatorio();
        T2_4Persona_Definitiva.set_numero_personas();
    }

    public T2_4Persona_Definitiva(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        T2_4Persona_Definitiva.set_numero_personas();
    }

    public static void get_num_personas() {
        System.out.println("total personas : " + T2_4Persona_Definitiva.numPersonas);
    }

    public static void set_numero_personas() {
        T2_4Persona_Definitiva.numPersonas++;
    }

    public static char get_sexo_aleatorio() {
        char sexo = ' ';
        int x = (int) (Math.random() * (0 + 3) + 1);
        if (x == 1) {
            sexo = 'H';
        } else if (x == 2) {
            sexo = 'M';
        } else if (x == 3) {
            sexo = 'D';
        }
        return sexo;
    }

    public static int get_edad_aleatorio() {
        int x = (int) (Math.random() * (1 + 100) + 1);
        return x;
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

}
