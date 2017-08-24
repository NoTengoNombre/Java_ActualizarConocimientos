/**
 * @created on : 24-ago-2017, 0:29:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios;

public class T4Ej44ContadorAnimales {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();
        Animal a5 = new Animal();
        Animal a6 = new Animal();

        Animal.setAnimales();

    }
}

class Animal {

    private static int numAnimales = 0;

    public Animal() {
        numAnimales++;
    }

    public static void setAnimales() {
        System.out.println("Cuantos objetos hay : " + numAnimales);
    }

}
