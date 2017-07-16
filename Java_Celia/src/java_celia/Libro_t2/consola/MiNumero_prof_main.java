//package java_celia.Libro_t2.consola;

public class MiNumero_prof_main {

    public static void main(String[] args) {

        MiNumero_prof n1 = new MiNumero_prof();

        System.out.println("Por favor - Intro num entero : ");
        int x = Integer.parseInt(System.console().readLine());
        MiNumero_prof n2 = new MiNumero_prof(x);

        n1.cambiaNumero(5);
        n1.resta(1);
        n2.suma(n1.setValor());

        System.out.println("\n\nPROBANDO LA CLASE miNumero\n\n");

        System.out.println("NÚMERO n1");
        System.out.println("  Valor actual = " + n1.setValor());
        System.out.println("  Doble = " + n1.setDoble());
        System.out.println("  Triple = " + n1.setTriple());
        System.out.println("  Cuádruple = " + n1.setCuadruple() + "\n");

        System.out.println("NÚMERO n2");
        System.out.println("  Valor actual = " + n2.setValor());
        System.out.println("  Doble = " + n2.setDoble());
        System.out.println("  Triple = " + n2.setTriple());
        System.out.println("  Cuádruple = " + n2.setCuadruple() + "\n");

    }
}
