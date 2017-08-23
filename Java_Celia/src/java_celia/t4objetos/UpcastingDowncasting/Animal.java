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
public class Animal {

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
class Mamifero extends Animal {
}

/**
 * Clase hija 1º
 *
 * @author Portatil_Bot
 */
class Gato extends Mamifero {
}

/**
 * Clase hija 2º
 *
 * @author Portatil_Bot
 */
class Perro extends Mamifero {

}

class Prueba {

    public static void main(String[] args) {

        Gato g = new Gato(); // clase hija
        System.out.println("metodo clase Ancestro no necesita casting 'upcasting'");
        System.out.println(g.getVida()); // metodo clase Ancestro no necesita casting 'upcasting'

        Perro p = new Perro();
        System.out.println("metodo clase Ancestro no necesita casting 'upcasting'");
        System.out.println(p.getVida()); // metodo clase Ancestro no necesita casting 'upcasting'

        System.out.println("• Upcasting");
        Gato gUpCasting = new Gato(); // clase hija
        System.out.println(gUpCasting);
        Mamifero m = g; // UPCASTING
        System.out.println(m);

    }
}
