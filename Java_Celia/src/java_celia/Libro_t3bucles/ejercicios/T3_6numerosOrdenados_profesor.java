
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_6numerosOrdenados_profesor {

    /**
     * Cada vez que se instancia/ejemplariza un objeto
     *
     * El constructor asigna valores a las variables que queda almacenadas en el
     * objeto , cuando ese objeto llame a los metodos , usara las propiedades de
     * la clase para obtener los datos para las variables locales
     */
    private int x, y, z;

    /**
     * Constructor sin parámetros. Asigna valor 0 a x, y, z
     */
    public T3_6numerosOrdenados_profesor() {
        x = 0;
        y = 0;
        z = 0;
    }

    /**
     * Constructor parametrizado para establecer valor de x, y, z
     *
     * @param a
     * @param b
     * @param c
     */
    public T3_6numerosOrdenados_profesor(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    /**
     * Asigna valores a los tres números
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

    /**
     * Devuelve true si los números están ordenados de menor a mayor, false en
     * otro caso
     *
     * @return
     */
    public boolean estanOrdenados() {
        boolean result;
//           a   b      b   c
        if ((x < y) && (y < z)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Devuelve true si los números son consecutivos, false en otro caso
     *
     * @return
     */
    public boolean sonConsecutivos() {
        boolean result;
        if ((x == (y - 1)) && (y == (z - 1))) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Por favor, introduzca tres números:");

        System.out.print("  Primer número: ");
        a = (int) (Math.random() * (1 + 10));

        System.out.print("  Segundo número: ");
        b = (int) (Math.random() * (1 + 10));

        System.out.print("  Tercer número: ");
        c = (int) (Math.random() * (1 + 10));

        T3_6numerosOrdenados_profesor num = new T3_6numerosOrdenados_profesor(a, b, c);

        if (num.estanOrdenados()) {
            System.out.println("\nLos números están ordenados");
        } else {
            System.out.println("\nLos números NO están ordenados");
        }

        if (num.sonConsecutivos()) {
            System.out.println("\nLos números son consecutivos");
        } else {
            System.out.println("\nLos números NO son consecutivos");
        }

    }
}
