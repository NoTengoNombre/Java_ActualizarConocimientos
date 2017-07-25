/**
 * @created on : 24-jul-2017, 23:19:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Estadistica;

public class Estadistica {

    private double[] x;
    private int n;

    public Estadistica(double[] datos) {
        x = datos;
        n = datos.length;
    }

    public double valorMedio() {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += x[i];
        }
        return suma / n;
    }

    public double desviacionMedia() {
        double suma = 0;
        double media = valorMedio();
        for (int i = 0; i < n; i++) {
            suma += Math.abs(x[i] - media);
        }
        return suma / n;
    }

    public double desviacionCuadratica() {
        double suma = 0;
        double media = valorMedio();
        for (int i = 0; i < n; i++) {
            suma += (x[i] - media) * (x[i] - media);
        }
        return Math.sqrt(suma / n);
    }

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < n; i++) {
            texto += "\t" + x[i];
        }
        texto += "\n";
        return texto;
    }

    public static void main(String[] args) {
        double[] datos = {1.65, 1.82, 1.72, 1.75, 1.73, 1.85, 1.90, 1.74, 1.76, 1.77};
        Estadistica es = new Estadistica(datos);
        System.out.println("media:                 " + es.valorMedio());
        System.out.println("desviación media:      " + es.desviacionMedia());
        System.out.println("desviación cuadrática: " + es.desviacionCuadratica());
        //imprime los datos
        System.out.println("datos guardados: " + es);
    }
}
