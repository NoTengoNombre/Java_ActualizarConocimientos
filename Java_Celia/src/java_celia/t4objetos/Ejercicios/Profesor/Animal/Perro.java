/**
 * @created on : 24-ago-2017, 23:49:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.Animal;

public class Perro extends Animal {

    private String raza;

    /**
     *
     * @param nombre
     * @param edad
     * @param raza
     */
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro(Perro p) {
        super(p.getNombre(), p.getEdad());
        this.raza = p.getRaza();
    }

    public void setRaza(String r) {
        this.raza = r;
    }

    public String getRaza() {
        return this.raza;
    }

    @Override
    public String toString() {
        return "Hola , soy un • perro  , me llamo " + nombre + " tengo " + edad + " anios y soy un " + raza;
    }

}
