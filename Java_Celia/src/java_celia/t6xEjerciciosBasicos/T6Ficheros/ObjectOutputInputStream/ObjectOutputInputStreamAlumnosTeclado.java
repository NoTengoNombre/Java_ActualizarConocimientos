/**
 * @created on : 28-sep-2017, 0:32:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ObjectOutputInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Necesita Serializacion
 *
 * @author Portatil_Bot
 */
public class ObjectOutputInputStreamAlumnosTeclado {

    public static void main(String[] args) {

        Alumnos2 alum = new Alumnos2();
        alum.escribirDatosAlumnosTeclado();
        alum.leerDatosAlumnosTeclado();
    }
}

class Alumnos2 implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nombres;
    private short edad;
    private int expediente;
    private int cantidad;

    private static File f;
    private static FileInputStream fi = null;
    private static FileOutputStream fo;
    private static ObjectInputStream ois = null;
    private static ObjectOutputStream oos;

    public Alumnos2() {
        this.nombres = null;
        this.edad = 0;
        this.expediente = 0;
    }

    public Alumnos2(String nombre, short edad, int expediente) {
        this.nombres = nombre;
        this.edad = edad;
        this.expediente = expediente;
    }

    public String getNombres() {
        return nombres;
    }

    public short getEdad() {
        return edad;
    }

    public int getExpediente() {
        return expediente;
    }

    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param nombre
     */
    public String setNombre() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce una nombre : ");
            nombres = bf.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombres;
    }

    /**
     *
     * @param edad
     */
    public short setEdad() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce una edad : ");
            edad = Short.parseShort(bf.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return edad;
    }

    /**
     *
     * @param expediente
     */
    public int setExpediente() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce un numero de expediente : ");
            expediente = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return expediente;
    }

    /**
     * Fijar cantidad
     */
    public int setCantidad() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce una cantidad : ");
            cantidad = Integer.parseInt(bf.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad;
    }

    /**
     *
     */
    public void mostrarDatos() {
        System.out.println("Mostrar datos"
                + "\n Nombre :"
                + setNombre() + " - Edad : "
                + setEdad() + " - Expediente : "
                + setExpediente());
    }

    /**
     *
     */
    public void escribirDatosAlumnosTeclado() {
        setCantidad();
        try {
            fo = new FileOutputStream("alumnos.txt");
            oos = new ObjectOutputStream(fo);

            for (int i = 0; i < getCantidad(); i++) {
                Alumnos2 alumnos = new Alumnos2(setNombre(), setEdad(), setExpediente());
                oos.writeObject(alumnos);
            }
            if (oos != null) {
                oos.close();
                fo.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n\u001b[32m Mensaje File : " + ex.getMessage() + " Error : " + ex.getLocalizedMessage());
        } catch (IOException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n\u001b[32m Mensaje IOE : " + ex.getMessage() + " Error : " + ex.getLocalizedMessage());
        }
    }

    public void leerDatosAlumnosTeclado() {
        try {
            f = new File("alumnos.txt");
            if (f.exists()) {
                fi = new FileInputStream(f);
                ois = new ObjectInputStream(fi);

                Alumnos2 alumn = null;

                while (fi.available() > 0) {
                    alumn = (Alumnos2) ois.readObject();
                    alumn.mostrar();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n\u001b[32m Mensaje IOE : " + ex.getMessage() + " Error : " + ex.getLocalizedMessage());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Alumnos2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n\u001b[32m Mensaje IOE : " + ex.getMessage() + " Error : " + ex.getLocalizedMessage());
        }
    }

    public void mostrar() {
        System.out.printf("Nombre : %4s - Edad : %4d - Expediente : %4d : \n ", getNombres(), getEdad(), getExpediente());
    }

}
