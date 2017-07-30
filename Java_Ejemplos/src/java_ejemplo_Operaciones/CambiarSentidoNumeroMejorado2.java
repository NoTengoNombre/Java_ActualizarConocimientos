/**
 * @created on : 30-jul-2017, 11:41:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class CambiarSentidoNumeroMejorado2 {

    private static int resto;
    private static int cociente;
    private static double totalTemp;

    public static int getNumeroDividido(int numero) { // 1234
        int dividendo = resto * 10; // 12340
        cociente = dividendo / 10000;
        resto = dividendo % 10000;
        return cociente;
    }

    public static double getNumeroInvertidoWhile() {
        int temp;
        while (resto > 0) {
            temp = getNumeroDividido(resto);
            totalTemp = ((totalTemp + temp) / 10);
        }
        double numero = totalTemp * 10000;
        return numero;
    }

    public static void main(String[] args) {
        resto = 1122;
        System.out.println("Numero : " + resto);
        double resto1 = getNumeroInvertidoWhile();
        System.out.println("Valor : " + Math.round(resto1));

        System.out.println("-----------------------");

        resto = 5643;
        System.out.println("Numero : " + resto);

        System.out.println("-----------------------");

        resto = 7439;
        System.out.println("Numero : " + resto);

    }
}
