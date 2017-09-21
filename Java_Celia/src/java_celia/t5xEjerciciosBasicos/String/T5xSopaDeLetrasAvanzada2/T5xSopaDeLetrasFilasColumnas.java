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
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetrasDiccionario;

class T5xSopaDeLetrasFilasColumnas implements SopaDeLetraMatriz2, SopaDeLetraNumerosAleatorios {

    private static int fila;
    private static int col;
    private static int indice;

    private static char[][] matriz;
    private static String[] contenedorPalabras;
    private static int[] numeros;

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
     * devuelve un array de String de palabras
     *
     * @param numeroPalabra - Introducir -> <b>getNumeroDePalabrasParaSopa</b>
     * @return
     */
    public String[] getListaPalabrasParaSopaLetras(int numeroPalabra) {
//               4                            4
        contenedorPalabras = new String[numeroPalabra];

        System.out.println("numeroPalabra : " + numeroPalabra);
        System.out.println("contenedorPalabras.length : " + contenedorPalabras.length);
        System.out.println("SopaDeLetrasDiccionario.DICCIONARIO[indice].length() : " + SopaDeLetrasDiccionario.DICCIONARIO[indice]);

        System.out.println("------------------- PALABRAS DISPONIBLES -------------------------");
//                      0 < 20
        for (int i = 0; i < SopaDeLetrasDiccionario.DICCIONARIO.length; i++) {
//                                                   6P               4                                                  6P                    4      
            if ((SopaDeLetrasDiccionario.DICCIONARIO[i].length() < matriz.length) && (SopaDeLetrasDiccionario.DICCIONARIO[i].length() < matriz[0].length)) {
                System.out.println("◘ Numero : " + i + " Palabra : " + SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase());
                //                                 0                                        6P
                contenedorPalabras[indice] = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase();
                indice++;
            }

            System.out.println("-----------------------------------------------");
            System.out.println(Arrays.toString(contenedorPalabras));
            System.out.println("-----------------------------------------------");
        }

        int numeroAleatorio = 0;
        int contador = 0;

        for (int i = 0; i < contenedorPalabras.length; i++) {
            if (contenedorPalabras[i] != null) {
                contador = i;
            }
        }

        for (int i = 0; i < contenedorPalabras.length; i++) {

            if (contenedorPalabras[i] == null) {

                numeroAleatorio = (int) (Math.random() * (0 + contador));
                int v1 = (int) (Math.random() * (0 + contador));

                contenedorPalabras[i] = contenedorPalabras[numeroAleatorio];

                if (contenedorPalabras[i] != contenedorPalabras[numeroAleatorio]) {
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio];
                } else {
                    contenedorPalabras[i] = contenedorPalabras[v1];
                }
                if (contenedorPalabras[i] == contenedorPalabras[numeroAleatorio]) {
                    contenedorPalabras[i] = contenedorPalabras[v1];
                } else {
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio];
                }
            }
        }
        return contenedorPalabras;
    }

    /**
     * Devuelve una "STRING" menor que la longitud de la fila y columna de la
     *
     * Objetivo : evitar que elija el mismo numero del dentro del array de
     * numeros
     *
     * @param palabra
     * @return
     */
    @Override
    public String getElegirPalabraSopaLetras() {
        int v1;
        int v2;
        int aux;
        numeros = new int[contenedorPalabras.length]; // Asigno la longitud del array que almacena los numeros

        int[] almacenarNumeros = new int[numeros.length];

        String palabraElegida = new String();

        System.out.println("• Longitud de la matriz : " + matriz.length); // f: 10 | c: 10
        System.out.println("•• Longitud contenedor palabras : " + contenedorPalabras.length); // 4
        System.out.println("----------------------------------");

        for (int contador = 0; contador < almacenarNumeros.length; contador++) {
            numeros[contador] = contador;
        }

        for (int f = 0; f < contenedorPalabras.length; f++) {

            System.out.println("♥♥ Palabra Elegida antes de entrar: " + contenedorPalabras[f]);

            if (((contenedorPalabras[f].length()) <= matriz.length) && (contenedorPalabras[f].length() <= matriz[0].length)) {

                System.out.println("♥♥Palabra Elegida despues de entrar: " + contenedorPalabras[f]);

                System.out.println("♠ Contenedor de palabras : " + Arrays.toString(contenedorPalabras));
                System.out.println("----------------------------------");

//                for (int i = 0; i < numeros.length; i++) {
//                    v1 = getStaticNumRandom(1, (contenedorPalabras.length - 1));
//                    v2 = getStaticNumRandom(1, (contenedorPalabras.length - 1));
//
//                    aux = numeros[v1];
//                    numeros[v1] = numeros[v2];
//                    numeros[v2] = aux;
//
//                    if (numeros[v1] != numeros[v2]) {
//                        almacenarNumeros[v1] = numeros[v1];
//                    }
//                }
                palabraElegida = contenedorPalabras[numeros[f]].toUpperCase();

                System.out.println("○○ Numero Elegido : " + numeros[f] + " - Palabra : " + palabraElegida);

                System.out.println("-----------------");
                System.out.println("-----------------");
                System.out.println(matriz.length);
                System.out.println(matriz[0].length);
                System.out.println("-----------------");
                System.out.println("-----------------");

                if ((palabraElegida.length() < matriz.length) && (palabraElegida.length() < matriz[0].length)) {
                    System.out.println("○○○ Palabra elegida : '" + palabraElegida + "' longitud : " + palabraElegida.length());
                }
            }
        }
        System.out.println("...........Numeros finales.............");
        System.out.println(Arrays.toString(numeros));
        System.out.println("..............................");
        return palabraElegida;
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
                System.out.println("♠ Nueva palabra : " + nuevaPalabra);
            } else {
                nuevaPalabra = null;
            }
        }
        return nuevaPalabra;
    }

    public static void main(String[] args) {
        T5xSopaDeLetrasFilasColumnas t = new T5xSopaDeLetrasFilasColumnas();
        T5xSopaDeLetrasCogeDatosTeclado c = new T5xSopaDeLetrasCogeDatosTeclado();
        T5xSopaDeLetrasPalabrasDentroSopa fps = new T5xSopaDeLetrasPalabrasDentroSopa();

//        t.getGenerarMatrizCaracterAleatorios(c.getNumero(), c.getNumero());
        t.getGenerarMatrizCaracterAleatorios(4, 4);
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

        System.out.println("͏ 1 Ver la palabra elegida : " + palabraElegida + " ͏");

        fps.setPalabrasHorizontalBasica(getMatrizChar(), palabraElegida, 0, 0);

        fps.setPalabrasVerticales(matriz, palabraElegida, 0, 0);

        t.verMatrizGenerada(getMatrizChar());

        t.getOtraPalabraSopaLetras(contenedorPalabras);

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j]);
//            }
//            System.out.println();
//        }
    }

}
