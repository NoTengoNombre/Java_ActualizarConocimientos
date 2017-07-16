//package java_celia.Libro_t2.consola;

public class MiNumero_prof {

    private int numero;

    public MiNumero_prof() {
        numero = 0;
    }

    public MiNumero_prof(int num) {
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

    public int setValor() {
        System.out.println("Fijar Valor :  " + numero);
        return numero;
    }

    public int setDoble() {
        return numero * 2;
    }

    public int setTriple() {
        return numero * 3;
    }

    public int setCuadruple() {
        return numero * 4;
    }

}
