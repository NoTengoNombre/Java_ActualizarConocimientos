/**
 * @created on : 30-jul-2017, 11:41:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class CambiarSentidoNumero {

    private static int resto;
    private static int n1;
    private static int n11;
    private static int n2;
    private static int n22;
    private static int n3;
    private static int n33;
    private static int n4;
    private static int n44;
    private static int total;
    private static int cociente;

    public static int getNumeroDividido(int numero) { // 1234
        int dividendo = resto * 10; // 12340
        cociente = dividendo / 10000;
        CambiarSentidoNumero.resto = dividendo % 10000;
        return cociente;
    }

    public static int getNumeroInvertidoWhile() {
        int totalTemp = 0;
        int inc = 10000;
        while (resto > 0) {
            int temp = getNumeroDividido(resto);
            inc *= 0.1;
            System.out.println("Temporal : " + temp * inc);
            totalTemp = totalTemp + (temp * inc);
        }
        return totalTemp;
    }

    public static void main(String[] args) {
        CambiarSentidoNumero.resto = 4321;
        System.out.println("Numero : " + resto);
//        int numeroInvertido = getNumeroInvertido();
//        System.out.println("Numero Invertido : " + numeroInvertido);
        int numeroFinal = getNumeroInvertidoWhile();
        System.out.println("Numero Final : " + numeroFinal);
    }
}

//    public static int getNumeroInvertido() {
//        n1 = getNumeroDividido(resto);
//        n2 = getNumeroDividido(resto);
//        n3 = getNumeroDividido(resto);
//        n4 = getNumeroDividido(resto);
//        n44 = n4 * 1000;
//        n33 = n3 * 100;
//        n22 = n2 * 10;
//        n11 = n1 * 1;
//        total = n44 + n33 + n22 + n11;
//        return total;
//    }
