/**
 * @created on : 24-ago-2017, 23:31:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.Animal;

public class Animal {

    protected String nombre;
    protected int edad;
    protected static int numAnimales = 0;

    /**
     * Constructor sin parametros
     */
    public Animal() {
        nombre = "Desconocido";
        edad = 0;
        numAnimales++;
    }

    /**
     * Constructor con parametros
     *
     * @param n
     * @param e
     */
    public Animal(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    /**
     * Constructor copia
     *
     * @param a
     */
    public Animal(Animal a) {
        this.edad = a.getEdad();
        this.nombre = a.getNombre();
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String str;
//        str = "Hay " + this.numAnimales + " animales creados "; //INCORRECTA
        str = "Hay " + Animal.numAnimales + " animales creados "; // 
        str = str.concat("Yo me llamo " + this.nombre + " y tengo " + this.edad + " anios ");
        return str;
    }

    /**
     * Superclase
     *
     * @return @throws java.lang.CloneNotSupportedException
     */
    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal a = new Animal(this.nombre, this.edad);
        return a;
    }

    public boolean equals(Animal a) {
        boolean result;
//        if (a.getEdad() == this.edad && this.nombre.equals(a.getNombre())) {
//            result = true;
//        } else {
//            result = false;
//        }
        result = (a.getEdad() == this.edad) && (this.nombre.equals(a.getNombre()));
        return result;
    }

}
