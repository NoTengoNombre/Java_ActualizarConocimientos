/**
 * @created on : 20-ago-2017, 21:53:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3NumerosOrdenados {

//  atributos de clase 
    private int x, y, z;

    /**
     * Constructor inicializador por defecto
     */
    public T3NumerosOrdenados() {
        this.x = 0;
        this.y = 0;
        this.z = 0;

    }

    /**
     * Constructor para asignar valores
     *
     * @param xx
     * @param yy
     * @param zz
     */
    public T3NumerosOrdenados(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    /**
     * Asignar valores a los 3 numeros
     *
     * @param a
     * @param b
     * @param c
     */
    public void setNumeros(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public boolean estanOrdenados() {
//        boolean result;
//        result = (x < y) && (y < z);
//        return result;

        boolean result;
//           1   2      2   3
        if ((x < y) && (y < z)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean sonConsecutivos() {
        boolean result;
//           1   2      2   3
        if ((x < y) && (y < z)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    boolean sonConsecutivos2() {
        boolean result;
//           1     2           2     3
//        if ((x == (y - 1)) && (y == (z - 1))) {
//            result = true;
//        } else {
//            result = false;
//        }
//                1     2           2     3
        result = (x == (y - 1)) && (y == (z - 1));
        return result;
    }

}
