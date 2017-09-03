/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t4objetos.Interfaces;

/**
 * Interfaces
 *
 * @author Portatil_Bot
 */
public interface NombreAble {

    /**
     * CONSTANTE : De la Interfaz
     *
     * public static final boolean
     *
     */
    public static final boolean CIERTO = true;

    /**
     * Metodo Interfaz : public void
     */
    public void mostrarNombre();

}

/**
 * Clase que es implementada por la interface NombreAble
 *
 * @author Portatil_Bot
 */
class Elemento implements NombreAble {

    String nombre;

    Elemento(String nom) {
        nombre = nom;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Nombre : " + nombre);
        if (CIERTO) {
            System.out.println("Constante : " + CIERTO);
        }
    }

    public static void main(String[] args) {

        Elemento elemento = new Elemento("Rad");
        elemento.mostrarNombre();

//        Uso del interfaz con enlace dinamico
        Elemento elem;
        NombreAble inter;

        System.out.println("--------------------------");
        elem = new Elemento("Wulf");
        elem.mostrarNombre();

//        Una referencia a interfaz puede
//        utilizar con una instancia de una
//        clase que lo implemente
        System.out.println("--------------------------");
        inter = elem;
        inter.mostrarNombre();

    }
}
