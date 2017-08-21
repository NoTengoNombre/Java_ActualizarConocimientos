/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3Bisiesto {

    public boolean esBisiesto(int a) {
        boolean bisiesto = false;

        if (a % 4 == 0) {
            bisiesto = true;
        }

        if (a % 100 == 0) {
            bisiesto = false;
        }

        if (a % 400 == 0) {
            bisiesto = true;
        }

        return bisiesto;
    }

    public boolean esBisiesto2(int a) {

        boolean bisiesto = false;

        if (a % 400 == 0) {
            if (a % 100 == 0) {
                bisiesto = false;
            } else {
                bisiesto = true;
            }
        } else {
            if (a % 4 == 0) {
                bisiesto = true;
            } else {
                bisiesto = false;
            }
        }
        return bisiesto;
    }

    public boolean esBisiesto3(int a) {
        boolean bisiesto = (((a % 400 == 0) || (a % 100 != 0)) && (a % 4 == 0));
        return bisiesto;
    }
}
