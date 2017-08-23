/**
 * @created on : 23-ago-2017, 17:48:15
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.UpcastingDowncasting;

/**
 * Clase Ancestro 1º
 *
 * @author Portatil_Bot
 */
public class Animal1 {

    /**
     * Atributo default Clase Ancestro.
     *
     * Para todas las clases descendientes
     *
     */
    int vida = 100;

    /**
     * Metodo Clase Ancestro
     *
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo Clase Ancestro
     *
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}

/**
 * Clase Abuelo 2º
 *
 * @author Portatil_Bot
 */
class Mamifero1 extends Animal1 {
}

/**
 * Clase hija 1º
 *
 * @author Portatil_Bot
 */
class Gato1 extends Mamifero1 {
}

/**
 * Clase hija 2º
 *
 * @author Portatil_Bot
 */
class Perro1 extends Mamifero1 {

}

class Prueba1 {

    public static void main(String[] args) {

        System.out.println("• Upcasting");
        Gato1 gatoUpCasting = new Gato1(); // clase hija
        System.out.println(gatoUpCasting);
        Mamifero1 m = gatoUpCasting; // UPCASTING
        System.out.println("------------ Upcasting ------------");
        System.out.println("Mamifero que tiene un objeto referenciando a Gato : " + m);

        Gato1 g1 = new Gato1(); // clase hija
        Animal1 a = g1; // upcasting automatico
        Gato1 g2 = (Gato1) a; // downcasting manual
        System.out.println("------------ Downcasting ------------");
        System.out.println("Mamifero que tiene un objeto referenciando a Gato : " + g2);

    }
}
