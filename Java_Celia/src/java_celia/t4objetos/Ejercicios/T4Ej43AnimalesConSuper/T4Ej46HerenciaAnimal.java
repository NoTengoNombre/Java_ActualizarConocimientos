/**
 * @created on : 24-ago-2017, 9:26:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej43AnimalesConSuper;

public class T4Ej46HerenciaAnimal {

    public static void main(String[] args) {

        Animalillos a1 = new Animalillos("Animal 1", 5);
        a1.toString();
        Animalillos a2 = new Animalillos(a1);
        a2.toString();
        Animalillos a3 = new Animalillos("Animal 2", 14);
        a3.toString();

        Gato g = new Gato();
        g.setNombre("Nyan");
        g.setEdad(3);
        g.setVidas(7);
        g.toString();

//        
        Gato g1 = new Gato(g);
        g1.toString();

        Perro p = new Perro();
        p.setNombre("Sultan");
        p.setEdad(4);
        p.setRaza("Labrador");
        p.toString();

        Perro p1 = new Perro(p, p.getNombre(), p.getEdad());
        p1.toString();

    }
}

class Animalillos {

    protected String nombre;
    protected int edad;
    private static int contador;

    public Animalillos() {
        this.nombre = null;
        this.edad = 0;
    }

    public Animalillos(Animalillos a) {
        this.nombre = a.getNombre();
        this.edad = a.getEdad();
    }

    public Animalillos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        contador++;
        System.out.println(contador + " - ♠♠ Nombre : " + this.getNombre() + " Edad : " + this.getEdad());
        System.out.println("***************************************************");
        return "♠♠ Nombre : " + this.getNombre() + " Edad : " + this.getEdad();
    }

}

class Perro extends Animalillos {

    private String raza;

    public Perro() {
        super(); // para inicializar a 0 los atributos de la SuperClase
        this.raza = null;
    }

    /**
     * Con SUPER
     *
     * @param raza
     * @param nombre
     * @param edad
     */
    public Perro(Perro raza, String nombre, int edad) {
        super(nombre, edad); // Invoca a los atributos de la SuperClase
        System.out.println("•• Constructor Copia - Perro ••");
        this.raza = raza.getRaza();
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        System.out.println("•• Nombre : " + this.getNombre() + " - Edad : " + this.getEdad());
        System.out.println("•• Raza : " + this.getRaza());
        System.out.println("___________________________________________________");
        return "•• Nombre : " + this.getNombre() + " edad : " + this.getEdad() + " razas " + this.getRaza();
    }

}

class Gato extends Animalillos {

    private int vidas = 7;

    public Gato() {
        this.vidas = 0;
    }

    /**
     * SIN SUPER
     *
     * @param gv
     */
    public Gato(Gato gv) {
        System.out.println("♦♦ Constructor - Copia Gato ♦♦");
        this.edad = gv.getEdad(); // Llama a los metodos de la SUPERCLASE
        this.nombre = gv.getNombre(); // Llama a los metodos de la SUPERCLASE
        this.vidas = gv.getVidas();
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setRestarVida() {
        this.vidas--;
    }

    public int getVidas() {
        return vidas;
    }

    @Override
    public String toString() {
        System.out.println("♦♦ Nombre : " + this.getNombre() + " - Edad : " + this.getEdad());
        System.out.println("♦♦ Vidas : " + this.getVidas());
        System.out.println("___________________________________________________");
        return "♦♦ Nombre : " + this.getNombre() + " edad : " + this.getEdad() + " vidas " + this.getVidas();
    }

}
