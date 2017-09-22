/**
 * @created on : 18-sep-2017, 0:31:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

import java.util.Arrays;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetraNumerosAleatorios;
import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetraNumerosAleatorios.getStaticNumRandom;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetrasDiccionario;
import static java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2.T5xSopaDeLetrasNumerosAleatorios.getNumRandomDe0a5;

class T5xSopaDeLetrasFilasColumnasCopiaS implements SopaDeLetraMatriz2, SopaDeLetraNumerosAleatorios {

    private static int fila;
    private static int col;

    private static char[][] matriz;
    private static String[] contenedorPalabras;

    /**
     * Devuelve las filas
     *
     * @return
     */
    public static int getNumeroFila() {
        return fila;
    }

    /**
     * Devuelve las col
     *
     * @return
     */
    public static int getNumeroColum() {
        return col;
    }

    /**
     *
     * @return
     */
    public static char[][] getMatrizChar() {
        return matriz;
    }

    /**
     *
     * @param paraMatriz
     */
    public static void setMatrizChar(char[][] paraMatriz) {
        matriz = paraMatriz;
    }

    /**
     *
     * @param minimo
     * @param maximo
     * @return
     */
    @Override
    public int getNumRandom(int minimo, int maximo) {
        int x = (int) (Math.random() * (minimo + maximo));
        return x;
    }

    /**
     *
     */
    public void verFilasColum() {
        System.out.println("• Filas " + getNumeroFila() + " • Columnas : " + getNumeroColum());
    }

    /**
     * A - Tamaño de la sopa de letras a generar y la llena de caracteres
     *
     * @param filaParam
     * @param colParam
     * @return Matriz llena de caracteres
     */
    @Override
    public char[][] getGenerarMatrizCaracterAleatorios(int filaParam, int colParam) {
        T5xSopaDeLetrasCogeDatosTeclado ct = new T5xSopaDeLetrasCogeDatosTeclado();

        fila = filaParam;
        col = colParam;

        matriz = new char[fila][col];

        for (fila = 0; fila < matriz.length; fila++) {
            for (col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = ct.getGeneraLetraAleatoria();
            }
        }
        return matriz;
    }

    /**
     * Muestra la matriz de char pasada por parametro
     *
     * @param matriz
     */
    public void verMatrizGenerada(char[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col]);
            }
            System.out.print("\n");
        }
    }

    /**
     *
     * @return
     */
    public char[][] setFormaDefinidasSopaDeLetras(int filaParam, int colParam) {
        T5xSopaDeLetrasCogeDatosTeclado sdlct = new T5xSopaDeLetrasCogeDatosTeclado();
        System.out.println("♠ Elige la forma de la sopa de letras : 1 - Cuadrada : 2 - Rectangular ♠");
        int x = sdlct.getElegirNumeroEntre1y2();
        switch (x) {
            case 0:
                System.out.println("♠ Sin forma elegida : ♠");
                break;
            case 1:
                System.out.println("♠ Forma elegida Cuadrada ♠");
                break;
            case 2:
                System.out.println("♠ Forma elegida Rectangular ♠");
                break;
            default:
                break;
        }
        if (x == 1) {
            matriz = getGenerarMatrizCaracterAleatorios(filaParam, colParam);
        }
        if (x == 2) {
            matriz = getGenerarMatrizCaracterAleatorios((filaParam), (filaParam) * 2);
        }
        return matriz;
    }

    /**
     * Le pasamos por parametro el numero de palabras que va a tener la matriz y
     * devuelve un String de alabras
     *
     * @param numeroPalabra - Introducir -> <b>getNumeroDePalabrasParaSopa</b>
     * @return
     */
    public String[] getListaPalabrasParaSopaLetras(int numeroPalabra) {
        contenedorPalabras = new String[numeroPalabra];
        for (int i = 0; i < numeroPalabra; i++) {
            System.out.println("◘ " + SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase() + " ◘ ");
            contenedorPalabras[i] = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase();
            System.out.println("◘ Valor de : " + i + " ◘ ");
            System.out.println("◘ Numero : " + i + " - palabra : " + contenedorPalabras[i] + " ◘ ");
            System.out.println("-------------------------");
        }
        return contenedorPalabras;
    }

    /**
     * Devuelve una "STRING" menor que la longitud del "ARRAY" pasado por
     * parametro
     *
     * @param totalPalabras
     * @return
     */
    @Override
    public String getElegirPalabraSopaLetras() {
        int x;
        boolean stop = true;
        String palabra = new String();

        for (int i = 0; i < SopaDeLetrasDiccionario.DICCIONARIO.length; i++) {
            System.out.println("♥ SopaDeLetrasDiccionario Diccionario " + SopaDeLetrasDiccionario.DICCIONARIO[i].length());
            System.out.println("♥ ArrayDePalabras " + contenedorPalabras.length);
            if (SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= contenedorPalabras.length) {
                while (stop != false) {
                    x = getStaticNumRandom(1, (SopaDeLetrasDiccionario.DICCIONARIO.length - 1));
                    palabra = SopaDeLetrasDiccionario.DICCIONARIO[x].toUpperCase();
                    System.out.println("○ Palabra elegida : " + palabra + " longitud : " + palabra.length() + " ○ ");
                    System.out.println("-----------------------");
                    if (palabra.length() < (matriz.length) && (palabra.length() < matriz[0].length)) {
                        stop = false;
                    }
                }
            } else {
                palabra = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase();
                System.out.println("♥♥ Otra palabra Elegida " + palabra);
            }
        }
        return palabra;
    }

    /**
     *
     * @return
     */
    public String getOtraPalabraSopaLetras(String[] verPalabras) {
        String nuevaPalabra = new String();
        System.out.println(Arrays.toString(verPalabras));

        for (int i = 0; i < verPalabras.length; i++) {
            if (verPalabras[i] != null) {
                nuevaPalabra = verPalabras[i];
                System.out.println("Nueva palabra : " + nuevaPalabra);
            } else {
                nuevaPalabra = null;
            }
        }
        return nuevaPalabra;
    }

    public static void main(String[] args) {
        T5xSopaDeLetrasFilasColumnasCopiaS t = new T5xSopaDeLetrasFilasColumnasCopiaS();
        T5xSopaDeLetrasCogeDatosTeclado c = new T5xSopaDeLetrasCogeDatosTeclado();
        T5xSopaDeLetrasMetodosFormaPalabras fps = new T5xSopaDeLetrasMetodosFormaPalabras();

//        t.getGenerarMatrizCaracterAleatorios(c.getNumero(), c.getNumero());
        t.getGenerarMatrizCaracterAleatorios(6, 6);
//        t.setFormaDefinidasSopaDeLetras(getNumeroFila(), getNumeroColum());

        t.verFilasColum();
        t.getListaPalabrasParaSopaLetras(c.getNumeroDePalabrasParaSopa());

//        System.out.println("-------------------");
//        System.out.println(t.getElegirPalabraSopaLetras());
//        System.out.println("-------------------");
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j]);
//            }
//            System.out.println();
//        }
        String palabraElegida = t.getElegirPalabraSopaLetras();

        System.out.println("͏ Ver la palabra elegida : " + palabraElegida + " ͏");

        fps.setPalabrasHorizontalBasica(getMatrizChar(), palabraElegida, getNumRandomDe0a5(), getNumRandomDe0a5());

//        fps.setPalabrasVerticales(matriz, palabraElegida, 1, 1);
//        t.verMatrizGenerada(getMatrizChar());
        t.getOtraPalabraSopaLetras(contenedorPalabras);

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j]);
//            }
//            System.out.println();
//        }
    }

}
