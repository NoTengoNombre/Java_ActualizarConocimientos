/**
 * @created on : 28-sep-2017, 13:08:37
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t6xEjerciciosBasicos.T6Ficheros.ObjectOutputInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectInputOutputStreamAlumnosArray implements java.io.Serializable {

    /**
     * ARREGLAR EL PROBLEMA DE PORQUE NO SE VE LOS DATOS EN EL FICHERO
     */
    private static final long serialVersionUID = 1L;

//  Atributos De Instancia : Siempre habra una copia diferente por cada objeto para la clase
    private String nombres;
    private short edades;
    private int expedientes;

//  Atributos De Clase : Siempre habra una copia para toda la clase
    private static File f;
    private static FileInputStream fi = null;
    private static FileOutputStream fo;
    private static ObjectInputStream ois = null;
    private static ObjectOutputStream oos;

    public ObjectInputOutputStreamAlumnosArray() {
        this.nombres = null;
        this.edades = 0;
        this.expedientes = 0;
    }

    public ObjectInputOutputStreamAlumnosArray(String nombreParam, short edadParam, int expedienteParam) {
        this.nombres = nombreParam;
        this.edades = edadParam;
        this.expedientes = expedienteParam;
    }

    public String getNombres() {
        return nombres;
    }

    public short getEdad() {
        return edades;
    }

    public int getExpediente() {
        return expedientes;
    }

    /**
     *
     */
    public void escribirDatosAlumnosArray() {
        String[] nombresLocales = {"PepeA", "PepaB", "PepiC", "PepoD"};
        short[] edadLocales = {15, 20, 25, 30};
        int[] expedienteLocales = {111, 222, 333, 444};

        try {
            fo = new FileOutputStream("alumnos4.txt");
            oos = new ObjectOutputStream(fo);

            for (int i = 0; i < nombresLocales.length; i++) {
                ObjectInputOutputStreamAlumnosArray alum = new ObjectInputOutputStreamAlumnosArray(nombresLocales[i], edadLocales[i], expedienteLocales[i]);
                oos.writeObject(alum);
            }
            if (oos != null) {
                oos.close();
                fo.close();
            }
        } catch (IOException ex) {
            System.out.println("IO Message : " + ex.getMessage() + " - LocalizedMessage : " + ex.getLocalizedMessage());
        }
    }

    public void leerDatosAlumnosArray() {
        try {
            f = new File("alumnos4.txt");
            if (f.exists()) {
                fi = new FileInputStream(f);
                ois = new ObjectInputStream(fi);

                ObjectInputOutputStreamAlumnosArray alum = null;

                while (fi.available() > 0) {
                    alum = (ObjectInputOutputStreamAlumnosArray) ois.readObject();
                    alum.mostrar();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectInputOutputStreamAlumnosArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ObjectInputOutputStreamAlumnosArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrar() {
        System.out.printf("Nombre : %4s - Edad : %4d - Expediente : %4d : \n", getNombres(), getEdad(), getExpediente());
    }

    public static void main(String[] args) {

        ObjectInputOutputStreamAlumnosArray a = new ObjectInputOutputStreamAlumnosArray();
        a.escribirDatosAlumnosArray();
        a.leerDatosAlumnosArray();
    }
}
