/**
 * @created on : 22-ago-2017, 19:18:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.ConstructorCopia;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(final Fecha f) {
        this.dia = f.getDia();
        this.mes = f.getMes();
        this.anio = f.getAnio();
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public static void main(String[] args) {

        Fecha f = new Fecha(1, 3, 1994);
        Fecha f1 = new Fecha(f);

        System.out.println(f.getAnio());
        System.out.println(f.getMes());
        System.out.println(f.getDia());
        System.out.println("-----------");
        System.out.println(f1.getAnio());
        System.out.println(f1.getMes());
        System.out.println(f1.getDia());

    }

}
