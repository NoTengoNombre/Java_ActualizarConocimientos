/**
 * @created on : 30-ago-2017, 16:38:50
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T55Sumas {

    private static double nega;
    private static double posi;

    private static final int NUMEROS[] = new int[10];
    private static final double POSITIVOS[] = new double[NUMEROS.length];
    private static final double NEGATIVOS[] = new double[NUMEROS.length];

    public static void getNumerosRealesNegativos() {
        for (int i = 0; i < NUMEROS.length; i++) {
            double numerosReales = (Math.random() * (-1 * 9) + (-1));
            System.out.println(i + " : • Negativos : " + numerosReales);
            NEGATIVOS[i] = numerosReales;
        }
        System.out.println("--------------------------------");
    }

    public static void getNumerosRealesPositivos() {
        for (int i = 0; i < NUMEROS.length; i++) {
            double numerosReales = (Math.random() * (1 * 9) + 1);
            System.out.println(i + " : ♦ Positivos : " + numerosReales);
            POSITIVOS[i] = numerosReales;
        }
        System.out.println("--------------------------------");
    }

    public static void setNumerosPositivosNegativos() {

        for (int i = 0; i < NUMEROS.length; i++) {
            if (NEGATIVOS[i] < 0) {
                nega += NEGATIVOS[i];
            }
            if (POSITIVOS[i] >= 0) {
                posi += POSITIVOS[i];

            }
        }

        System.out.println("Negativos : " + nega);
        System.out.println("Positivos : " + posi);
        double total = (posi + nega);
        System.out.println("Resultado total : " + total);
    }

    public static void setPrograma() {
        getNumerosRealesNegativos();
        getNumerosRealesPositivos();
        setNumerosPositivosNegativos();
    }

    public static void main(String[] args) {

        setPrograma();
    }
}
