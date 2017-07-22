/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

/**
 * Dibuja patrones con asteriscos utilizando bucles.
 *
 * (comenzamos con los comentarios en formato javadoc)
 *
 */
public class T3__12_Dibujando_rombo_profesor {

    /**
     * Dibuja con asteriscos un patrón con forma de triángulo
     *
     * @param offset - "DISTANCIA" - Sangría izquierda del triángulo
     * @param altura Altura del triángulo (en líneas de texto)
     */
    public void dibujarTriangulo(int offset, int altura) {

        int numAstericos = 1;
        int numEspacios = offset + (altura - 1);

        for (int i = 1; i <= altura; i++) {
            escribeCaracteres(' ', numEspacios);
            escribeCaracteres('*', numAstericos);
            System.out.println();
            numEspacios--;
            numAstericos = numAstericos + 2;
        }
    }

    /**
     * Dibuja con asteriscos un triangulo invertido
     *
     * @param offset Sangria izquierda del triangulo
     * @param altura Altura del triangulo (en lineas de texto)
     */
    public void dibujarTrianguloInvertido(int offset, int altura) {

        int numEspacios = offset;
        int numAsteriscos = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {
            escribeCaracteres(' ', numEspacios);
            escribeCaracteres('*', numAsteriscos);
            System.out.println();
            numEspacios++;
            numAsteriscos = numAsteriscos - 2;
        }
    }

    /**
     * Dibuja con asteriscos un patron con forma de rectangulo
     *
     * @param offset sangria izquierda del rectangulo
     * @param anchura anchura del rectangulo ( en lineas de texto)
     * @param altura altura del rectangulo ( en lineas de texto)
     */
    public void dibujaRectangulo(int offset, int anchura, int altura) {
        for (int i = 0; i < altura; i++) {
            escribeCaracteres(' ', offset);
            escribeCaracteres('*', anchura);
            System.out.println();
        }
    }

    /**
     * Dibuja con asteriscos un triangulo hueco
     *
     * @param offset Sangria izquierda del triangulo
     * @param altura Altura del triangulo (en lineas de texto)
     */
    public void dibujarTrianguloHueco(int offset, int altura) {

        int numEspacios = offset + altura; // 5 + 7  = 12
        int numEspaciosInternos = 1;

//        Dibuja la punta superior
        escribeCaracteres(' ', numEspacios);
        System.out.println("*");
        numEspacios--; // 11

//        Dibuja el resto del triángulo (menos la punta)
        for (int i = 0; i < altura; i++) {
            // Dibuja los espacios a la izquierda
            escribeCaracteres(' ', numEspacios); // 11
            // Escribe el asterisco izquierdo
            System.out.print("*");
            // Dibuja los espacios interiores del rombo
            escribeCaracteres(' ', numEspaciosInternos);
            // Escribe el asterisco derecho y el salto de línea
            System.out.println("*");
            // Actualiza los contadores
            numEspacios--;
            numEspaciosInternos = numEspaciosInternos + 2;
        }
    }

    /**
     * Dibuja con asteriscos un triangulo hueco invertido
     *
     * @param offset Sangria izquierda del triangulo
     * @param altura Altura del triangulo (en lineas de texto)
     */
    public void dibujarTrianguloHuecoInvertido(int offset, int altura) {
//      // Dibuja el triángulo (menos la punta)
        int numEspacios = offset;
        int numEspaciosInternos = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {
            // Dibuja los espacios a la izquierda
            escribeCaracteres(' ', numEspacios);
            // Escribe el asterisco izquierdo
            System.out.print("*");
            // Dibuja los espacios interiores del rombo
            escribeCaracteres(' ', numEspaciosInternos);
            // Escribe el asterisco derecho y el salto de línea
            System.out.println("*");
            // Actualiza los contadores
            numEspacios = numEspacios + 1;
            numEspaciosInternos = numEspaciosInternos - 2;
        }

        // Dibuja la punta inferior
        escribeCaracteres(' ', numEspacios);
        System.out.println("*");
    }

    /**
     * Dibuja con asteriscos un patrón con forma de rombo relleno
     *
     * @param offset Desplazamiento izquierdo (sangría) del rombo
     * @param altura Altura del rombo (en líneas de texto)
     */
    public void dibujaRombo(int offset, int altura) {
//        Primero dibujamos el triangulo superior
        dibujarTriangulo(offset, altura / 2 + 1);
//        Y ahora dibujamos el triangulo inferior
        dibujarTrianguloInvertido(offset + 1, altura / 2);
    }

    /**
     * Dibuja con asteriscos un patrón con forma de rombo hueco
     *
     * @param offset Desplazamiento izquierdo (sangría) del rombo
     * @param altura Altura del rombo (en líneas de texto)
     */
    public void dibujaRomboHueco(int offset, int altura) {
//      Primero dibujamos el triangulo
        dibujarTrianguloHueco(offset, altura / 2 + 1);
        // Y ahora dibujamos el triángulo inferior
        dibujarTrianguloHuecoInvertido(offset + 1, altura / 2);
    }

    /**
     * Escribe un caracter repetido varias veces
     *
     * @param caracter El carácter que va a imprimirse
     * @param repetir Numero de veces que el caracter debe imprimirse
     */
    private void escribeCaracteres(char caracter, int repetir) {
        for (int i = 0; i < repetir; i++) {
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) {

        T3__12_Dibujando_rombo_profesor a = new T3__12_Dibujando_rombo_profesor();

        // Este trozo de código dibuja los patrones
        // pedidos en el ejercicio
        System.out.println("Un triangulo : ");
        a.dibujarTriangulo(2, 5);

        System.out.println("-------------------");
        System.out.println("Un rombo relleno : ");
        a.dibujarTriangulo(2, 5);
        a.dibujarTrianguloInvertido(3, 4);

        System.out.println("-------------------");
        System.out.println("Otro rombo relleno");
        a.dibujaRombo(2, 10);

        System.out.println("-------------------");
        System.out.println("Otro rombo vacio");

        a.dibujarTrianguloHueco(2, 5);
        a.dibujarTrianguloHuecoInvertido(3, 4);

    }
}
