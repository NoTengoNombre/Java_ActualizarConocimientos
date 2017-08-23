/**
 * @created on : 23-ago-2017, 18:45:12
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.OperadorInstanceOf;

public class Animal {

    int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}

class Mamifero extends Animal {
}

class Gato extends Mamifero {
}

class Perro extends Mamifero {
}
