/**
 * @created on : 12-sep-2017, 19:33:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_SopaDeLetrasAlpha;

/**
 * Generar Matrices que dispongan las palabras:
 *
 * Vertical , Horizontal , Diagonal , Invertidas
 *
 * A - Tamaño de la sopa de la letra a generar
 *
 * B - Numero de palabras que la sopa tiene que contener
 *
 * C - Forma de la sopa de letras va a generar
 *
 * @author Portatil_Bot
 */
public class T5xSopaDeLetrasGenerarMatrices {

    private static char[][] matriz;

    public static void main(String[] args) {
        GenerarMatrices2 gm = new GenerarMatrices2();
        matriz = gm.getGenerarMatrizCaracterAleatorios(5, 10);
        matriz = gm.setArrayVertical(matriz, "GATO");
//        System.out.println("--------------------------");
        matriz = gm.setArrayHorizontal(matriz, "PERRO");
//        System.out.println("--------------------------");
        matriz = gm.setArrayDiagonal(matriz, "MOUSE");
//        System.out.println("--------------------------");
        matriz = gm.setInvertido(matriz, "ZORRO");
        gm.setVerMatrices(matriz);

    }
}

class GenerarMatrices2 implements SopaDeLetraMatriz {

    /**
     * A - Tamaño de la sopa de letras a generar
     *
     * Matriz con formas geometricas basicas "cuadrado" o "rectangulo y lo
     * devuelve
     *
     * @param fila
     * @param col
     * @return
     */
    @Override
    public char[][] getGenerarMatrizCaracterAleatorios(int fila, int col) {
        System.out.println("\u001b[33m◘ Genera una matriz basica de letras");
        CapturaTeclado ct = new CapturaTeclado();
        char[][] matriz = new char[fila][col];
        for (fila = 0; fila < matriz.length; fila++) {
            for (col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = ct.getGeneraLetraAleatoria();
            }
        }
        return matriz;
    }

    /**
     *
     * @param matriz
     */
    public char[][] setArrayVertical(char[][] matriz, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int indice = 0;
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                // Modificando (cadena[0].length - 10)
                // esta parte mueve la palabra de izquierda a derecha
                if ((f == f) && (c == (matriz[0].length - (matriz[f].length)))) {
                    if (indice < palabra.length() && (f <= palabra.length())) {
                        matriz[f][c] = palabraTroceada[indice];
                        indice++;
                    }
                }
            }
        }
        return matriz;
    }

    /**
     *
     * @param args
     */
    public char[][] setArrayHorizontal(char[][] matriz, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int indice = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
// Modificando (f == 0) Movemos de arriba a abajo el array de letras
                if (((f == 0) && (c <= matriz.length))) {
                    if ((indice < palabra.length()) && (indice < matriz[f].length)) {
                        matriz[f][c] = palabraTroceada[indice];
                        indice++;
                    }
                }
            }
        }
        return matriz;
    }

    /**
     *
     * @param args
     */
    public char[][] setArrayDiagonal(char[][] matriz, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int indice = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == f && f == c) {
                    if ((indice < palabra.length()) && (indice < matriz[f].length)) {
                        matriz[f][c] = palabraTroceada[indice];
                        indice++;
                    }
                }
            }
        }
        return matriz;
    }

    /**
     * Añade 1 palabra segun la posicion de la fila y la columna
     *
     * "PASARLE los parametros de fila 'f' y columna 'c' para elegir donde
     * insertar la palabra dentro del array y ademas evitar que se solapen
     *
     * Incluso comprobar que si tienen en mismo valor puedan solaparse las
     * palabras
     *
     * @param matriz
     * @param palabra
     * @return
     */
    public char[][] setInvertido(char[][] matriz, String palabra) {
        CapturaTeclado ct = new CapturaTeclado();
        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);
        int indice = 0;
//f - controla la posicion de la fila donde quiero que este (mas alto mas abajo)
        for (int f = matriz.length - 1; f < matriz.length; f++) {
//Controla la posicion de la columna donde quiero que este 
            for (int c = matriz[f].length - 1; c >= 0; c--) {
                if (indice < palabra.length() && (indice <= matriz[f].length)) {
                    matriz[f][c] = palabraTroceada[indice];
                    indice++;
                }
            }
            System.out.println();
        }
        return matriz;
    }

    @Override
    public String getElegirPalabra(int longitudMatriz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param matriz
     */
    public void setVerMatrices(char[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

}
