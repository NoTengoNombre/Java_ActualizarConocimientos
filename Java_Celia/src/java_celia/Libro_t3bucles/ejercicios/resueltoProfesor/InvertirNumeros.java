/**
 * @created on : 21-ago-2017, 17:40:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class InvertirNumeros {


    /**
     *
     * @param numero
     * @return
     */
    public static int getInvertirNumero(int numero) {
        int numDigitos = getContarDigitos(numero);
        int[] digitos = new int[numDigitos];
        int inv = 0;
//                              5
        for (int i = 0; i < numDigitos; i++) {
            digitos[i] = (numero / (int) Math.pow(10, i)) % 10;
        }
//                      0 <     5
        for (int i = 0; i < numDigitos; i++) {
            inv += digitos[i] * (int) Math.pow(10, (numDigitos - i - 1));
        }
        return inv;
    }

    /**
     *
     * @param num
     * @return
     */
    public static int getContarDigitos(int num) {
        int contador = 0;
        while (num >= 1) {
            contador++;
            num /= 10;
        }
        return contador;
    }

    public static void main(String[] args) {

        int num = getInvertirNumero(12345);
        System.out.println(num);

    }
}
