/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

public class java_ejemplo_Math_media {

    public static void main(String[] args) {

        double c = 0;
        double desv = 0;
        int[] a = {12, 6, 7, 3, 15, 10, 18, 5};

        for (int i = 0; i < a.length; i++) {
            c = c + a[i];
        }

        System.out.println("• contador : " + c);

        System.out.println("• Media : " + c + " / " + a.length + " = " + c / a.length);
        double media = c / a.length;

        System.out.println("--------------");

        for (int i = 0; i < a.length; i++) {
            desv = desv + Math.pow(a[i] - media, 2);
        }

        desv = desv / a.length;
        double desv1 = Math.sqrt(desv);

        System.out.println("--------------");
        System.out.println("media de 76 / 8 = " + media);
        System.out.println("-9.5^2 = " + -(Math.pow(media, 2)));
        System.out.println("Valor de la desviacion = " + desv1);

    }
}
