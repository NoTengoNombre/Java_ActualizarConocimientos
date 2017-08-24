/**
 * @created on : 24-ago-2017, 16:18:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.HerenciaGeometrica;

public class Figura {

    private String color = "Rojo";
    private boolean relleno = true;

    /**
     * Constructor por defecto
     */
    public Figura() {
        color = "rojo";
        relleno = true;
    }

    /**
     * Constructor basico
     *
     * @param color
     * @param relleno
     */
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean estaRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        System.out.println("♦ Soy una figura de color : " + color + " ¿ Esta relleno : " + relleno + " ? ");
        System.out.println("♦ Color " + color + " ¿ Esta relleno : " + relleno + " ? ");
        return color;
    }

}

class Circulo extends Figura {

    private double radio;

    public Circulo() {
        this.radio = 1;
    }

    /**
     *
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Constructor con Super
     *
     * @param radio Atributo Clase Hija
     * @param color Atributo Super Clase
     * @param relleno Atributo Super Clase
     */
    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }

    /**
     * Constructor Copia
     *
     * @param c1
     */
    public Circulo(Circulo c1) {
        this.radio = c1.getRadio();
    }

    public void setRadio(double ra) {
        this.radio = ra;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.getRadio(), 2));
    }

    public double getPerimetro() {
        return Math.PI * (this.getRadio() + this.getRadio());
    }

    public String toStringBasico() {
        System.out.println(
                "• Radio " + this.getRadio()
                + "• Area " + this.getArea()
                + "• Perimetro " + this.getPerimetro());
        return "• Radio " + this.getRadio()
                + "• Area " + this.getArea()
                + "• Perimetro " + this.getPerimetro();
    }

    @Override
    public String toString() {
        Figura f = new Figura();
        System.out.println("• Soy un círculo con radio = " + this.getRadio() + "  esta es mi superclase: " + f.toString());
        return "• Soy un círculo con radio = " + this.getRadio() + "  esta es mi superclase: " + f.toString();
    }
}

class Rectangulo extends Figura {

    private double ancho;
    private double alto;

    public Rectangulo() {
        super();
        this.ancho = 0;
        this.alto = 0;
    }

    public Rectangulo(double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public double getArea() {
        return this.getAlto() * this.getAncho();
    }

    public double getPerimetro() {
        return (this.getAlto() * 2) * (this.getAncho() * 2);
    }

    @Override
    public String toString() {
        System.out.println("◘◘ Alto : " + this.getAlto() + " Ancho : " + this.getAncho() + " : Area " + this.getArea());
        System.out.println("◘◘ Alto : " + this.getAlto() + " Ancho : " + this.getAncho() + " : Perimetro " + this.getPerimetro());
        return "◘◘ Alto : " + this.getAlto() + " Ancho : " + this.getAncho() + " Area : " + this.getArea() + " Perimetro : " + this.getPerimetro();
    }
}

class Cuadrado extends Rectangulo {

    private double lado;

    public Cuadrado() {
        super();
        this.lado = 0;
    }

    public Cuadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void setAncho(double lado) {
        this.lado = lado;
    }

    @Override
    public double getAncho() {
        return lado;
    }

    @Override
    public double getArea() {
        return (lado * 2);
    }

    @Override
    public double getPerimetro() {
        return (lado * 4);
    }

    @Override
    public String toString() {
        System.out.println(" ◘ Lado :  " + this.getLado() + " Ancho " + this.getAncho());
        return " ◘ Lado :  " + this.getLado() + " Ancho : " + this.getAncho();
    }
}
