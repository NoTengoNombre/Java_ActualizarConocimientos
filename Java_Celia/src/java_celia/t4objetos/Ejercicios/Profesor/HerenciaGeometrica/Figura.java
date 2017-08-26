/**
 * @created on : 25-ago-2017, 0:25:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.HerenciaGeometrica;

public class Figura {

    private String color;
    private boolean relleno;

    /**
     *
     */
    public Figura() {
        color = "rojo";
        relleno = true;
    }

    /**
     * Constructor basico
     *
     * @param c
     * @param r
     */
    public Figura(String c, boolean r) {
        color = c;
        relleno = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     *
     * @return
     */
    public boolean estaRelleno() {
        return relleno;
    }

    /**
     *
     * @param r
     */
    public void setRelleno(boolean r) {
        relleno = r;
    }

    /**
     * Devuelve si tiene relleno o no
     *
     * @return
     */
    public String toString() {
        String s = " ☁ Soy una figura de color " + color + " y ";
        if (relleno) {
            s += " ☁ estoy relleno";
        } else {
            s += " ☁ no estoy relleno ";
        }
        return s;
    }

}
