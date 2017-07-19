/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T2_2Peso_main {

    static String unidad = null;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double valor = 0;

        try {
            out.println("Intro cantidad");
            valor = Double.parseDouble(br.readLine());

        } catch (IOException ex) {
            Logger.getLogger(T2_2Peso_main.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.println("Intro medida");

        Scanner sc = new Scanner(System.in);
        String medida = sc.nextLine();

        out.print("\nteclado : " + medida + " \n");

        if ("kg".equals(medida)) {
            out.print("Has elegido kilogramos ");
            unidad = "kg";
        }
        if ("lb".equals(medida)) {
            out.print("Has elegido libras ");
            unidad = "lb";
        }
        if ("oz".equals(medida)) {
            out.print("Has elegido onzas ");
            unidad = "oz";
        }

        T2_2Peso_condicional t22 = new T2_2Peso_condicional(valor, unidad);

        double gramos_peso = t22.getPeso();
        double gramos_libras = t22.getLibras();
        double gramos_onzas = t22.getOnzas();
        double gramos = t22.getGramos();

        System.out.println("\nValor en onzas : " + gramos_onzas);
        System.out.println("\nValor en libras : " + gramos_libras);
        System.out.println("\nValor en peso : " + gramos_peso);
        System.out.println("\nValor en gramos : " + gramos);

    }
}
