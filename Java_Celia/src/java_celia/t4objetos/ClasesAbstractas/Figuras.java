/**
 * @created on : 03-sep-2017, 13:02:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ClasesAbstractas;

/**
 * Clase Abstract con 1 metodo implementado
 *
 * 2 metodos abstract para implementar en la subclases
 *
 * @author Portatil_Bot
 */
public abstract class Figuras {

    private int x, y;

    /**
     * Metodo implementado
     */
    public void mostrarOrigen() {
        System.out.println("x = " + x + " y = " + y);
    }

    public abstract double area();

    public abstract void mostrarNombre();

}

/**
 *
 * @author Portatil_Bot
 */
class Triangulo extends Figuras {

    protected int base, altura;

    public Triangulo(int ba, int al) {
        base = ba;
        altura = al;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("♦ Triangulo");
    }
}

/**
 *
 * @author Portatil_Bot
 */
class Cuadrado extends Figuras {

    protected int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("◘ Cuadrado");
    }

}

class Ejecutar {

    public static void main(String[] args) {
//        Figuras fig = new Figuras(); // No se puede instanciar una clase Abstract 
        Triangulo tri;
        Cuadrado cua;

        tri = new Triangulo(4, 3);

        tri.mostrarOrigen();
        tri.mostrarNombre();

//      Invocamos la clase Abstract y hacemos que apunte a una subclase 
//      para invocar a su metodo implementando por la SUBCLASE
        Figuras fig = null;
        fig = tri;

        fig.mostrarNombre();
        System.out.println("Area triangulo : " + fig.area());

//      Creamos un objeto de tipo Cuadrado
        cua = new Cuadrado(5);
//      hacemos que el objeto fig apunte a cua para invocar su metodo definido
//      por la clase Cuadrado
        fig = cua;
        System.out.println("Area cuadrado : " + fig.area());

    }
}
