//package java_celia.Libro_t2.consola;

public class MiNumero {

    private int numero;

    private int total_numero;

    public MiNumero() {
        numero = 0;
    }

    public MiNumero(int num) {
        numero = num;
        System.out.println("Valor Constructor :  " + numero);
    }

    public void cambiaNumero(int num) {
        numero = num;
        System.out.println("Cambiar valor :  " + numero);
    }

    public int suma(int suma) {
        numero = numero + suma;
        System.out.println("Suma Valor :  " + numero);
        return numero;
    }

    public void resta(int resta) {
        numero = numero - resta;
        System.out.println("Resta Valor :  " + numero);
    }

    public void setValor() {
        System.out.println("Fijar Valor :  " + numero);
    }

    public int setDoble() {
        total_numero += numero;
        System.out.println("Valor doble :  " + total_numero);
        return total_numero;

    }

    public int setTriple() {
        total_numero += numero + numero;
        System.out.println("Valor triple :  " + total_numero);
        return total_numero;
    }

    public int setCuadruple() {
        total_numero = numero * 4;
        System.out.println("Valor cuadruple :  " + total_numero);
        return total_numero;
    }

    public int setCuadruple2() {
        total_numero = numero * 4;
        System.out.println("Valor cuadruple :  " + total_numero);
        return total_numero;
    }

    public static void main(String[] args) {

        MiNumero mn = new MiNumero(2);

        mn.setValor();

        mn.setDoble();

        mn.setTriple();

        mn.setCuadruple();

        mn.setCuadruple2();

        int suma = mn.suma(mn.setDoble());

        System.out.println("Suma : " + suma);

    }

}
