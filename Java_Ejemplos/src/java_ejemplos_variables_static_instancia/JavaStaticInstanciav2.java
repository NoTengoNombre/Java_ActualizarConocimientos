/**
 * @created on : 26-jul-2017, 12:55:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_variables_static_instancia;

public class JavaStaticInstanciav2 {

    private static final int[] notas = {1, 1, 1, 1, 1, 1, 1};
    private static int proCsuspensos = 0;

    public static int getNota() {
        int totalNotas = 0;
        int localNotaSuspensas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("• Notas introducidas : " + notas[i]);
            localNotaSuspensas = getSuspensos(i);
//            System.out.println("• Suspensos : " + getSuspensos(i));
            totalNotas++;
        }
//        proNotaSuspensas = localNotaSuspensas;

        System.out.println("----------------------------------------------");
        System.out.println("• Total de notas introducidas : " + totalNotas);
        System.out.println("♦ Total de notas suspensas : " + localNotaSuspensas);
        return totalNotas;
    }

    public static int getSuspensos(int i) {
        if (notas[i] < 5) {
            System.out.println("♦ Total : " + proCsuspensos++);
            System.out.println("♦ Nota en la posicion " + proCsuspensos + "º suspensa con : " + notas[i]);
        }
        return proCsuspensos;
    }

    public static void main(String[] args) {
        getNota();
    }

}
