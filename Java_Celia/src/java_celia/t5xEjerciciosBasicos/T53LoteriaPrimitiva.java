/**
 * @created on : 29-ago-2017, 23:12:05
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T53LoteriaPrimitiva {

    private int[] loteria = new int[6];

    public int getNumeroAzar() {
        int x = (int) (Math.random() * (1 + 49) + 1);
        return x;
    }

    public void setArray() {
        T53LoteriaPrimitiva t53l = new T53LoteriaPrimitiva();
        for (int i = 0; i < loteria.length; i++) {
            loteria[i] = t53l.getNumeroAzar();
        }
    }

    public void getCheckArray() {

        setArray();

        for (int i = 0; i < loteria.length; i++) {
            for (int j = i + 1; j < loteria.length; j++) {
                if (loteria[i] == loteria[j]) {
                    loteria[i] = (int) (Math.random() * (1 + 49) + 1);
                }
            }
            System.out.println(i + 1 + " : Numeros de la loteria : " + loteria[i]);
        }
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            T53LoteriaPrimitiva lp = new T53LoteriaPrimitiva();
            lp.getCheckArray();
        }
    }
}
