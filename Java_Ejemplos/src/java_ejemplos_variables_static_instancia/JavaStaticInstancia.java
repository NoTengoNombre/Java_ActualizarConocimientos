/**
 * @created on : 26-jul-2017, 12:55:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_variables_static_instancia;

public class JavaStaticInstancia {

    private static int[] notas = {1, 1, 1, 1, 1, 1};
    private static int c_suspensos = 0;

    public static int getNota() {
        int totalNotas = 0;
        int notaSuspensas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("• Notas introducidas : " + notas[i]);
            notaSuspensas = getSuspensos(i);
            totalNotas++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("♠ Total de notas introducidas : " + totalNotas);
        System.out.println("♠ Total de notas suspensas : " + notaSuspensas);
        return totalNotas;
    }

    public static int getSuspensos(int i) {
// El problema esta aquí 
//- La ejecución siempre va hacía abajo 
//  Resigna el valor a la variable STATIC y la incrementa
//  Pero guarda el valor dentro de la varaible local
//        c_suspensos = 0; // variable local NO "static"
        if (notas[i] < 5) {
// Este valor si se guarda en la propiedad STATIC cuando
// se ejecute dentro del otro metodo
            c_suspensos++;
            System.out.println("♦ Nota en la posicion " + c_suspensos + "º suspensa con : " + notas[i]);
        }
        System.out.println("♦ Total suspensos : " + c_suspensos);
        return c_suspensos;
    }

    public static void main(String[] args) {
        getNota();
    }

}
