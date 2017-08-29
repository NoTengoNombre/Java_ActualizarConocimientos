/**
 * @created on : 29-ago-2017, 23:12:05
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T53LoteriaPrimitiva {

    public static void main(String[] args) {

        LoteriaPrimitiva lp = new LoteriaPrimitiva();
        System.out.println(lp.getNumeroAzar());

        lp.getCheckArray();

    }
}

class LoteriaPrimitiva {

    private int[] loteria;

    public LoteriaPrimitiva() {
        loteria = new int[6];
    }

    public int getNumeroAzar() {
        int x = (int) (Math.random() * (1 + 49) + 1);
        return x;
    }

    public void setArray() {
        for (int i = 0; i < loteria.length; i++) {
            loteria[i] = getNumeroAzar();
        }
    }

    public void getCheckArray() {

        setArray();

        for (int i = 0; i < loteria.length; i++) {
            for (int j = 0; j < loteria[i]; j++) {
                System.out.println(loteria[i]);
            }
        }
    }

}
