/**
 * @created on : 20-ago-2017, 23:52:57
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3MayorMenorMediano {

    private int x, y, z = 0;

    public T3MayorMenorMediano() {
        x = 0;
        y = 0;
        z = 0;
    }

    public T3MayorMenorMediano(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    public int getMenor() {
        int menor = 0;
        if ((x <= y) && (x <= z)) {
            menor = x;
        }
        if ((x <= y) && (x <= z)) {
            menor = y;
        }
        if ((x <= x) && (z <= y)) {
            menor = z;
        }
        return menor;
    }

    public int getMediano() {
        int mediano = 0;

//            1    2      1    3        1    3       1    2
        if (((x >= y) && (x <= z)) || ((x >= z)) && (x <= y)) {
            mediano = x;
//                   2    1      2    3        2    3      2    1
        } else if (((y >= x) && (y <= z)) || ((y >= z) && (y <= x))) {
            mediano = y;
//                   3    1      3    2        3    1      3    1
        } else if (((z >= x) && (z <= y)) || ((z >= y) && (z <= x))) {
            mediano = z;
        }
        return mediano;
    }

//    Devuelve el mayor de los tres numeros
    public int getMayor() {
        int mayor = 0;
        if ((x >= y) && (x >= z)) {
            mayor = x;
        }
        if ((y >= x) && (y >= z)) {
            mayor = y;
        }
        if ((z >= x) && (z >= y)) {
            mayor = z;
        }
        return mayor;
    }
 
}
