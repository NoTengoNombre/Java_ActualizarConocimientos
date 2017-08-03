/**
 * @created on : 02-ago-2017, 13:35:02
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__31PrediccionMeteorologica {

    private static int numPresion;
    private static int numHumedad;

    private static String probabilidadLluvia;
    private static String probabilidadSol;
    private static String probabilidadFrio;

    public static void setAleatorioPresion() {
        numPresion = (int) (Math.random() * (1 + 2) + 1);
    }

    public static void setAleatorioHumedad() {
        numHumedad = (int) (Math.random() * (1 + 2) + 1);
    }

    public static void setPresion() {
        if (numPresion == 1) {
            numPresion = (int) numPresion;
            System.out.println("Numero Presion: " + numPresion);
        }
        if (numPresion == 2) {
            numPresion = (int) numPresion;
            System.out.println("Numero Presion: " + numPresion);
        }
        if (numPresion == 3) {
            numPresion = (int) numPresion;
            System.out.println("Numero Presion: " + numPresion);
        }
//        return numPresion;
    }

    public static void setHumedad() {
        if (numHumedad == 1) {
            numHumedad = (int) numHumedad;
            System.out.println("Numero humedad " + numHumedad);
        }
        if (numHumedad == 2) {
            numHumedad = (int) numHumedad;
            System.out.println("Numero humedad " + numHumedad);
        }
        if (numHumedad == 3) {
            numHumedad = (int) numHumedad;
            System.out.println("Numero humedad " + numHumedad);
        }
//        return numHumedad;
    }

    public static void getProbabilidadLluvia() {
//        int setPresion = setPresion();
        setPresion();
//        System.out.println("La presion es : " + setPresion());

//        int setHumedad = setHumedad();
        setHumedad();
//        System.out.println("La humedad relativa es : " + setHumedad());

        if ((numPresion == 1) && (numHumedad == 3)) {
            probabilidadLluvia = "Muy Alta";
            System.out.println("Presion: Baja - Humedad: Alta : " + probabilidadLluvia);

        } else if ((numPresion == 1) && (numHumedad == 2)) {
            probabilidadLluvia = "Alta";
            System.out.println("Presion: Baja - Humedad: Media : " + probabilidadLluvia);

        } else if ((numPresion == 1) && (numHumedad == 1)) {
            probabilidadLluvia = "Media";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadLluvia);

        } else if ((numPresion == 2) && (numHumedad == 2)) {
            probabilidadLluvia = "Media";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadLluvia);
        } else {
            probabilidadLluvia = "Baja";
            System.out.println("Presion: 'Otro caso' - Humedad: 'Otro caso' : " + probabilidadLluvia);
        }
    }

    public static void getProbabilidadSol() {
//        int setPresion = setPresion();
        setPresion();
//        System.out.println("La presion es : " + setPresion);

//        int setHumedad = setHumedad();
        setHumedad();
//        System.out.println("La humedad relativa es : " + setHumedad);

        if ((numPresion == 1) && (numHumedad == 3)) {
            probabilidadSol = "Muy Alta";
            System.out.println("Presion: Baja - Humedad: Alta : " + probabilidadSol);
        } else if ((numPresion == 1) && (numHumedad == 2)) {
            probabilidadSol = "Alta";
            System.out.println("Presion: Baja - Humedad: Media : " + probabilidadSol);
        } else if ((numPresion == 1) && (numHumedad == 1)) {
            probabilidadSol = "Media";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadSol);
        } else if ((numPresion == 2) && (numHumedad == 2)) {
            probabilidadSol = "Media";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadSol);
        } else {
            probabilidadSol = "Alta";
            System.out.println("Presion: 'Otro caso' - Humedad: 'Otro caso' : " + probabilidadSol);
        }
    }

    public static void getProbabilidadFrio() {
//        int setPresion = setPresion();
        setPresion();
//        System.out.println("La presion es : " + setPresion);

//        int setHumedad = setHumedad();
        setHumedad();
//        System.out.println("La humedad relativa es : " + setHumedad);

        if ((numPresion == 1) && (numHumedad == 3)) {
            probabilidadFrio = "Alta";
            System.out.println("Presion: Baja - Humedad: Alta : " + probabilidadFrio);
        } else if ((numPresion == 1) && (numHumedad == 2)) {
            probabilidadFrio = "Alta";
            System.out.println("Presion: Baja - Humedad: Media : " + probabilidadFrio);
        } else if ((numPresion == 1) && (numHumedad == 3)) {
            probabilidadFrio = "Alta";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadFrio);
        } else if ((numPresion == 2) && (numHumedad == 2)) {
            probabilidadFrio = "Media";
            System.out.println("Presion: Media - Humedad: Media : " + probabilidadFrio);
        } else {
            probabilidadFrio = "Baja";
            System.out.println("Presion: 'Otro caso' - Humedad: 'Otro caso' : " + probabilidadFrio);
        }
    }

    public static void main(String[] args) {
        setAleatorioPresion();
        setAleatorioHumedad();
        System.out.println("Probabilidad de Lluvia : ");
        getProbabilidadLluvia();
        System.out.println("----------------------------------------------");
        System.out.println("Probabilidad de Sol : ");
        getProbabilidadSol();
        System.out.println("----------------------------------------------");
        System.out.println("Probabilidad de Frio : ");
        getProbabilidadFrio();
    }
}
