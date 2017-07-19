//package java_ejemplo_captura_teclado;

/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
//package java_ejemplo_captura_teclado;
public class T2_2Peso_condicional_captura_teclado {

    public static void main(String[] args) {
        T2_2Peso_condicional p1 = new T2_2Peso_condicional(10, "oz");    // Instancia objeto peso con valor 10 onzas
        T2_2Peso_condicional p2 = new T2_2Peso_condicional(10, "lb");    // Instancia objeto peso con valor 10 libras
        T2_2Peso_condicional p3 = new T2_2Peso_condicional(10, "kg");    // Instancia objeto peso con valor 10 kilogramos
        T2_2Peso_condicional p4 = new T2_2Peso_condicional(10, "gr");    // Instancia objeto peso con valor 10 gramos

        System.out.println("PROBANDO EL METODO getPeso():");
        System.out.println("Diez onzas son " + p1.getPeso() + " kg");
        System.out.println("Diez libras son " + p2.getPeso() + " kg");
        System.out.println("Diez kilogramos son " + p3.getPeso() + " kg");
        System.out.println("Diez gramos son " + p4.getPeso() + " kg");

        System.out.println("PROBANDO EL RESTO DE GETTERS:");
        System.out.println("Diez kilogramos son " + p3.getOnzas() + " oz");
        System.out.println("Diez kilogramos son " + p3.getLibras() + " lb");
        System.out.println("Diez kilogramos son " + p3.getGramos() + " gr");

    }

}
