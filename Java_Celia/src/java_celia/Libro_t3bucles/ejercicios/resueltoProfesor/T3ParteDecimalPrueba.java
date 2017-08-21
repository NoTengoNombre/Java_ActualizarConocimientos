/**
 * @created on : 20-ago-2017, 21:41:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3ParteDecimalPrueba {

    public static void main(String[] args) {

        int n; // variable local
        System.out.println("Escribe un numero : ");

        n = Integer.parseInt(System.console().readLine());

        T3ParteDecimal pd = new T3ParteDecimal();

        pd.setNumero(n);

        if (pd.tieneDecimales()) {
            System.out.println("El numero : " + pd.getNumero() + " tiene decimales ");
        } else {
            System.out.println("El numero : " + pd.getNumero() + " No tiene decimales ");
        }

    }

}
