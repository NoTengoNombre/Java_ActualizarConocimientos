package java_celia.Libro_t2.ejercicios;

/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */

public class T2_2Conversor_divisas_prof_main {

    public static void main(String[] args) {

        System.out.println("¿ Que tipo de cambio quieres ? ");

        double tipo;

        tipo = Double.parseDouble(System.console().readLine());

        T2_2Conversor_divisas f1 = new T2_2Conversor_divisas();
        T2_2Conversor_divisas f2 = new T2_2Conversor_divisas(tipo);

        double euros = 100.00;
        double libras = 100.00;

        System.out.println("Con el tipo de cambio = " + f1.getTipoCambio() + " : ");
        System.out.println(euros + " euros son " + f1.eurosToLibras(euros) + " libras ");
        System.out.println(libras + " libras son  " + f1.libraToEuros(libras) + " euros \n ");

        System.out.println("Con el tipo de cambio = " + f2.getTipoCambio() + " : ");
        System.out.println(euros + " euros son " + f1.eurosToLibras(euros) + " libras ");
        System.out.println(libras + " libras son  " + f2.libraToEuros(libras) + " euros \n ");

    }
}
