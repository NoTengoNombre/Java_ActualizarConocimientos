/**
 * @created on : 17-jul-2017, 21:24:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

public class T3_switch_tipo_real {

    public static void main(String[] args) {

        double r = 1.1;
//                 clase   metodo  clase metodo     valores 
        int valor = (int) (Math.random() * (1 + 100));

        System.out.println("" + valor);
        switch (valor) {
            case 1:
                System.out.println("valor : " + valor);
                break;
            case 2:
                System.out.println("valor : " + valor);
                break;
            default:
                System.out.println("error ");
        }

    }

}
