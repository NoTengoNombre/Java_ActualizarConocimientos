/**
 * @created on : 24-ago-2017, 0:51:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios;

public class T4Ej43_AnimalesCopia {

    private static int numAnimales;
    private int edadAnimal;
    private int dienteAnimal;

    public T4Ej43_AnimalesCopia() {
        this.edadAnimal = 0;
        this.dienteAnimal = 0;
        numAnimales++;
    }

    public T4Ej43_AnimalesCopia(int edadAnimal, int dienteAnimal) {
        this.edadAnimal = edadAnimal;
        this.dienteAnimal = dienteAnimal;
        numAnimales++;
    }

    public T4Ej43_AnimalesCopia(T4Ej43_AnimalesCopia a) {
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
        System.out.println("♦ Cuantos objetos hay : " + numAnimales);
    }

    @Override
    public String toString() {
//        System.out.println("♦ Edad " + this.getEdad() + " ♦ Diente " + this.getDientes());
        String datos = ("♦ Edad " + this.getEdad() + " ♦ Diente " + this.getDientes());
        return datos;
    }

    public static void main(String[] args) {

        setAnimales();

        T4Ej43_AnimalesCopia ac1 = new T4Ej43_AnimalesCopia();

        ac1.setEdad(5);
        ac1.setDientes(16);

        int diente1 = ac1.getDientes();
        int edad1 = ac1.getEdad();

        System.out.println("---------------------");
        System.out.println("•- Dientes 1 : " + diente1);
        System.out.println("•- Edad 1 : " + edad1);

        T4Ej43_AnimalesCopia ac2 = new T4Ej43_AnimalesCopia(ac1);

        ac1.toString();

        int dientes2 = ac2.getDientes();
        int edad2 = ac2.getEdad();

        String acString = ac2.toString();

        System.out.println("---------------------");
        System.out.println("•- Edad 2 : " + edad2);
        System.out.println("•- Dientes 2 : " + dientes2);
        System.out.println("---------------------");
        System.out.println("• Metodo String : " + acString);

        ac2.setEdad(7);
        ac2.setDientes(36);

        dientes2 = ac2.getDientes();
        edad2 = ac2.getEdad();

        System.out.println("---------------------");
        System.out.println("•- Edad 2 modificada : " + edad2);
        System.out.println("•- Dientes 2 modificada : " + dientes2);
        System.out.println("---------------------");

        setAnimales();

    }

}
