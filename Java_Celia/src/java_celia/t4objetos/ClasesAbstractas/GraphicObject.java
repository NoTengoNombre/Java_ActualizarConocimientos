/**
 * @created on : 23-ago-2017, 9:53:52
 * @see https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ClasesAbstractas;

public abstract class GraphicObject {

    public int x;
    public int y;

    /**
     * puede ser public
     *
     * @param newX
     * @param newY
     */
    void moveTo(int newX, int newY) {

    }

    /**
     * Metodo abstracto en toda regla
     */
    abstract void draw();

    /**
     * Metodo abstracto en toda regla
     */
    abstract void resize();

}

/**
 * Heredamos de GraphicObject e implementados sus metodos a nuestra necesidad
 *
 * @author Portatil_Bot
 */
class Circle extends GraphicObject {

    /**
     * metodo de instancia que implementa en metodo abstract de la clase
     * Abstracta
     */
    void draw() {
        System.out.println(" ○ draw Circle ");
    }

    /**
     * metodo de instancia que implementa en metodo abstract de la clase
     * Abstracta
     */
    void resize() {
        System.out.println(" ○ resize Circle ");
    }
}

/**
 * Heredamos de GraphicObject e implementados sus metodos a nuestra necesidad
 *
 * @author Portatil_Bot
 */
class Rectangle extends GraphicObject {

    /**
     * metodo de instancia que implementa en metodo abstract de la clase
     * Abstracta
     */
    void draw() {
        System.out.println(" ◘ draw Rectangle ");
    }

    /**
     * metodo de instancia que implementa en metodo abstract de la clase
     * Abstracta
     */
    void resize() {
        System.out.println(" ◘ resize Rectangle ");
    }

}
