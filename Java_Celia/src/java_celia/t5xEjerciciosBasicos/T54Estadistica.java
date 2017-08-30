/**
 * @created on : 30-ago-2017, 12:15:49
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T54Estadistica {

    private static int total;
    private static int media;

    private static final int[] NUMERO = new int[10];
    private static final int[] MEDIASUPERIOR = new int[NUMERO.length];
    private static final int[] MEDIAINFERIOR = new int[NUMERO.length];

    public static int getNumero() {
        double x = Math.random() * (1 + 10) + 1;
        return (int) x;
    }

    public static void setNumeroDentroArray() {
        for (int i = 0; i < NUMERO.length; i++) {
            NUMERO[i] = getNumero();
            System.out.println(i + " : Numero : " + NUMERO[i]);
        }
        System.out.println("----------------------------");
    }

    public static double getTotal() {
        for (int i = 0; i < NUMERO.length; i++) {
            total += NUMERO[i];
        }
        System.out.println("◘ Total : " + total + " ◘ ");
        System.out.println("----------------------------");
        return total;
    }

    public static void setMedia() {
        media = total / NUMERO.length;
        System.out.println("♦♦ La media es : " + media + " ♦♦");
        System.out.println("----------------------------");
    }

    public static void setTotalMedia() {

        for (int i = 0; i < NUMERO.length; i++) {
            System.out.println(i + " - ♣ Numero Obtenido : " + NUMERO[i]);
            if (NUMERO[i] >= media) {
                System.out.println("♣ Media superior : " + NUMERO[i]);
                MEDIASUPERIOR[i] = NUMERO[i];
            }
            if (NUMERO[i] < media) {
                System.out.println("♣ Media inferior : " + NUMERO[i]);
                MEDIAINFERIOR[i] = NUMERO[i];
            }
        }
    }

    public static void getTotalMediaSuperior() {
        System.out.println("------------ Media Superior --------------");
        for (int i = 0; i < MEDIASUPERIOR.length; i++) {
            if (MEDIASUPERIOR[i] != 0) {
                System.out.println("Posicion : " + i + " - " + MEDIASUPERIOR[i]);
            }
        }
    }

    public static void getTotalMediaInferior() {
        System.out.println("------------ Media Inferior --------------");
        for (int i = 0; i < MEDIAINFERIOR.length; i++) {
            if (MEDIAINFERIOR[i] != 0) {
                System.out.println("Posicion : " + i + " - " + MEDIAINFERIOR[i]);
            }
        }
    }

    public static void setEjecutarPrograma() {
        setNumeroDentroArray();
        getTotal();
        setMedia();
        setTotalMedia();
        getTotalMediaInferior();
        getTotalMediaSuperior();
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {

        setEjecutarPrograma();
    }
}
