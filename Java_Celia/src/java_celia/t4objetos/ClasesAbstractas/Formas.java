/**
 * @created on : 03-sep-2017, 12:45:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ClasesAbstractas;

public abstract class Formas {

    private int xpos, ypos;
    private Color color;

    public abstract void dibuja();

    /**
     *
     * @param c
     */
    public void setColor(Color c) {
        this.color = c;
    }
}

class CircleBasico extends Formas {

    private int radio;

    @Override
    public void dibuja() {
        double area = (Math.PI * (radio * 2));
        System.out.println("Area total Circulo : " + area);
    }

    public void setRadio(int r) {
        this.radio = r;
    }
}

class RectangleBasico extends Formas {

    private int altura, anchura;

    @Override
    public void dibuja() {
        double area = altura * anchura;
        System.out.println("Area total del circulo : " + area);
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    public void setAnchura(int a) {
        this.anchura = a;
    }

}

class Color {

    private Color color;

}
