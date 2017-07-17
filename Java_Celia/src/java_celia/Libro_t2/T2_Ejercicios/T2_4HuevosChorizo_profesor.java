/**
 * @created on : 17-jul-2017, 13:18:07
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

public class T2_4HuevosChorizo_profesor {

    private int huevos;      // Número de huevos
    private int chorizo;	    // Gramos de chorizo

    // Constructor: inicializa los valores de huevos y chorizo
    T2_4HuevosChorizo_profesor(int docenasDeHuevos, double kgDeChorizo) {
        huevos = docenasDeHuevos * 12;  // Vamos a almacenar el nº de huevos, no de docenas
        chorizo = (int) (kgDeChorizo * 1000);   // Vamos a guardar la cantidad en gramos
    }

    // Incrementa el número de huevos
    void addHuevos(int num) {
        huevos = huevos + (num * 12);
    }

    // Incrementa la cantidad de gramos de chorizo. 
    // El método recibe la
    // cantidad expresada en kg, así que la mu  ltiplicamos por 1000.
    void addChorizo(double num) {
        chorizo = (int) (chorizo + (num * 1000));
    }

    // Devuelve el número actual de huevos
    int getHuevos() {
        return huevos;
    }

    // Devuelve el número actual de kg de chorizo
    double getChorizo() {
        return ((double) chorizo / 1000);
    }

    // Calcula cuántos platos se pueden cocinar
//    con las cantidades actuales de huevos y chorizo
    int getNumPlatos() {
        // Calculamos cuántos platos se pueden preparar con los huevos actuales
        int n1 = huevos / 2;                    // Cada plato necesita 2 huevos
        // Calculamos cuántos platos se pueden preparar con los chorizos actuales
        int n2 = chorizo / 200;  		      // Cada plato necesita 200 gr de chorizo
        // El número máximo de platos que se pueden preparar será el menor entre n1 y n2
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // Resta una cantidad al número de 
// huevos y chorizos, como resultado de haber servido un plato
    // (2 huevos menos y 200 gr de chorizo menos)
    void sirvePlato() {
        huevos = huevos - 2;
        chorizo = chorizo - 200;
    }

    public static void main(String[] args) {

        T2_4HuevosChorizo_profesor t = new T2_4HuevosChorizo_profesor(1, 1000);

        double chorizo1 = t.getChorizo();
        System.out.println("chorizo : " + chorizo1);

        int huevos1 = t.getHuevos();
        System.out.println("huevo : " + huevos1);

//        t.sirvePlato();
        System.out.println("-------------------");

        System.out.println("chorizo : " + chorizo1);
        System.out.println("huevo : " + huevos1);

        int numPlatos = t.getNumPlatos();
        System.out.println("numero de platos : " + numPlatos);
    }
}
