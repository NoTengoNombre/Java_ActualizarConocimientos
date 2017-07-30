/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_8MayorMenorMedianoProfesor {

    public int x, y, z;

    public T3_8MayorMenorMedianoProfesor() {
        x = 0;
        y = 0;
        z = 0;
    }

    public T3_8MayorMenorMedianoProfesor(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public void setNumeros(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public int getMenor() {
        int menor = 0;
        if ((x <= y) && (x <= z)) {
            menor = x;
        }
        if ((y <= x) && (y <= z)) {
            menor = y;
        }
        if ((z <= x) && (z <= y)) {
            menor = z;
        }
        return menor;
    }

    public int getMediano() {
        int mediano = 0;
        if (((x >= y) && (x <= z)) || ((x >= z) && (x <= y))) {
            mediano = x;
        } else if (((y >= x) && (y <= z)) || ((y >= z) && (y <= x))) {
            mediano = y;
        } else if (((z >= x) && (z <= y)) || ((z >= y) && (z <= x))) {
            mediano = z;
        }
        return mediano;
    }

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

    public static void main(String[] args) {
        T3_8MayorMenorMedianoProfesor t
                = new T3_8MayorMenorMedianoProfesor(10, 15, 1);

        int menor = t.getMenor();
        System.out.println("menor " + menor);
        int mediano = t.getMediano();
        System.out.println("mediano " + mediano);
        int mayor = t.getMayor();
        System.out.println("mayor " + mayor);

        System.out.println(menor + " - " + mediano + " - " + mayor);

    }

}
