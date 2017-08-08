/**
 * @created on : 07-ago-2017, 17:10:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_decremento;

public class JavaDecrementoPor10 {

    private static int par = 0;
    private static int impar = 0;

    public static int getRandom() {
        int x = (int) (Math.random() * (1 + 90000) + 10000);
        System.out.println("Valor para descomponer : " + x);
        return x;
    }

    public static void getContarCifrasWhile(int numero) {
        int decremento = 100000; // 
        double incremento = 0.00001; //
        boolean salida = true;

        while ((numero > 0 || numero != 0) && salida == true) {
            decremento /= 10;
            if (numero > decremento || numero != 0) {
                incremento *= 10;
                int num = (int) (numero * incremento);
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                if (decremento < 1 || incremento == 1) {
                    salida = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        getContarCifrasWhile(getRandom());
        System.out.println("PARES : " + par);
        System.out.println("IMPARES : " + impar);

    }
}
