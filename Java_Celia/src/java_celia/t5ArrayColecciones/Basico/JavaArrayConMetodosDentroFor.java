/**
 * @created on : 30-ago-2017, 12:42:34
 * @see
 * @since
 * @versions
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico;

/**
 * Se pueden utilizar metodos que instancias array y pasarlos por un for para
 * que recorra cada posicion de su interior
 *
 * @author Portatil_Bot
 */
public class JavaArrayConMetodosDentroFor {

//    Instancio un objeto array
    int[] array;
//    int[] array = {1, 2, 3, 4, 5, 6};

    /**
     * Selecciono el objeto array de la clase
     *
     * @param array
     */
    public void setArrrayVacio(int[] array) {
        this.array = array;
    }

    /**
     * Devuelve el array del atributo de la clase
     *
     * @return
     */
    public int[] getArrayVacio() {
        return array = new int[10];
    }

    /**
     * Obtengo un metodo para fijar un numero aleatorio
     *
     * @return
     */
    public int getNumero() {
        int x = (int) (Math.random() * (1 + 10));
        return x;
    }

    /**
     *
     *
     * @return
     */
    public int[] setArrayConMetodo() {

        System.out.println("Longitud del array : " + getArrayVacio().length);

        for (int i = 0; i < getArrayVacio().length; i++) {
            System.out.println("Indice :" + i);
//            Aquí se muestra como en el metodo que devuelve un objeto array
//             se va almacenando los valores
            System.out.print("getArrayVacio()[i] = getNumero() : ");
            System.out.println(getArrayVacio()[i] = getNumero());
        }
        return array;
    }

    public static void main(String[] args) {

        JavaArrayConMetodosDentroFor j = new JavaArrayConMetodosDentroFor();
        for (int i = 0; i < j.getArrayVacio().length; i++) {
            System.out.println("Valor del objeto array : " + j.setArrayConMetodo()[i]);
        }
    }

}
