/**
 * @created on : 28-jul-2017, 21:19:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class ModuloResto2 {

    public static void main(String[] args) {

        int numero = 10;
        int indice1 = 5;
        int indice2 = 5;

        if (numero % (indice1 + indice2) == 0) {
            System.out.println("Indice 1 : " + numero);
        }
        
        int numero2 = 10;
        int indice3 = 7;
        int indice4 = 3;

        if (numero2 % (indice3 + indice4) == 0) {
            System.out.println("Indice 2 : " + numero2);
        }
    }
}
