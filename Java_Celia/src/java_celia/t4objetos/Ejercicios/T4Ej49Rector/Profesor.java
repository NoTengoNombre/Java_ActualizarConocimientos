/**
 * @created on : 24-ago-2017, 19:32:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej49Rector;

public class Profesor {

    private String nombre;
    private double sueldo;

    public Profesor() {
        nombre = null;
        sueldo = 0;
    }

    public Profesor(Profesor p) {
        nombre = p.getNombre();
        sueldo = p.getSueldo();
    }

    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Para usar este metodo usamos la palabra super SuperClase
     *
     * @return
     */
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        System.out.println("♦ Profesor : Sueldo : " + sueldo + " Nombre : " + nombre);
        return "Sueldo : " + sueldo + " Nombre : " + nombre;
    }

}

class Rector extends Profesor {

    public Rector() {
        super();
    }

    /**
     * Invoco los metodos del objeto 'p' para hacer una copia
     *
     * @param p
     */
    public Rector(Profesor p) {
        super(p.getNombre(), (int) p.getSueldo());
    }

    /**
     * SubClase
     *
     * @return (super.getSueldo() * 25 / 100)
     */
    @Override
    public double getSueldo() {
        return (super.getSueldo() * 25 / 100) + super.getSueldo();
    }

    @Override
    public String toString() {
        System.out.println("• Rector : Sueldo : " + this.getSueldo() + " Nombre : " + this.getNombre());
        return "Sueldo : " + this.getSueldo() + " Nombre : " + this.getNombre();
    }

}
