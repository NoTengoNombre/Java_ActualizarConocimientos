/**
 * @created on : 21-ago-2017, 18:04:44
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3LoteriaPrimitiva2Parte {

    /**
     *
     * @return
     */
    public int[] generaCombinacion() {
//        Instancio un array con 6 elementos
        int[] v = new int[6];
        int i = 0;

        while (i < 6) {
            int n = (int) ((Math.random() * 49) + 1);
            int j = 0;
//                 0 < 0
            while (j < i) {
//                  nº   v[0]
                if (n == v[j]) {
//                  5
                    n = (int) ((Math.random() * 49) + 1);
                    j = 0;
                } else {
                    j++;
                }
            }
            v[i] = n;
            i++;
        }
        return v;
    }

    public static void main(String[] args) {

        T3LoteriaPrimitiva2Parte loteria = new T3LoteriaPrimitiva2Parte();
        int[] combinacion = new int[6];

        combinacion = loteria.generaCombinacion();

        System.out.println("Combinacion aleatoria para la loteria primitiva : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(combinacion[i]);
        }
    }

}
