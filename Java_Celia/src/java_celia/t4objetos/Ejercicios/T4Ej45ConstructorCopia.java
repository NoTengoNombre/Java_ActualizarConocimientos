/**
 * @created on : 24-ago-2017, 0:29:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios;

public class T4Ej45ConstructorCopia {

    public static void main(String[] args) {

        Animalicos.setAnimales();

        Animalicos ac1 = new Animalicos();

        ac1.setDientes(26);
        ac1.setEdad(7);
        ac1.toString();

        Animalicos ac2 = new Animalicos(ac1);
        ac2.toString();

        Animalicos.setAnimales();
    }
}

class Animalicos {

    private static int contador = 0;
    private static int numAnimales = 0;
    private int edadAnimal = 0;
    private int dienteAnimal = 0;

    public Animalicos() {
        numAnimales++;
    }

    public Animalicos(Animalicos a) {
        this.dienteAnimal = a.getDientes();
        this.edadAnimal = a.getEdad();
        numAnimales++;
    }

    public void setEdad(int edad) {
        this.edadAnimal = edad;
    }

    public int getEdad() {
        return this.edadAnimal;
    }

    public void setDientes(int diente) {
        this.dienteAnimal = diente;
    }

    public int getDientes() {
        return this.dienteAnimal;
    }

    public static void setAnimales() {
        System.out.println("Cuantos objetos hay : " + numAnimales);
    }

    @Override
    public String toString() {
        contador++;
        String datos = ("Edad " + this.getEdad() + " Diente " + this.getDientes());
        System.out.println(contador + " : Edad " + this.getEdad() + " Diente " + this.getDientes());
        return datos;
    }

}
