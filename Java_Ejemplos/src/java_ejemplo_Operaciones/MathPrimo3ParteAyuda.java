/**
 * @created on : 29-jul-2017, 14:51:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class MathPrimo3ParteAyuda {

    int numero;
    double raiz;
    boolean primoRelativo;

    public MathPrimo3ParteAyuda(int num) {
        this.numero = num;
//      comprueba que el numero no es PAR
        if (numero % 2 != 0 && numero > 2) {
            primoRelativo = true;
        }
    }

    public void calculaPrimo() {
        int contador = 3;

        this.raiz = Math.sqrt(numero);
        int raiz_entera = (int) Math.floor(raiz);

//        Aquí compruebo que nos numeros no son primos
        while (contador <= raiz_entera && primoRelativo == true) {
            if (numero % contador == 0) {
                primoRelativo = false;
            }
            contador += 2;
        }

        if (primoRelativo == true) {
            System.out.println(numero + " es primo");
        } else {
//            System.out.println(numero + " no es primo");
        }
    }

    public static void main(String[] args) {

        for (int i = 3; i < 2049; i++) {
            MathPrimo3ParteAyuda a = new MathPrimo3ParteAyuda(i);
            a.calculaPrimo();
        }
    }
}
