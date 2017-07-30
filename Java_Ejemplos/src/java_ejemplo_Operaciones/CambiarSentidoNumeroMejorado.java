/**
 * @created on : 30-jul-2017, 11:41:59
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class CambiarSentidoNumeroMejorado {

    private static int resto;
    private static int cociente;
    private static double numeroInvertido;
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
        return totalTemp;
    }

    public static double getNumeroInvertido() {
        double numero = getNumeroInvertidoWhile();
//        System.out.println("valor : " + numero);
        numeroInvertido = numero * 10000;
        return numeroInvertido;
    }

    public static void main(String[] args) {
        resto = 1122;
        System.out.println("Numero : " + resto);
//        double numeroFinal = getNumeroInvertidoWhile();
//        System.out.println("Numero Final : " + numeroFinal);
        long redondeo = Math.round(getNumeroInvertido());
        System.out.println("Numero : " + redondeo);

        System.out.println("-----------------------");

        resto = 5643;
        System.out.println("Numero : " + resto);
//        double numeroFinal2 = getNumeroInvertidoWhile();
//        System.out.println("Numero Final : " + numeroFinal2);
        long redondeo2 = Math.round(getNumeroInvertido());
        System.out.println("Numero : " + redondeo2);

        System.out.println("-----------------------");

        resto = 7439;
        System.out.println("Numero : " + resto);
//        double numeroFinal2 = getNumeroInvertidoWhile();
//        System.out.println("Numero Final : " + numeroFinal2);
        long redondeo3 = Math.round(getNumeroInvertido());
        System.out.println("Numero : " + redondeo3);

    }
}
