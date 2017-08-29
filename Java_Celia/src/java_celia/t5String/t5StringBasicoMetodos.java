/**
 * @created on : 29-ago-2017, 17:59:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

public class t5StringBasicoMetodos {

    public static void main(String[] args) {

        System.out.println("-----------------------");
        String metodos = "metodo replace";
        System.out.println("Original : " + metodos);
        String metodos1 = "metodo replace";
        String v = metodos1.replace("e", "o");
        System.out.println(v);
        System.out.println("-----------------------");

        System.out.println("metodo substring - recorta la cadena por el numero indicado");
        System.out.println("metodo substring - 0 a 5 ");
        String mSub = "metodo substring";
        String valor1 = mSub.substring(0, 5);
        System.out.println(valor1);

        System.out.println("metodo charAt - Devuelve String con el caracter que ocupa i de la cadena");
        String caracterAt = "metodo charAt";
        char ca0 = caracterAt.charAt(0);
        char ca1 = caracterAt.charAt(1);
        char ca2 = caracterAt.charAt(2);
        char ca3 = caracterAt.charAt(3);
        char ca4 = caracterAt.charAt(4);
        char ca5 = caracterAt.charAt(5);
        System.out.println("Caracter con la posicion 0 : " + ca0);
        System.out.println("Caracter con la posicion 1 : " + ca1);
        System.out.println("Caracter con la posicion 2 : " + ca2);
        System.out.println("Caracter con la posicion 3 : " + ca3);
        System.out.println("Caracter con la posicion 4 : " + ca4);
        System.out.println("Caracter con la posicion 5 : " + ca5);

        System.out.println("Devuelve la posicion en la que se encuentra el caracter 'c' ");

        System.out.println("--------------------------------");
        String indice = "Metodo para encontrar el indice";
        int posicion = indice.indexOf('o');
        System.out.println("Posicion del caracter 'o' : " + posicion);

        System.out.println("--------------------------------");
        String convertir = "Metodo convierte un entero a int";
        System.out.println(convertir);
        String x = String.valueOf("3");
        System.out.println("El valor en convertirse " + x);

    }
}
