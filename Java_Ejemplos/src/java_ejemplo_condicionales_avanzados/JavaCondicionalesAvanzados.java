/**
 * @created on : 02-ago-2017, 14:22:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_condicionales_avanzados;

public class JavaCondicionalesAvanzados {

    private static String presion;
    private static String humedad;

    public static void main(String[] args) {

        System.out.println("Presion : " + presion);
        System.out.println("Humedad :" + humedad);

        if (presion == null ? humedad == null : presion.equals(humedad)) {
            System.out.println("P1: baja - H: baja : " + presion);
        }

        System.out.println("Presion : " + presion);
        presion = "baja";
        System.out.println("Humedad :" + humedad);
        humedad = "baja";

        if (presion == null ? humedad == null : presion.equals(humedad)) {
            System.out.println("P2: baja - H: baja : " + presion);
        }
        
        System.out.println("Presion : " + presion);
        presion = "alta";
        System.out.println("Humedad :" + humedad);
        humedad = "baja";

        if (presion == null ? humedad == null : presion.equals(humedad)) {
            System.out.println("P3: baja - H: baja : " + presion);
        }

    }
}
