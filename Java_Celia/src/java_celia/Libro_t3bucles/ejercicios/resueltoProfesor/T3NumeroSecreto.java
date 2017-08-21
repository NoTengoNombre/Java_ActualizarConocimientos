/**
 * @created on : 21-ago-2017, 19:03:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3NumeroSecreto {

    private int num;

    /**
     * Elige el numero
     */
    public void setEligeNumSecreto() {
        num = (int) ((Math.random() * 10) + 1);
    }

    /**
     * Devuelve -1 si es menor Devuelve +1 si es mayor Devuelve 0 iguales
     *
     * @param n
     * @return
     */
    public int getComparaNum(int n) {
        int resultado;
        if (n < num) {
            resultado = -1;
        } else if (n > num) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Inicio ");
        System.out.println("Trata de adivinar mi numero (entre 1 y 100 ) ");

        T3NumeroSecreto secreto = new T3NumeroSecreto();

        int n;
        int intentos = 1;

        secreto.setEligeNumSecreto();

        do {
            System.out.println("Ingresa un numero : ");
            n = SC.nextInt();
            intentos++;
            if (secreto.getComparaNum(n) == -1) {
                System.out.println("Mi numero es Mayor");
            }
            if (secreto.getComparaNum(n) == 1) {
                System.out.println("Mi numero es Menor");
            }
        } while (secreto.getComparaNum(n) != 0);

        System.out.println("Enhorabuena ! has Acertado ! ");
        System.out.println("Has necesitado " + intentos + " intentos");
    }
}
