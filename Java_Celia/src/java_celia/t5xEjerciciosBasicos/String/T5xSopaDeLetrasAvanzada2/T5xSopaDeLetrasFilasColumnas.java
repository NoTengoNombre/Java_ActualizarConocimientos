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
    /**
     * Almacena el numero de palabras que va a tener el contenedor de Palabras
     */
    private static int contador;
    private static int indicePalabras;
    private static int incrementaFila = 5;
    private static boolean stop = true;

    private static char[][] matriz;
    private static String[] contenedorPalabras;
    private static String palabraSeleccionada;

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
        for (fila = 0; fila < matriz.length; fila++) {
            for (col = 0; col < matriz[fila].length; col++) {
                System.out.print("| " + matriz[fila][col] + " |");
            }
            System.out.print("\n");
        }
    }

    /**
     * Le pasamos por parametro el numero de palabras que va a tener la matriz y
     * devuelve un array de String de palabras
     *
     * @param numerosPalabra - Introducir -> <b>getNumeroDePalabrasParaSopa</b>
     * @return
     */
//    public String[] getListaPalabrasParaSopaLetras(int numerosPalabra) {
    public void getListaPalabrasParaSopaLetras(int numerosPalabra) {
// Contador para quedarme con el numero de elementos sin null
// contenedor de palabras almacena el numero de palabras introducido por teclado
        contenedorPalabras = new String[numerosPalabra];
        System.out.println("\n--------------------- Palabras DISPONIBLES -------------------------");
//      Desde :      0  hasta 20 
        for (int i = 0; i < SopaDeLetrasDiccionario.DICCIONARIO.length; i++) {
//          SI: las palabras del diccionario son menores que la longitud y anchura de la Matriz 
            if ((SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= matriz.length) && (SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= matriz[0].length)) {
//              SI: incide es mejor que la longitud del contenedorPalabras 
                if (contador < contenedorPalabras.length) {
//                  Uso el contador para añadir esa palabra a la serie de contenedor Palabras
                    contenedorPalabras[contador] = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase(); // Ahora el contenedor de palabras tiene una nueva palabra
//                  Incremento el array de contenedorPalabras para que no supere la longitud de las palabras
                    contador++;
                }
            }
        }
    }

    public void setQuitarNulosListaPalabras() {
        int cantidadNoNull = 0;
        String[] palabraIntermedia;
//      Elimino los elementos nulos del array - Se usara para generar palabras aleatorias en el siguiente for
//      Desde :      0  hasta cantidad de palabras 
        for (int i = 0; i < contenedorPalabras.length; i++) {
            if (contenedorPalabras[i] != null) {
                cantidadNoNull = i;
            }
        }

        palabraIntermedia = new String[cantidadNoNull];

        for (int i = 0; i < palabraIntermedia.length; i++) {
            palabraIntermedia[i] = contenedorPalabras[i];
        }

//    Desde:     0  hasta cantidad de palabras  
        for (int i = 0; i < contenedorPalabras.length; i++) {
//          Si : contenedor Palabras tiene null
            if (contenedorPalabras[i] == null) {
//              Genero numero aleatorio con los numeros entre 0 y la cantidad de numero no nulos
//!! EL FOR ES EL QUE 
                for (int j = 0; j < palabraIntermedia.length; j++) {
//                    contenedorPalabras[i] = palabraIntermedia[(int) (Math.random() * (0 + cantidadNoNull))];
                    if (j % 2 == 0 && (i < contenedorPalabras.length)) {
                        contenedorPalabras[i] = palabraIntermedia[j];
                    }
                    if ((j % 2 != 0) && (i < contenedorPalabras.length - 1)) {
                        contenedorPalabras[i + 1] = palabraIntermedia[j];
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("◘ Nuevo Contenedor de Palabras : " + Arrays.toString(contenedorPalabras));
        System.out.println("");
    }

    /**
     * Devuelve una "STRING" menor que la longitud de la fila y columna del
     * array
     *
     * Objetivo : evitar que elija el mismo numero del dentro del array de
     * numeros
     *
     * @param palabra
     * @return
     */
    @Override
    public String getElegirPalabraSopaLetras() {
        //Creo un array con la longitud del contenedor de palabras almacenadas
        String palabraElegida = new String();
        System.out.println();
        System.out.println("┅┅┅┅┅ Palabras Menores que la longitud de la Matriz ┅┅┅┅┅");
//      Desde:                 0    <     4 
        for (int indice = 0; indice < contenedorPalabras.length; indice++) {
//          Si: La longitud de la palabra es menor que la longitud de la fila y que la longitud de la columna del array
            if (((contenedorPalabras[indice].length()) <= matriz.length) && (contenedorPalabras[indice].length() <= matriz[0].length)) {
                palabraElegida = contenedorPalabras[indice].toUpperCase();
            }
        }
        return palabraElegida;
    }

    /**
     * Tengo que crear un metodo que solo coja una palabra del array
     *
     * @return
     */
    public String getOtraPalabraSopaLetras(String[] contenedorPalabras) {
//        System.out.println();
//        System.out.println("---------- Palabras seleccionadas -------------");
//        System.out.println(Arrays.toString(contenedorPalabras));
//        System.out.println("-----------------------------------------------");
//        System.out.println();

        if (contenedorPalabras.length == 1) {
            palabraSeleccionada = contenedorPalabras[0];
        }

        if (contenedorPalabras.length == 2) {
            for (int indicebB = 0; indicebB < contenedorPalabras.length; indicebB++) {
                palabraSeleccionada = contenedorPalabras[(int) (Math.random() * (0 + contenedorPalabras.length))];
            }
        } else {
            if (indicePalabras < contenedorPalabras.length) {
                palabraSeleccionada = contenedorPalabras[indicePalabras];
                indicePalabras++;
            }
        }
        return palabraSeleccionada;
    }

    public static void setGenerarSopa() {
        T5xSopaDeLetrasFilasColumnas t = new T5xSopaDeLetrasFilasColumnas();
        T5xSopaDeLetrasCogeDatosTeclado c = new T5xSopaDeLetrasCogeDatosTeclado();
        t.getGenerarMatrizCaracterAleatorios(c.getNumeroFilas(), c.getNumeroCol());
        t.verFilasColum();
        t.getListaPalabrasParaSopaLetras(c.getNumeroDePalabrasParaSopa());
        t.setQuitarNulosListaPalabras();
    }

    public static void setPalabraSopaLetras() {
        T5xSopaDeLetrasFilasColumnas t = new T5xSopaDeLetrasFilasColumnas();
        T5xSopaDeLetrasMetodosFormaPalabras fps = new T5xSopaDeLetrasMetodosFormaPalabras();

        System.out.println("------------- SOPA DE LETRAS POR FILAS Y COLUMNAS -------------\n");
//            if ((contenedorPalabras.length > getNumeroFila()) && (contenedorPalabras.length > getNumeroColum())) {
        System.out.println("No se pueden mostrar mas palabras del diccionario : '" + contenedorPalabras.length + "' que filas : '" + getNumeroFila() + "' de la sopa de letras");
        fps.setPalabrasHorizontalA(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), 0, 0);
        System.out.println("\t\t\n-----------------------\n");
        t.verMatrizGenerada(getMatrizChar());
    }

    public static void setPalabraSopaLetrasV1() {
        boolean stopFor = true;
        T5xSopaDeLetrasFilasColumnas t = new T5xSopaDeLetrasFilasColumnas();
        T5xSopaDeLetrasMetodosFormaPalabras fps = new T5xSopaDeLetrasMetodosFormaPalabras();

//        String palabraElegida = t.getElegirPalabraSopaLetras();
        System.out.println("------------- SOPA DE LETRAS POR FILAS Y COLUMNAS -------------\n");
//        for (int j = 0; j < contenedorPalabras.length && stopFor == true; j++) {
////            if ((contenedorPalabras.length > getNumeroFila()) && (contenedorPalabras.length > getNumeroColum())) {
//                System.out.println("No se pueden mostrar mas palabras del diccionario : '" + contenedorPalabras.length + "' que filas : '" + getNumeroFila() + "' de la sopa de letras");
//                stopFor = false;
//            } else {
//                if (j < 4) {
//        System.out.println("♦ He entrado ♦ 1 ");
//        fps.setPalabrasHorizontalA(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), j, (incrementaFila + contenedorPalabras.length));
//                }
//                if (j == 1) {
//                    fps.setPalabrasInvertidas(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), j, 0);
//                }
//                if (j == 2) {
//                    fps.setPalabrasDiagonal(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), j, 0);
//                }
//                if (j == 3) {
//                    fps.setPalabrasVerticales(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), j, (getNumeroColum() / 2));
//                }
//                if (j > 4) {
//                    System.out.println("♦ He entrado ♦ 2 ");
//                    fps.setPalabrasHorizontalA(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), (int) (Math.random() * (incrementaFila + contenedorPalabras.length)), (int) (Math.random() * (incrementaFila + contenedorPalabras.length)));
//                    incrementaFila++;
//                }
//            fps.setPalabrasHorizontalA(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), 6, 0);
        System.out.println("♦♦♦ Numero aleatorio : " + (int) (Math.random() * (5 + contenedorPalabras.length)) + " ♦♦♦ ");
//            }
//        }

        System.out.println("\t\t\n-----------------------\n");
        t.verMatrizGenerada(getMatrizChar());
    }

    /**
     * Muestra la matriz completa con caracteres o sin ellos
     *
     * @param matriz
     */
    public static void setVerMatrizSopaLetras() {

        int incremento = 0;

        System.out.println("\n\t\u001b[33m ═ Filas : " + getNumeroFila() + " ║ Columnas : " + getNumeroColum());
        System.out.println("\t\u001b[32m ░ Sopa de letras generada ░ ");
        System.out.println("\nTotal de palabras elegidas : " + contenedorPalabras.length);

        for (int indice1 = 0; indice1 < getNumeroColum() * 5; indice1++) {
            System.out.print("_");
        }

        System.out.println("\t\n\n---- SOPA DE LETRAS DEPENDIENDO DEL NUMERO DE PALABRAS INTRODUCIDAS -----");
        for (int f = 0; f < getMatrizChar().length; f++) {
            while ((incremento < contenedorPalabras.length) && (stop == true)) {
                if (contenedorPalabras.length > getMatrizChar().length) {
                    System.out.println("\n El numero de palabras tiene que ser menor");
                    stop = false;
                } else {
                    System.out.print("\n " + incremento + " - " + contenedorPalabras[incremento] + "\t\t");
                    for (int c = 0; c < getMatrizChar()[f].length; c++) {
                        if ((f < getMatrizChar().length) && (contenedorPalabras.length < getNumeroFila() && contenedorPalabras.length < getNumeroColum())) {
                            System.out.print("|" + getMatrizChar()[incremento][c] + "|");
                        }
                    }
                    incremento++;
                }
            }
        }

        System.out.println("");
        for (int indice2 = 0; indice2 < getNumeroColum() * 5; indice2++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        setGenerarSopa();
        setPalabraSopaLetras();
        setVerMatrizSopaLetras();

    }
}
