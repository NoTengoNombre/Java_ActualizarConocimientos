
import static java.lang.System.out;
import java.io.*;

public class Leer_numero_consola{
	
	public static void main(String [] args){
		
		out.println("Intro Nombre : ");
		String nombre = System.console().readLine();
		out.println("Intro edad : ");
	 	int edad = Integer.parseInt(System.console().readLine());
 		out.println("Hola  : " + nombre + " tienes " + edad + " anios ");
				
	}
}