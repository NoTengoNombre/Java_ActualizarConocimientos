/**
 * @created on : 04-sep-2017, 14:54:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T5x13ParejasDeBaileBasico {

    private static String[] chicos = {"Mateo", "Santiago", "Matías", "Sebastián", "Benjamín", "Martín", "Nicolás", "Alejandro", "Lucas", "Diego"};
    private static String[] chicas = {"Ana", "Lucia", "Maria", "Rebeca", "Isabel", "Emilia", "Tania", "Luisa", "Vanesa", "Marina"};
    private static String[] contenedor = new String[chicos.length];
    private static String aux;

    public static int getX() {
        int x = (int) (Math.random() * (1 + chicos.length - 1));
        return x;
    }

    public static int getY() {
        int y = (int) (Math.random() * (1 + chicas.length - 1));
        return y;
    }

    public static void setIntercambiarPosicionArray(String[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = i; j < arrayParam.length; j++) {

                int x = getX();
                int y = getY();

                aux = arrayParam[x];

                if (x == y) {
                    y = getY();
                }

                arrayParam[x] = arrayParam[y];
                arrayParam[y] = aux;

            }
        }
    }

    public static String[] getConcatenarParejas(String[] arrayParam, String[] arrayParam2) {

        for (int i = 0; i < chicos.length; i++) {
            contenedor[i] = chicos[i].concat(" y " + chicas[i]);
        }
        return contenedor;
    }

    public static void lanzarPrograma() {
        setIntercambiarPosicionArray(chicas);
        setIntercambiarPosicionArray(chicos);
        String[] parejas = getConcatenarParejas(chicos, chicas);
        int n = 1;
        for (String pareja : parejas) {
            System.out.println("Pareja " + n++ + " : ".concat(pareja)
            );
        }
    }

    public static void main(String[] args) {

        lanzarPrograma();
    }
}
