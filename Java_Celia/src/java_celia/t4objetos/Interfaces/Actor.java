/**
 * @created on : 03-sep-2017, 16:27:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Interfaces;

/**
 * Interface que declara el metodo actua
 *
 * @author Portatil_Bot
 */
public interface Actor {

    public static final boolean VIVO = true;

    /**
     * Metodo sin implementar de la Interfaces Actor
     */
    public void actua();

}

/**
 *
 * @author Portatil_Bot
 */
class Persona extends Humano implements Actor {

    /**
     *
     */
    @Override
    public void actua() {
        System.out.println("Clase Persona");
        System.out.println("Metodo de la Interfaces implementado en la Subclase Persona");
    }

}

/**
 *
 * @author Portatil_Bot
 */
class Perro extends Canino implements Actor {

    /**
     *
     */
    @Override
    public void actua() {
        System.out.println("Clase PERRO");
        System.out.println("Metodo de la Interfaces implementado en la Subclase Persona");
    }

}

/**
 *
 * @author Portatil_Bot
 */
class Humano {

    private String nombre;
    private String nacionalidad;

    public Humano() {
        this.nombre = "ninguno";
        this.nacionalidad = "sin pais";
    }

    public Humano(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}

/**
 *
 * @author Portatil_Bot
 */
class Canino {

    private String nombre;
    private String raza;

    public Canino() {
        this.nombre = "ninguno";
        this.raza = "sin raza";
    }

    public Canino(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
