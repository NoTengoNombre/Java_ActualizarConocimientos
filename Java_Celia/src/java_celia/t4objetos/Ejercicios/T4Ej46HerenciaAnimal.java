/**
 * @created on : 24-ago-2017, 9:26:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios;

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

        Perro p1 = new Perro(p);
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
        this.raza = null;
    }

    public Perro(Perro raza) {
        System.out.println("•• Constructor Copia - Perro ••");
        this.raza = raza.getRaza();
        this.edad = raza.getEdad();
        this.nombre = raza.getNombre();
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

    public Gato(Gato gv) {
        System.out.println("♦♦ Constructor - Copia Gato ♦♦");
        this.vidas = gv.getVidas();
        this.edad = gv.getEdad();
        this.nombre = gv.getNombre();
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
