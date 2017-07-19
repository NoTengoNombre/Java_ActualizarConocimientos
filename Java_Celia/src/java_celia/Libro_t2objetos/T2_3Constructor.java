/**
 * @created on : 16-jul-2017, 0:05:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2objetos;

public class T2_3Constructor {

//    Atributos una copia por cada objeto
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private static int total_personas;

    public T2_3Constructor() {
        this.nombre = "";
        this.apellido = "";
        this.edad = (int) (Math.random() * (1 + 100) + 1);
        sexo = 'X';
        nuevaPersona(); // contabilizacion automatica
    }

    public T2_3Constructor(String cnombre, String capellido, int cedad, char csexo) {
        nombre = cnombre;
        apellido = capellido;
        edad = cedad;
        sexo = csexo;
        nuevaPersona();
    }

    static void nuevaPersona() {
        T2_3Constructor.total_personas++;
    }

    static void ver_total_personas() {
        System.out.println("total de personas : " + T2_3Constructor.total_personas);
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
        if (sexo == 'H' || sexo == 'h') {
            s = "Hombre";
        }
        if (sexo == 'M' || sexo == 'm') {
            s = "Mujer";
        }
        if ((sexo == 'D') || (sexo == 'd')) {
            s = "Desconocido";
        }
        return s;
    }

    public void setSexo(char s) {
        sexo = s;
    }

    public String getSexo2() {
//        variable local
        String s = Character.toString(sexo);

        if (sexo == 'h') {
            s = "Hombre";
        }
        if (sexo == 'm') {
            s = "Mujer";
        }
        if (sexo != 'h' || sexo != 'm') {
            s = "Desconocido";
        }
        return s;
    }

    public String getSexo3() {
        int x = (int) (Math.random() * (1 + 2) + 1);
        String s = null;
        if (x == 1) {
            s = "Hombre";
        }
        if (x == 2) {
            s = "Mujer";
        }
        if (x == 3) {
            s = "Desconocido";
        }
        return s;
    }

    public void setDatos(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

}
