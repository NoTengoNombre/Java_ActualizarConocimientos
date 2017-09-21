/**
 * @created on : 18-sep-2017, 9:27:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

public class T5xSopaDeLetrasPalabrasDentroSopaCopiaS {

    private static char[] palabraTroceada;

    /**
     * Devuelve un array de caracteres de un String
     *
     * @param paramPalabra
     * @return
     */
    public char[] getConvertirStringArrayDeChar(String paramPalabra) {
        char[] caracteres = new char[paramPalabra.length()];
        for (int i = 0; i < paramPalabra.length(); i++) {
            caracteres[i] = paramPalabra.charAt(i);
            System.out.println("Ø Caracteres : " + caracteres[i]);
        }
        return caracteres;
    }

    /**
     * Crear un metodo basico de palabras horizontales
     *
     * @param paramMatriz
     * @param palabra
     * @param paramFila
     * @param paramColumna
     * @return
     */
    public char[][] setPalabrasHorizontalBasica(char[][] paramMatriz, String palabra, int paramFila, int paramColumna) {

        T5xSopaDeLetrasFilasColumnas gm = new T5xSopaDeLetrasFilasColumnas();

        System.out.println("• PALABRA ELEGIDA : " + palabra + " • ");

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if ((paramColumna > (paramMatriz[0].length - palabraTroceada.length)) || (paramFila > paramMatriz.length)) {
            int indice = 0;

            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras());

            for (int f = paramFila; f < paramMatriz.length; f++) {
                for (int c = paramColumna; c < paramMatriz[f].length; c++) {
                    if (f == paramFila) {
                        if ((indice < palabra.length()) && (indice < paramMatriz[f].length)) {
                            paramMatriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
                    }
                }
            }
        } else {
            int indice = 0;
            for (int f = paramFila; f < paramMatriz.length; f++) {
                for (int c = paramColumna; c < paramMatriz[f].length; c++) {
                    if (f == paramFila) {
                        if ((indice < palabra.length()) && (indice < paramMatriz[f].length)) {
                            paramMatriz[f][c] = palabraTroceada[indice];
                            indice++;
                        }
                    }
                }
            }
        }
        return paramMatriz;
    }

    /**
     * Controlar la 'f' y 'c' por parametros para evitar meter palabras que no
     * encajen en la sopa de letras y también evitar solaparse la palabra
     * elegida con otras pala6bras que hayan dentro
     *
     * Funciona perfectamente
     *
     * @param matriz
     * @param palabra
     * @param paramFila
     * @param paramColumna
     * @return
     */
    public char[][] setPalabrasVerticales(char[][] matriz, String palabra, int paramFila, int paramColumna) {

        T5xSopaDeLetrasFilasColumnas gm = new T5xSopaDeLetrasFilasColumnas();

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if ((paramFila > (matriz.length - palabraTroceada.length)) || (matriz.length < palabraTroceada.length) || (paramColumna > matriz[0].length - 1)) {
            int indice = 0;
            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras());

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
     * @param matriz
     * @param paramFila
     * @param paramColumna
     * @param palabra
     * @return
     */
    public char[][] setPalabrasHorizontal(char[][] matriz, String palabra, int paramFila, int paramColumna) {

        T5xSopaDeLetrasFilasColumnas gm = new T5xSopaDeLetrasFilasColumnas();

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if ((paramColumna > (matriz[0].length - palabraTroceada.length)) || (paramFila > matriz.length)) {
            int indice = 0;
            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras());
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
        T5xSopaDeLetrasFilasColumnas gm = new T5xSopaDeLetrasFilasColumnas();

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        if (paramColumna > ((matriz[0].length + 1) - palabra.length()) || (paramColumna == 0) || ((paramFila > matriz.length) || (paramFila < 1))) {
            int indice = 0;
            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras());
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
     * @param matriz
     * @param palabra
     * @param paramFila
     * @param paramColumna
     * @return
     */
    public char[][] setPalabrasDiagonal(char[][] matriz, String palabra, int paramFila, int paramColumna) {
        T5xSopaDeLetrasFilasColumnas gm = new T5xSopaDeLetrasFilasColumnas();

        palabraTroceada = getConvertirStringArrayDeChar(palabra);

        int columna = matriz[0].length;
        int fila = matriz.length;

        if ((paramFila > (fila - (palabraTroceada.length))) || (paramColumna >= (columna - palabraTroceada.length))) {
            int indice = 0;

            palabraTroceada = getConvertirStringArrayDeChar(gm.getElegirPalabraSopaLetras());

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

}

//    public String getElegirPalabraSopaLetrasCopiaAntigua() {
//        boolean stopWhile = true;
//        String palabraElegida = new String();
//        int numGenerado;
//        System.out.println("• Valor del Indice : " + indice);
//        int[] numAlmacenado = new int[10];
//        
//        numAlmacenado = new int[contenedorPalabras.length]; // Asigno la longitud del array que almacena los numeros
////                      0
//        for (int i = indice; i < contenedorPalabras.length; i++) {
//
//            if ((contenedorPalabras[i].length() <= matriz.length) && (contenedorPalabras[i].length() <= matriz[0].length)) {
//
//                while (stopWhile != false) {
////                   0,1,2,3
//                    numGenerado = getStaticNumRandom(1, (contenedorPalabras.length - 1));
//
//                    System.out.println("○ Numero Generado : " + numGenerado);
//
//                    for (int j = 0; j < numAlmacenado.length; j++) {
//                        if (numGenerado == numAlmacenado[j]) {
//                            while (numGenerado != numAlmacenado[j]) {
//                                numGenerado = getStaticNumRandom(1, (contenedorPalabras.length - 1));
//                                numAlmacenado[j] = numGenerado;
//                            }
//                        } else {
//                            numAlmacenado[i] = numGenerado;
//                        }
//                    }
//
//                    palabraElegida = contenedorPalabras[numAlmacenado[i]].toUpperCase();
//
//                    System.out.println("○○ Numero Elegido : " + numAlmacenado[i] + " - Palabra : " + palabraElegida);
//
//                    if ((palabraElegida.length() <= matriz.length) && (palabraElegida.length() <= matriz[0].length)) {
//                        stopWhile = false;
//                        System.out.println("○○○ Palabra elegida : '" + palabraElegida + "' longitud : " + palabraElegida.length() + " ○ ");
//                    }
//                }
//            }
//        }
//        System.out.println("..............................");
//        System.out.println(Arrays.toString(numAlmacenado));
//        System.out.println("..............................");
//        indice++;
//
//        return palabraElegida;
//    }

