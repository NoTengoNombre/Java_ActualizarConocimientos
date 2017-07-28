/**
 * @created on : 25-jul-2017, 17:25:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_dibujar_figuras;

public class Jtriangulos {

    public void escribirCaracteres(String caracteres, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracteres);
        }
    }

    public void dibujarTriangulo(int offset, int altura) {

        int numAsteriscos = 1;
//                          7         5    - 1
        int numEspacios = offset + (altura - 1);
//                             13
        for (int i = 0; i <= altura; i++) {
            //escribirCaracteres(' ', numEspacios);
            //escribirCaracteres('*', numAsteriscos);
            System.out.println();

        }
    }

    public static void main(String[] args) {

        Jtriangulos t = new Jtriangulos();
        //t.dibujarTriangulo(7, 5);

        t.dibujarTrianguloInfo1(7);
        t.dibujarTrianguloInfo2(7);
        t.dibujarTrianguloInfo3(7);
        t.dibujarTrianguloInfo4(7);
        t.dibujarTrianguloInfo5(7);
        t.dibujarTrianguloInfo6(7);
        t.dibujarCuadrado(7);

    }

    private void dibujarTrianguloInfo1(int n) {
        System.out.println("Triangulo 1 InfoThot");
        for (int i = 1; i <= n; i++) {
            escribirCaracteres("* ", i);
            System.out.println();
        }
    }

    private void dibujarTrianguloInfo2(int n) {
        System.out.println("Triangulo 2 InfoThot");
        /*int numAste = n;
        for (int fil=1; fil<=n; fil++) {
            escribirCaracteres ("* ", numAste);
            System.out.println();
            numAste--;
        }*/
        for (int i = n; i >= 1; i--) {
            escribirCaracteres("* ", i);
            System.out.println();
        }
    }

//                                         5
    private void dibujarTrianguloInfo3(int longitud) {
        System.out.println("Triangulo 3 InfoThot");
//               4      = 5        - 1
        int numEspacios = longitud - 1;
//                      1       5
        for (int i = 1; i <= longitud; i++) {
//                                          
//            escribirCaracteres(" ", numEspacios); // piramides
            escribirCaracteres("  ", numEspacios); // triangulo rectangulo
//            escribirCaracteres (" ", longitud-fil);
//                                   1
            escribirCaracteres("* ", i);
            System.out.println();
            numEspacios--;
        }
    }

    private void dibujarTrianguloInfo4(int longitud) {
        System.out.println("Triangulo 4 InfoThot");
        int numEspacios = 0;
        int numAsteriscos = longitud;
        for (int i = 1; i <= longitud; i++) {
//                                          
//            escribirCaracteres(" ", numEspacios); // piramides
            escribirCaracteres("  ", numEspacios); // triangulo rectangulo
//            escribirCaracteres (" ", longitud-fil);
//                                   1
            escribirCaracteres("* ", numAsteriscos);
            System.out.println();
            numEspacios++;
            numAsteriscos--;
        }
    }

    private void dibujarTrianguloInfo5(int longitud) {
        System.out.println("Triangulo 5 InfoThot");
//                      1      7  
        /*for (int fil = 1; fil <= longitud; fil++) { // filas 
//                       
            for (int j = 1; j <= fil; j++) { // colum
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
// otra forma
        int col = 1;
        for (int fil = 1; fil <= longitud; fil++) {
            int n = 1;
            for (int j = 1; j <= col; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
            col++;
        }
    }

    private void dibujarTrianguloInfo6(int longitud) {
        System.out.println("Triangulo 6 InfoThot");
        int n = 1;
        for (int i = 1; i <= longitud; i++) {
            /*for (int j=1; j<=fil; j++)
                System.out.print(fil+" ");*/
            escribirCaracteres(n + " ", i);
            System.out.println();
            n++;
        }
    }

    private void dibujarCuadrado(int longitud) {
        System.out.println("Cuadrado 1 InfoThot");
        for (int fila = 1; fila <= longitud; fila++) {
            for (int col = 1; col <= longitud; col++) {
                if (fila > 2 && col > 2) {
                System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
