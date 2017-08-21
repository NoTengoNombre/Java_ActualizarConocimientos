/**
 * @created on : 21-ago-2017, 18:04:44
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3LoteriaPrimitiva {

    /**
     * Solucion 1 : genera una combinacion apoyandose en el metodo auxiliar
     * esta() , que decide si el numero ya esta en la combinacion generada hasta
     * ahora.
     *
     * @return
     */
    public static int[] generaCombinacion() {
        int[] combinacion = new int[6];
        int i;
        int num;
//        Inicializamos el array a 0 
        for (i = 0; i < 6; i++) {
            combinacion[i] = 0;
        }
//        Generamos la combinacion
        for (i = 0; i < 6; i++) {
//Sacamos un numero al azar hasta que demos con 1
//que no este ya en la combinacion  
            do {
                num = (int) (Math.random() * 49) + 1;
            } while (esta(num, combinacion));
            combinacion[i] = num;
        }
        return combinacion;
    }

    /**
     *
     * @param num
     * @param comb
     * @return
     */
    public static boolean esta(int num, int[] comb) {
        boolean encontrado = false;

        for (int i = 0; i < 6; i++) {
            if (num == comb[i]) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        int[] x = generaCombinacion();
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
