/**
 * @created on : 18-sep-2017, 0:31:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada;

import java.util.Scanner;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetraMatriz;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetraNumerosAleatorios;
import java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces.SopaDeLetrasDiccionario;

class GenerarMatrices implements SopaDeLetraMatriz, SopaDeLetraNumerosAleatorios {

    private static char[][] matriz;
    private static char[] caracteres;
    private static char[] palabraTroceada;
    private static String[] verPalabras;
    private static int totalPalabras;
    private static String cadena;
    private int fila;
    private int col;

    /**
     * Devuelve las filas
     *
     * @return
     */
    public int getNumeroFila() {
        return this.fila;
    }

    /**
     * Devuelve las col
     *
     * @return
     */
    public int getNumeroColum() {
        return this.col;
    }

    /**
     * Elige un numero entre los rangos minimo y maximo
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
     * @param cadenaParam
     * @return
     */
    public char[] getConvertirStringArrayDeChar(String cadenaParam) {
        cadena = cadenaParam;
        caracteres = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = cadena.charAt(i);
        }
        return caracteres;
    }

    /**
     * Coge un numero por teclado
     *
     * @param numero
     * @return
     */
    public int getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("✤ Introduce las ║ columnas entre los numeros '3' y '20' ✤ ");
        col = sc.nextInt();
        if (col < 2 || col > 20) {
            while (col < 2 || col > 20) {
                System.out.println("✤ Por favor : Introduce un numero entre 3 y 20");
                col = sc.nextInt();
            }
        }
        return col;
    }

    /**
     * Elegir Numero Entre 1 y 2
     *
     * @return
     */
    public int getElegirNumeroEntre1y2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("▶ Pulsa 0 para salir ▶");
        int teclado = sc.nextInt();
        if (teclado == 0) {
            teclado = 0;
        } else {
            if (teclado < 1 || teclado > 2) {
                while (teclado < 1 || teclado > 2) {
                    System.out.println("▶ Por favor : Introduce 1 para elegir - Cuadrado  ▇ ");
                    System.out.println("▶ Por favor : Introduce 2 para elegir - Rectangulo ▀▀ ");
                    teclado = sc.nextInt();
                }
            }
        }
        if (teclado == 1) {
            System.out.println("▶ La forma elegida es el cuadrado : ▇ ");
        }
        if (teclado == 2) {
            System.out.println("▶ La forma elegida es el Rectangulo : ▀▀ ");
        }
        return teclado;
    }

    /**
     * Muestra la matriz completa con caracteres o sin ellos
     *
     * @param matriz
     */
    public void setVerMatrizSopaLetras(char[][] matriz) {
        CapturaTeclado ct = new CapturaTeclado();
        int incremento = 0;
        int incrementoPalabra = 1;
        System.out.println("\n\t\u001b[33m ═ Filas : " + totalPalabras + " ║ Columnas : " + getNumeroColum());
        System.out.println("\t\u001b[32m ░ Sopa de letras generada ░ ");
        System.out.println("\nTotal de palabras elegidas : " + verPalabras.length);
        for (int indice1 = 0; indice1 < getNumeroColum() * 9; indice1++) {
            System.out.print("_");
        }
        for (fila = 0; fila < matriz.length; fila++) {
            while (incremento < verPalabras.length) {
                System.out.print("\n " + (incrementoPalabra++) + " - " + verPalabras[incremento] + "\t\t");
                for (int columnas = 0; columnas < matriz[fila].length; columnas++) {
                    System.out.print("| " + (matriz[fila][columnas] = ct.getGeneraLetraAleatoria()) + " |");
                }
                incremento++;
            }
        }
        System.out.println();
        for (int i = 0; i < getNumeroColum() * 5; i++) {
            System.out.print("▔");
        }
        System.out.println();
    }

    /**
     * A - Tamaño de la sopa de letras a generar y la llena de caracteres
     *
     * @param fila
     * @param col
     * @return Matriz llena de caracteres
     */
    @Override
    public char[][] getGenerarMatrizCaracterAleatorios(int fila, int col) {
        CapturaTeclado ct = new CapturaTeclado();
        matriz = new char[fila][col];
        for (fila = 0; fila < matriz.length; fila++) {
            for (col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = ct.getGeneraLetraAleatoria();
            }
        }
        return matriz;
    }

    /**
     *
     * @return
     */
    public char[][] setFormaDefinidasSopaDeLetras(int f, int c) {
        System.out.println("♠ Elige la forma de la sopa de letras : 1 - Cuadrada : 2 - Rectangular");
        int x = getElegirNumeroEntre1y2();
        switch (x) {
            case 0:
                System.out.println("♠ Sin forma elegida : ");
                break;
            case 1:
                System.out.println("♠ Forma elegida Cuadrada ");
                break;
            case 2:
                System.out.println("♠ Forma elegida Rectangular ");
                break;
            default:
                break;
        }
        if (x == 1) {
            matriz = getGenerarMatrizCaracterAleatorios(f, c);
        }
        if (x == 2) {
            matriz = getGenerarMatrizCaracterAleatorios((f), (f) * 2);
        }
        return matriz;
    }

    /**
     * Fija un numero que sera el rango de palabras que tendra el array de
     * DICCIONARIO de palabra de la sopa
     *
     * @param numero
     * @return
     */
    public static int getNumeroDePalabrasParaSopa() {
        Scanner sc = new Scanner(System.in);
        int longitud = SopaDeLetrasDiccionario.DICCIONARIO.length;
        System.out.println("▯ Introduce un numero para elegir cuantas palabras quieres mostrar en la sopa de letras : ");
        System.out.println("-------------------------------------------------------------------------------------------");
        totalPalabras = sc.nextInt();
        System.out.println("▯ Numero elegido : " + totalPalabras);
        if (totalPalabras < 1 || totalPalabras >= longitud) {
            while (totalPalabras <= 1 || totalPalabras > longitud) {
                System.out.println("▯ Por favor : Introduce un numero entre 1 y " + longitud);
                totalPalabras = sc.nextInt();
            }
        }
        return totalPalabras;
    }

    /**
     * Le pasamos por parametro el numero de palabras que va a tener la matriz
     *
     * @param numeroPalabra - Introducir -> <b>getNumeroDePalabrasParaSopa</b>
     * @return
     */
    public String[] getListaPalabrasParaSopaLetras(int numeroPalabra) {
        verPalabras = new String[numeroPalabra];
        for (int i = 0; i < numeroPalabra; i++) {
            verPalabras[i] = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase();
            System.out.println("Numero : " + (i + 1) + " - palabra : " + verPalabras[i]);
            System.out.println("-----------------------------------------------");
        }
        return verPalabras;
    }

    /**
     * Devuelve una "STRING" menor que la longitud del "ARRAY" pasado por
     * parametro
     *
     * @param longitudArray
     * @return
     */
    @Override
    public String getElegirPalabraSopaLetras(int longitudArray) {
        int x;
        boolean stop = true;
        String palabra = null;
        for (int i = 0; i < SopaDeLetrasDiccionario.DICCIONARIO.length; i++) {
            if (SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= longitudArray) {
                while (stop != false) {
                    x = getNumRandom(1, (SopaDeLetrasDiccionario.DICCIONARIO.length - 1));
                    palabra = SopaDeLetrasDiccionario.DICCIONARIO[x].toUpperCase();
                    System.out.println("Palabra elegida : " + palabra + " longitud : " + palabra.length());
                    System.out.println("--------------------------------------");
                    if (palabra.length() < (matriz.length) && (palabra.length() < matriz[0].length)) {
                        stop = false;
                    }
                }
            }
        }
        return palabra;
    }

    /**
     * Controlar la 'f' y 'c' por parametros para evitar meter palabras que no
     * encajen en la sopa de letras y también evitar solaparse la palabra
     * elegida con otras pala6bras que hayan dentro
     *
     * Funciona perfectamente
     *
     * @param matriz
     */
    public char[][] setPalabrasVerticales(char[][] matriz, String palabra, int paramFila, int paramColumna) {
        GenerarMatrices gm = new GenerarMatrices();

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if ((paramFila > (matriz.length - palabraTroceada.length)) || (matriz.length < palabraTroceada.length) || (paramColumna > matriz[0].length - 1)) {
            int indice = 0;
            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras(matriz.length));

            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if ((f == f) && (c == paramColumna)) {
                        if ((indice < palabra.length()) && (f <= palabra.length())) {
                            matriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
                    }
                }
            }
        } else {
            int indice = 0;
            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if ((f == f) && (c == paramColumna)) {
                        if (indice < palabra.length() && (f <= palabra.length())) {
                            matriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
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
    public char[][] setPalabrasHorizontal(char[][] matriz, String palabra, int paramFila, int paramColumna) {
        GenerarMatrices gm = new GenerarMatrices();

        char[] palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if ((paramColumna > (matriz[0].length - palabraTroceada.length)) || (paramFila > matriz.length)) {
            int indice = 0;
            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras(matriz.length));
            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if (f == paramFila) {
                        if ((indice < palabra.length()) && (indice < matriz[f].length)) {
                            matriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
                    }
                }
            }
        } else {
            int indice = 0;
            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if (f == paramFila) {
                        if ((indice < palabra.length()) && (indice < matriz[f].length)) {
                            matriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
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
     * @param paramFila
     * @param paramColumna
     * @return
     */
    public char[][] setPalabrasInvertidas(char[][] matriz, String palabra, int paramFila, int paramColumna) {
        CapturaTeclado ct = new CapturaTeclado();
        GenerarMatrices gm = new GenerarMatrices();

        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);

        if (paramColumna > ((matriz[0].length + 1) - palabra.length()) || (paramColumna == 0) || ((paramFila > matriz.length) || (paramFila < 1))) {
            int indice = 0;
            palabraTroceada = ct.getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras(matriz.length));
            for (int f = matriz.length - paramFila; f < matriz.length; f++) {
                for (int c = (matriz[f].length - paramColumna); c >= 0; c--) {
                    if (indice < palabra.length() && (indice <= matriz[f].length)) {
                        matriz[f][c] = palabraTroceada[indice];
                        indice++;
                    }
                }
            }
        } else {
            int indice = 0;
            for (int f = matriz.length - paramFila; f < matriz.length; f++) {
                for (int c = (matriz[f].length - paramColumna); c >= 0; c--) {
                    if (indice < palabra.length() && (indice <= matriz[f].length)) {
                        matriz[f][c] = palabraTroceada[indice];
                        indice++;
                    }
                }
            }
        }
        return matriz;
    }

    /**
     * Genera un STRING con las palabras de forma diagonal
     *
     * @param args
     */
    public char[][] setPalabrasDiagonal(char[][] matriz, String palabra, int paramFila, int paramColumna) {
        CapturaTeclado ct = new CapturaTeclado();
        GenerarMatrices gm = new GenerarMatrices();

        char[] palabraTroceada = ct.getConvertirStringArrayDeChar(palabra);

        int columna = matriz[0].length;
        int fila = matriz.length;

        if ((paramFila > (fila - (palabraTroceada.length))) || (paramColumna >= (columna - palabraTroceada.length))) {
            int indice = 0;

            palabraTroceada = ct.getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras(matriz.length));

            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if ((f == paramFila) && (f + paramColumna == c)) {
                        if ((indice < palabra.length()) && (indice < palabraTroceada.length)) {
                            matriz[f][c] = palabraTroceada[indice];
//                            System.out.println("Entra A " + matriz[f][c]);
                            indice++;
                        }
                    }
                }
            }
        } else {
            int indice = 0;
            for (int f = paramFila; f < matriz.length; f++) {
                for (int c = paramColumna; c < matriz[f].length; c++) {
                    if ((f == f) && (f + paramColumna == c)) {
                        if ((indice < palabra.length()) && (indice < matriz[f].length)) {
                            matriz[f][c] = palabraTroceada[indice];
//                            System.out.println("Entra B " + matriz[f][c]);
                            indice++;
                        }
                    }
                }
            }
        }
        return matriz;
    }

    public static void setLanzarPrograma() {
        GenerarMatrices gm = new GenerarMatrices();
        System.out.println("✩ Elige el tamaño de la sopa de letras ✩ ");
        gm.getListaPalabrasParaSopaLetras(getNumeroDePalabrasParaSopa());
        gm.getGenerarMatrizCaracterAleatorios(1, gm.getNumero());
        gm.setFormaDefinidasSopaDeLetras(gm.getNumeroFila(), gm.getNumeroColum());
        gm.setVerMatrizSopaLetras(matriz);
    }

    public static void main(String[] args) {
        GenerarMatrices gm = new GenerarMatrices();
//        matriz = gm.setPalabrasInvertidas(matriz, "CERDO", 2, 1);
//        matriz = gm.setPalabrasInvertidas(matriz, "ZORRO", 1, 1);
//        matriz = gm.setPalabrasVerticales(matriz, gm.getElegirPalabra(matriz.length), 0, 0);
//        matriz = gm.setPalabrasHorizontal(matriz, gm.getElegirPalabra(matriz.length), 3, 4);
//        matriz = gm.setPalabrasDiagonal(matriz, gm.getElegirPalabraSopaLetras(matriz.length), 0, 0);
//        matriz = gm.setPalabrasVerticales(matriz, "GATO", 0, 0);
//        matriz = gm.setPalabrasHorizontal(matriz, "PERRO", 2, 5);
//        matriz = gm.setPalabrasDiagonal(matriz, "CUERVO", 1, 0);

        setLanzarPrograma();
        gm.setPalabrasHorizontal(matriz, verPalabras[0], 5, 5);

//        String[] palabras = gm.getCuantasPalabrasParaSopaLetras(10);
//        for (String indices : palabras) {
//            System.out.println(indices);
//        }
    }
}
