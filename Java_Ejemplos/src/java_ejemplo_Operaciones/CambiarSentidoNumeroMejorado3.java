/**
 * @created on : 30-jul-2017, 11:41:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class CambiarSentidoNumeroMejorado3 {

    private static int resto;

    public static int getNumeroDividido(int numero) { // 1234
        int dividendo = resto * 10; // 12340
        int cociente = dividendo / 10000;
        resto = dividendo % 10000;
        return cociente;
    }

    public static int getNumeroInvertido() {
        int temp;
        double totalTemp = 0;
        int restoComp = resto;
        while (resto > 0) {
            temp = getNumeroDividido(resto);
            totalTemp = ((totalTemp + temp) / 10);
        }
        double numero = totalTemp * 10000;

        if (restoComp >= 1 && restoComp <= 99) {
            numero = Math.round(numero);
            numero /= 100;
        }

        if (restoComp >= 100 && restoComp <= 999) {
            numero = Math.round(numero);
            numero /= 10;
        }

        if (restoComp >= 999 && restoComp <= Integer.MAX_VALUE) {
            numero = Math.round(numero);
        }
        return (int) numero;
    }

    public static void main(String[] args) {
        resto = 25;
        System.out.println("Numero : " + resto);
        double resto1 = getNumeroInvertido();
        System.out.println("Valor : " + resto1);
        System.out.println("-----------------------");
        resto = 634;
        System.out.println("Numero : " + resto);
        double resto2 = getNumeroInvertido();
        System.out.println("Valor : " + resto2);
        System.out.println("-----------------------");
        resto = 5766;
        System.out.println("Numero : " + resto);
        double resto3 = getNumeroInvertido();
        System.out.println("Valor : " + resto3);
        System.out.println("-----------------------");

    }
}
