/**
 * @created on : 25-ago-2017, 0:38:13
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.HerenciaGeometrica;

public class Rectangulo extends Figura {

    private double ancho;
    private double alto;

    public Rectangulo() {
        ancho = 1.0;
        alto = 1.0;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double an, double al, String color, boolean relleno) {
        super(color, relleno);
        ancho = an;
        alto = al;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getArea() {
        return ancho * alto;
    }

    public double getPerimetro() {
        return (2 * ancho) + (2 * alto);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
//                                                                                                llamada a toString SuperClase
        return "❎❎ Soy un Rectangulo de base " + ancho + " y altura " + alto + " y esta es mi SuperClase " + super.toString();
    }

}
