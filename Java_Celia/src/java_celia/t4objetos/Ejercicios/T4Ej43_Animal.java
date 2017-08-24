/**
 * @created on : 23-ago-2017, 23:24:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T4Ej43_Animal {

    private String nombre;
    private int edad;

    T4Ej43_Animal() {
        nombre = null;
        edad = 0;
    }

    T4Ej43_Animal(String nombre, int edad) {
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

    /**
     *
     * En la redefinición de clone, se llama a la versión clone de la clase base
     * desde super.
     *
     * Esta llamada se ha de hacer forzosamente dentro de un bloque try...
     * catch, para capturar la excepción CloneNotSuportedException que nunca se
     * producirá si la clase implementa el interface Cloneable.
     *
     * Como vemos la llamada a la versión clone de la clase base devuelve un
     * objeto de la clase base Object, que es a su vez devuelto por la versión
     * clone de la clase derivada.
     *
     * @return (Cloneable) obj
     * @throws CloneNotSupportedException
     */
    @Override
    public Cloneable clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException cse) {
            System.out.println("No se puede duplicar : " + cse.getLocalizedMessage() + " - " + cse.getMessage());
        }
        return (Cloneable) obj;
    }

    /**
     * Metodo sobreescrito
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof T4Ej43_Animal) {
            T4Ej43_Animal animalTemporal = (T4Ej43_Animal) obj;
            return this.nombre.equals(animalTemporal.nombre) && this.edad == animalTemporal.edad;
        }
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.edad;
        return hash;
    }

    @Override
    public String toString() {
        System.out.println("Nombre : " + this.getNombre() + " Edad : " + this.getEdad());
        return "Nombre : " + this.getNombre() + " Edad : " + this.getEdad();
    }

    public static void main(String[] args) {

        T4Ej43_Animal a1 = new T4Ej43_Animal();

        a1.setNombre("Sultan");
        a1.setEdad(4);
        a1.toString();

        T4Ej43_Animal a2 = new T4Ej43_Animal("Misifu", 5);
        a2.getNombre();
        a2.getEdad();
        a2.toString();

        System.out.println("-------------------------------");
        System.out.println("a1.equals(a2) : " + a1.equals(a2));
        System.out.println("a1 == a2 : " + (a1 == a2));
        System.out.println("-------------------------------");

        T4Ej43_Animal ab1 = new T4Ej43_Animal();

        ab1.setNombre("Sultan A");
        ab1.setEdad(4);
        ab1.toString();

        T4Ej43_Animal ab2 = new T4Ej43_Animal("Misifu B", 5);
        ab2.getNombre();
        ab2.getEdad();
        ab2.toString();

        try {
            ab1 = (T4Ej43_Animal) ab2.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Valor : " + ex.getMessage() + " - " + ex.getLocalizedMessage());
            Logger.getLogger(T4Ej43_Animal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
