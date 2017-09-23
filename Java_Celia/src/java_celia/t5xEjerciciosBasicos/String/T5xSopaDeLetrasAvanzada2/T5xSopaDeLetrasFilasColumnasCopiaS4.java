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

class T5xSopaDeLetrasFilasColumnasCopiaS4 implements SopaDeLetraMatriz2, SopaDeLetraNumerosAleatorios {

    private static int fila;
    private static int col;
    /**
     * Almacena el numero de palabras que va a tener el contenedor de Palabras
     */
    private static int contador;

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
                System.out.print(matriz[fila][col]);
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
        int cantidadNoNull = 0;
        int numeroAleatorio1;
// contenedor de palabras almacena el numero de palabras introducido por teclado
        contenedorPalabras = new String[numerosPalabra];
        System.out.println("------------------- PALABRAS DISPONIBLES -------------------------");
//      Desde :      0  hasta 20 
        for (int i = 0; i < SopaDeLetrasDiccionario.DICCIONARIO.length; i++) {
//          SI: las palabras del diccionario son menores que la longitud y anchura de la Matriz 
            if ((SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= matriz.length) && (SopaDeLetrasDiccionario.DICCIONARIO[i].length() <= matriz[0].length)) {
                System.out.println("◘ Numero : " + i + " Palabra seleccionada : " + SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase());
//              SI: incide es mejor que la longitud del contenedorPalabras 
                if (contador < contenedorPalabras.length) {
//                  Uso el contador para añadir esa palabra a la serie de contenedor Palabras
                    contenedorPalabras[contador] = SopaDeLetrasDiccionario.DICCIONARIO[i].toUpperCase(); // Ahora el contenedor de palabras tiene una nueva palabra
//                  Incremento el array de contenedorPalabras para que no supere la longitud de las palabras
                    contador++;
                }
            }
        }
        System.out.println("◘ ◘ La cantidad del contenedor de palabras es de  : " + contenedorPalabras.length);

//      Elimino los elementos nulos del array - Se usara para generar palabras aleatorias en el siguiente for
//      Desde :      0  hasta cantidad de palabras 
        for (int i = 0; i < contenedorPalabras.length; i++) {
            if (contenedorPalabras[i] != null) {
                cantidadNoNull = i;
            }
        }
//      Desde        0  hasta cantidad de palabras  
        for (int i = 0; i < contenedorPalabras.length; i++) {
//          Si : contenedor Palabras tiene null
            if (contenedorPalabras[i] == null) {
//              Genero numero aleatorio con los numeros entre 0 y la cantidad de numero no nulos
                numeroAleatorio1 = (int) (Math.random() * (0 + cantidadNoNull));
//              Genero numero aleatorio con los numeros entre 0 y la cantidad de numero no nulos
                int numeroAleatorio2 = (int) (Math.random() * (0 + cantidadNoNull));
//              En la posicion null añado el numero aleatorio
                contenedorPalabras[i] = contenedorPalabras[numeroAleatorio1];
//              Si : la palabra es distinta a una palabra cogida de forma aleatoria
                if (contenedorPalabras[i] != contenedorPalabras[numeroAleatorio1]) {
//                   le añado a la palabra un numero aleatorio 
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio1];
                } else {
//                   le añado a la palabra un numero aleatorio 
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio2];
                }
//              Si : la palabra es igual a una palabra cogida de forma aleatoria
                if (contenedorPalabras[i] == contenedorPalabras[numeroAleatorio1]) {
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio2];
                } else {
                    contenedorPalabras[i] = contenedorPalabras[numeroAleatorio1];
                }
            }
        }
        System.out.println("");
        System.out.println("◘ ◘ ◘ Array con las palabras generadas : " + Arrays.toString(contenedorPalabras));
        System.out.println("");
//        return contenedorPalabras;
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
        System.out.println("• Longitud de la matriz : " + matriz.length); // f: 10 | c: 10
        System.out.println("•• Longitud contenedor palabras : " + contenedorPalabras.length); // 4
        System.out.println("------------- Palabras Menores que la longitud de la Matriz ------------------");
//      Desde:                 0    <     4 
        for (int indice = 0; indice < contenedorPalabras.length; indice++) {
//          Si: La longitud de la palabra es menor que la longitud de la fila y que la longitud de la columna del array
            if (((contenedorPalabras[indice].length()) <= matriz.length) && (contenedorPalabras[indice].length() <= matriz[0].length)) {
                System.out.println("○ Posicion de la palabra : " + indice + " - Palabra : " + palabraElegida + " longitud : " + palabraElegida.length());
//              palabra elegida en mayuscula                      
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

        System.out.println(".............. Palabras seleccionadas .............");
        System.out.println(Arrays.toString(contenedorPalabras));
        System.out.println("............................................");

        if (contenedorPalabras.length == 1) {
            palabraSeleccionada = contenedorPalabras[0];
        }

        if (contenedorPalabras.length == 2) {
            for (int indicebB = 0; indicebB < contenedorPalabras.length; indicebB++) {
                palabraSeleccionada = contenedorPalabras[(int) (Math.random() * (0 + contenedorPalabras.length))];
            }
        } else {
            palabraSeleccionada = contenedorPalabras[(int) (Math.random() * (0 + (contenedorPalabras.length)))];
        }
        return palabraSeleccionada;
    }

    public static void setGenerarSopa() {
        T5xSopaDeLetrasFilasColumnasCopiaS4 t = new T5xSopaDeLetrasFilasColumnasCopiaS4();
        T5xSopaDeLetrasCogeDatosTeclado c = new T5xSopaDeLetrasCogeDatosTeclado();
        T5xSopaDeLetrasMetodosFormaPalabras fps = new T5xSopaDeLetrasMetodosFormaPalabras();

        t.getGenerarMatrizCaracterAleatorios(c.getNumeroFilas(), c.getNumeroCol());
        t.verFilasColum();
        t.getListaPalabrasParaSopaLetras(c.getNumeroDePalabrasParaSopa());

        String palabraElegida = t.getElegirPalabraSopaLetras();

        for (int i = 0; i < contenedorPalabras.length; i++) {
            System.out.println("͏ " + i + " Ver la palabra elegida : " + palabraElegida);
            fps.setPalabrasHorizontalA(getMatrizChar(), t.getOtraPalabraSopaLetras(contenedorPalabras), i, 0);
        }

        System.out.println();
        t.verMatrizGenerada(getMatrizChar());

    }

    public static void setVerMatrizSopaLetras(char[][] matriz) {
        T5xSopaDeLetrasFilasColumnasCopiaS4 t = new T5xSopaDeLetrasFilasColumnasCopiaS4();
        T5xSopaDeLetrasCogeDatosTeclado c = new T5xSopaDeLetrasCogeDatosTeclado();
        T5xSopaDeLetrasMetodosFormaPalabras fps = new T5xSopaDeLetrasMetodosFormaPalabras();

        int incrementoPalabra = 1;
        int incremento = 0;

        t.getGenerarMatrizCaracterAleatorios(c.getNumeroFilas(), c.getNumeroCol());
        t.verFilasColum();
        t.getListaPalabrasParaSopaLetras(c.getNumeroDePalabrasParaSopa());

        String palabraElegida = t.getElegirPalabraSopaLetras();

        System.out.println("\n\t\u001b[33m ═ Filas : " + getNumeroFila() + " ║ Columnas : " + getNumeroColum());
        System.out.println("\t\u001b[32m ░ Sopa de letras generada ░ ");
        System.out.println("\nTotal de palabras elegidas : " + contenedorPalabras.length);

        for (int indice1 = 0; indice1 < getNumeroColum() * 9; indice1++) {
            System.out.print("_");
        }

        for (fila = 0; fila < matriz.length; fila++) {
            while (incremento < contenedorPalabras.length) {
                incrementoPalabra++;
                System.out.print("\n " + (incrementoPalabra) + " - " + contenedorPalabras[incremento] + "\t\t");
                for (int columnas = 0; columnas < matriz[fila].length; columnas++) {
                    fps.setPalabrasHorizontalA(matriz, t.getOtraPalabraSopaLetras(contenedorPalabras), fila, 0);
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

    public static void main(String[] args) {

        setGenerarSopa();

    }
}
