package java_celia.Libro_t2objetos;

import java.io.*;
import static java.lang.System.out;

public class Leer_consola{

public static void main (String [] args){
	
	out.println("Leer desde teclado : ");
	String dato = null;
	dato = System.console().readLine();
	out.println("Letra leida : " + dato);
	
	}
}