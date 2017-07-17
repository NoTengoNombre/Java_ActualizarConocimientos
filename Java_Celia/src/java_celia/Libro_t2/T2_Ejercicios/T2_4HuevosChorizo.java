/**
 * @created on : 17-jul-2017, 13:18:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

public class T2_4HuevosChorizo {

    private int total_huevos;
    private double total_chorizos_gr;

    private int total_platos;
    private static int platos_servidos = 1;

    public T2_4HuevosChorizo() {
    }

    public T2_4HuevosChorizo(int docenas, double kilos) {
        total_huevos = docenas * 12;
        total_chorizos_gr = kilos * 1000;
    }

    public int getHuevos() {
        return total_huevos;
    }

    public double getChorizo() {
        return total_chorizos_gr;
    }

    public void addHuevos(int num_huevos) {
        total_huevos = num_huevos * 12; // huevos
    }

    public void addChorizos(double num_chorizos) {
        total_chorizos_gr = num_chorizos * 1000; // gramos
    }

    public int getNumPlatos() {
        int num_huevos = total_huevos / 2;
        int num_chorizos = (int) total_chorizos_gr / 200;
        System.out.println("total huevos " + num_huevos);
        System.out.println("total chorizos " + num_chorizos);
        total_platos = num_chorizos;
        return total_platos;
    }

    public static void total_platos() {
        System.out.println("total de platos : " + platos_servidos);
    }

    public void getNumPlatos_mejorado() {
        System.out.println("-------------------------------");
        int num_huevos = total_huevos / 2;
        int num_chorizos = (int) total_chorizos_gr / 200;
        System.out.println("• total huevos " + num_huevos);
        System.out.println("• total chorizos " + num_chorizos);
        int plato = num_huevos / num_chorizos;
        System.out.println("♦ plato " + plato);
        System.out.println("♦ platos servidos :  " + platos_servidos++);
        System.out.println("-------------------------------");
    }

    public void sirvePlato() {
        total_huevos -= 2;
        System.out.println("total platos " + total_platos);
        total_chorizos_gr -= 200;
    }

    public static void main(String[] args) {

        T2_4HuevosChorizo t2h = new T2_4HuevosChorizo(2, 2);

        System.out.println("Total de huevos : " + t2h.total_huevos);
        System.out.println("Total de chorizos : " + t2h.total_chorizos_gr + " gramos");

        t2h.getNumPlatos_mejorado();
        t2h.sirvePlato();

        t2h.getNumPlatos_mejorado();
        t2h.sirvePlato();

        System.out.println("Total de huevos : " + t2h.total_huevos);
        System.out.println("Total de chorizos : " + t2h.total_chorizos_gr);

        t2h.getNumPlatos_mejorado();
        t2h.sirvePlato();

        System.out.println("Total de huevos : " + t2h.total_huevos);
        System.out.println("Total de chorizos : " + t2h.total_chorizos_gr);

        t2h.getNumPlatos_mejorado();
        t2h.sirvePlato();

        System.out.println("Total de huevos : " + t2h.total_huevos);
        System.out.println("Total de chorizos : " + t2h.total_chorizos_gr);

        t2h.getNumPlatos_mejorado();
        t2h.sirvePlato();

        System.out.println("Total de huevos : " + t2h.total_huevos);
        System.out.println("Total de chorizos : " + t2h.total_chorizos_gr);

        System.out.println("-------------------");
        System.out.println("Platos servidos : " + t2h.total_platos);

    }
}
