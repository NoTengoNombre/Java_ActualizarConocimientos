/**
 * @created on : 05-sep-2017, 20:30:05
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

/**
 * 
 * 2 clases Estudiante y BaileNavidad
 * 
 * 4 metodos clase BaileNavidad
 * 
 * 
 * Esta clase asigna aleatoriamente parejas de baile para las 3 escuelas de
 * magia de Harry Potter y el cáliz de fuego.
 *
 * Se supone que hay un numero igual de estudiantes en cada escuela y que las
 * parejas tienen que ser de estudiantes de diferentes escuelas
 *
 * @author Portatil_Bot
 */
public class T5x13ParejasDeBaileProfesor {

}

/**
 * Clase principal donde se declaran todos los Objetos/Arrays de la aplicacion
 * 
 * @author Portatil_Bot
 */
class BaileNavidad {
//    Lista de estudiantes de cada Colegio
    /** * Array Objetos clase Estudiante hogwarts : Cada posicion habra un objeto */
    static Estudiante[] hogwarts;
    /** * Array Objetos clase Estudiante beauxbatons : Cada posicion habra un objeto */
    static Estudiante[] beauxbatons;
    /** * Array Objetos clase Estudiante durmstrang : Cada posicion habra un objeto */
    static Estudiante[] durmstrang;
    
    /** * Array int [] : Almacena lista de estudiantes seleccionados para el baile en cada escuela */
    static int[] seleccionadosHogwarts;
    /** * Array int [] : Almacena lista de estudiantes seleccionados para el baile en cada escuela */
    static int[] seleccionadosBeauxbatons;
    /** * Array int [] : Almacena lista de estudiantes seleccionados para el baile en cada escuela */
    static int[] seleccionadosDurmstrang;
    
//    Numero estudiantes en cada escuela
    static final int NUM_ESTUDIANTES = 20;
//    Numero total de parejas de baile = 20 parejas
    static final int NUM_PAREJAS = (NUM_ESTUDIANTES + NUM_ESTUDIANTES) / 2;

    /**
     * Crea las listas de estudiantes de cada escuela y a partir de ellas , las
     * parejas de baile , mostrando el resultado por ¿ Consola ?
     *
     * @param args Argumentos de la línea de comandos (sin uso)
     */
    public static void main(String[] args) {
        crearListasEstudiantes();
        Estudiante[][] listasParejas = crearListaParejas();
        mostrar(listasParejas);
    }

    /**
     * Creamos un metodo static que tiene un array Bidimensional 'filas'
     * 'columnas' de objetos de la clase Estudiante.
     *
     * Crea aleatoriamente las parejas de baile como un array bidimensional.
     *
     * La columna [0] chicos
     *
     * La columna [1] chicas
     *
     * @return
     */
    public static Estudiante[][] crearListaParejas() {
        System.out.println("Numero Parejas : "+NUM_PAREJAS);
        
//  Creamos la lista de parejas Bidimensional        Filas       Columnas
        Estudiante[][] listaParejas = new Estudiante[NUM_PAREJAS][2];
        
//Creamos 2 objetos sin apuntar a ninguna direccion de memoria
        Estudiante chico = null;
        Estudiante chica = null;

//Objeto String almacena el 1º colegio      
        String colegio = "Hogwarts"; // Valor inicial para el colegio

//Rellenamos la lista con estudiantes elegidos al azar - NUM_PAREJAS = 20
        for (int i = 0; i < NUM_PAREJAS; i++) {
//Seleccionamos al chico : Apuntamos chico a una direccion de memoria
            chico = seleccionarEstudiante(colegio, 'H');
//Cambiamos de colegio , para que las parejas sean de estudiantes de colegios distintos
            if (colegio.equals("Hogwarts")) {
                colegio = "Durmstrang";
            }else if(colegio.equals("Durmstrang")){
                colegio = "Beauxbatons";
            }else{
                colegio = "Hogwarts";
            }
//            --------------------------------
//            Con Switch
//            switch (colegio) {
//                case "Hogwarts":
//                    colegio = "Durmstrang";
//                    break;
//                case "Durmstrang":
//                    colegio = "Beauxbatons";
//                    break;
//                default:
//                    colegio = "Hogwarts";
//                    break;
//            }
//            --------------------------------
//          Seleccionamos a la chica
            chica = seleccionarEstudiante(colegio, 'M');
//Cambiamos de colegio , para que las parejas sean de estudiantes de colegios distintos
            if (colegio.equals("Hogwarts")) {
                colegio = "Durmstrang";
            }else if(colegio.equals("Durmstrang")){
                colegio = "Beauxbatons";
            }else{
                colegio = "Hogwarts";
            }
            
//Asignamos al chico y a la chica a las lista de parejas
//               FILAS[1a20]
//                 COLUMNAS[0a1]  
            listaParejas[i][0] = chico;
            listaParejas[i][1] = chica;
        }
        return listaParejas;
    }

    /**
     * Metodo que devuelve un objeto de tipo Estudiante con 2 atributos
     * definidos por la propia clase
     *
     * Selecciona al azar un estudiante de la lista de estudiantes especificada
     * y con el sexo indicado
     *
     *
     * @param colegio del estudiante
     * @param sexo del estudiante
     * @return estudiante seleccionado
     */
    public static Estudiante seleccionarEstudiante(String colegio, char sexo) {
        boolean correcto;
        int n; // almacena num aleatorio
        Estudiante estudiante = null;
        
        do {
            correcto = true; //Para romper el bucle
//            Elegimos (1 a 20) estudiante al azar
            n = (int) (NUM_ESTUDIANTES * Math.random());
            
//String colegio 'pasado por parametro' elegimos el alumno 
            if (colegio.equals("Hogwarts")) {
//Comprobamos si : el sexo del estudiante 'n' es el adecuado y "si no esta ya seleccionado"
//Objeto "arrays" hogwarts[] invoca al metodo de la clase Estudiante
                if (hogwarts[n].getSexo() != sexo || seleccionadosHogwarts[n] == 1) {
                    correcto = false; // Rompe bucle: Estudiante 'NO' esta seleccionado o sexo 'no adecuado'
                } else {
//El estudiante 'n' es valido 
//Lo guardamos en la variable 'objeto' estudiante y lo marcamos como ya SELECCIONADO
                    estudiante = hogwarts[n];
                    seleccionadosHogwarts[n] = 1; // MARCAMOS ESTUDIANTE
                }
            }

            if (colegio.equals("Beauxbatons")) {
//                Comprobamos si el sexo del estudiante 'n' es el adecuado y si no esta ya seleccionado
                if (beauxbatons[n].getSexo() != sexo || seleccionadosBeauxbatons[n] == 1) {
                    correcto = false;
                } else {
//El estudiante 'n' es valido 
//Lo guardamos en la variable 'objeto' estudiante y lo marcamos como ya SELECCIONADO
                    estudiante = beauxbatons[n];
                    seleccionadosBeauxbatons[n] = 1;
                }
            }

            if (colegio.equals("Durmstrang")) {
//                Comprobamos si el sexo del estudiante 'n' es el adecuado y si no esta ya seleccionado
                if (durmstrang[n].getSexo() != sexo || seleccionadosDurmstrang[n] == 1) {
                    correcto = false;
                } else {
//El estudiante 'n' es valido 
//Lo guardamos en la variable 'objeto' estudiante y lo marcamos como ya SELECCIONADO
                    estudiante = durmstrang[n];
                    seleccionadosDurmstrang[n] = 1;
                }
            }
        } while (!correcto);
// Devuelve un objeto array de tipo Estudiante 
        return estudiante;
    }
    
    /**
     * Crea las listas de estudiantes de cada colegio
     * Este metodo debería tomar los datos de un fichero o de una BD
     * 
     */
    public static void crearListasEstudiantes(){
//        Creamos los arrays de estudiantes
          hogwarts = new Estudiante[NUM_ESTUDIANTES];
          beauxbatons = new Estudiante[NUM_ESTUDIANTES];
          durmstrang = new Estudiante[NUM_ESTUDIANTES];
          
//        Creamos los arrays de estudiantes seleccionados para el baile
          seleccionadosHogwarts = new int[NUM_ESTUDIANTES];
          seleccionadosBeauxbatons = new int[NUM_ESTUDIANTES];
          seleccionadosDurmstrang = new int[NUM_ESTUDIANTES];
          
//Creamos los estudiantes 
//(Esta informacion puede obtenerse de un fichero o de una base de datos )
//        Chicos
        hogwarts[0] = new Estudiante("Harry Pollas", 'H', "Hogwarts");
        hogwarts[1] = new Estudiante("Ron Weasley", 'H', "Hogwarts");
        hogwarts[2] = new Estudiante("Leville Longbottom", 'H', "Hogwarts");
        hogwarts[3] = new Estudiante("Fred Weasley", 'H', "Hogwarts");
        hogwarts[4] = new Estudiante("George Weasley", 'H', "Hogwarts");
        hogwarts[5] = new Estudiante("Draco Malfoy", 'H', "Hogwarts");
        hogwarts[6] = new Estudiante("Seamus Finnigan", 'H', "Hogwarts");
        hogwarts[7] = new Estudiante("Dean Thomas", 'H', "Hogwarts");
        hogwarts[8] = new Estudiante("Lee Jordan", 'H', "Hogwarts");
        hogwarts[9] = new Estudiante("Cedric Diggory", 'H', "Hogwarts");
//        Chicas
        hogwarts[10] = new Estudiante("Hermione Granger", 'M', "Hogwarts");
        hogwarts[11] = new Estudiante("Ginny Weasley", 'M', "Hogwarts");
        hogwarts[12] = new Estudiante("Luna Lovegood", 'M', "Hogwarts");
        hogwarts[13] = new Estudiante("Lavender Brown", 'M', "Hogwarts");
        hogwarts[14] = new Estudiante("Parvati Patil", 'M', "Hogwarts");
        hogwarts[15] = new Estudiante("Hanna Abbot", 'M', "Hogwarts");
        hogwarts[16] = new Estudiante("Angelina Johnson", 'M', "Hogwarts");
        hogwarts[17] = new Estudiante("Pansy Parkinson", 'M', "Hogwarts");
        hogwarts[18] = new Estudiante("Katie Bell", 'M', "Hogwarts");
        hogwarts[19] = new Estudiante("Cho Chang", 'M', "Hogwarts");
//        Chicos
        beauxbatons[0] = new Estudiante("Damien Bordeau", 'H', "Beauxbatons");
        beauxbatons[1] = new Estudiante("Didier Girardon", 'H', "Beauxbatons");
        beauxbatons[2] = new Estudiante("Edouard Pinaud", 'H', "Beauxbatons");
        beauxbatons[3] = new Estudiante("Fabien Rousseau", 'H', "Beauxbatons");
        beauxbatons[4] = new Estudiante("François Eluchans", 'H', "Beauxbatons");
        beauxbatons[5] = new Estudiante("Gabriel Lombard", 'H', "Beauxbatons");
        beauxbatons[6] = new Estudiante("Gaston Abbadie", 'H', "Beauxbatons");
        beauxbatons[7] = new Estudiante("Adolphe Barraud", 'H', "Beauxbatons");
        beauxbatons[8] = new Estudiante("Bastian Briand", 'H', "Beauxbatons");
        beauxbatons[9] = new Estudiante("Colin Camus", 'H', "Beauxbatons");
//        Chicas
        beauxbatons[10] = new Estudiante("Fleur Delacour", 'M', "Beauxbatons");
        beauxbatons[11] = new Estudiante("Catherine Leduc", 'M', "Beauxbatons");
        beauxbatons[12] = new Estudiante("Audrey Vien", 'M', "Beauxbatons");
        beauxbatons[13] = new Estudiante("Bérénice Dugès", 'M', "Beauxbatons");
        beauxbatons[14] = new Estudiante("Laure Champollion", 'M', "Beauxbatons");
        beauxbatons[15] = new Estudiante("Léonore Chifflet", 'M', "Beauxbatons");
        beauxbatons[16] = new Estudiante("Lucette Toussaint", 'M', "Beauxbatons");
        beauxbatons[17] = new Estudiante("Magadlène Lemond", 'M', "Beauxbatons");
        beauxbatons[18] = new Estudiante("Nélie Levallois", 'M', "Beauxbatons");
        beauxbatons[19] = new Estudiante("Nicole Fontaine", 'M', "Beauxbatons");
//        Chicos
        durmstrang[0] = new Estudiante("Viktor Krum", 'H', "Durmstrang");
        durmstrang[1] = new Estudiante("Andrei Boyanov", 'H', "Durmstrang");
        durmstrang[2] = new Estudiante("Anton Chilikov", 'H', "Durmstrang");
        durmstrang[3] = new Estudiante("Boris Andreev", 'H', "Durmstrang");
        durmstrang[4] = new Estudiante("Damyan Mihov", 'H', "Durmstrang");
        durmstrang[5] = new Estudiante("Dragomir Nikolaev", 'H', "Durmstrang");
        durmstrang[6] = new Estudiante("Emil Petrov", 'H', "Durmstrang");
        durmstrang[7] = new Estudiante("Georgi Maksimov", 'H', "Durmstrang");
        durmstrang[8] = new Estudiante("Milen Ivov", 'H', "Durmstrang");
        durmstrang[9] = new Estudiante("Pavel Kaloyanchev", 'H', "Durmstrang");
//        Chicas
        durmstrang[10] = new Estudiante("Anka Lazarov", 'M', "Durmstrang");
        durmstrang[11] = new Estudiante("Dana Marinov", 'M', "Durmstrang");
        durmstrang[12] = new Estudiante("Donka Minkov", 'M', "Durmstrang");
        durmstrang[13] = new Estudiante("Emiliya Hristov", 'M', "Durmstrang");
        durmstrang[14] = new Estudiante("Irina Vanev", 'M', "Durmstrang");
        durmstrang[15] = new Estudiante("Ivana Viktorov", 'M', "Durmstrang");
        durmstrang[16] = new Estudiante("Katerina Vasilev", 'M', "Durmstrang");
        durmstrang[17] = new Estudiante("Nevelka Popov", 'M', "Durmstrang");
        durmstrang[18] = new Estudiante("Nikol Zahariev", 'M', "Durmstrang");
        durmstrang[19] = new Estudiante("Olga Vodenicharov", 'M', "Durmstrang");
        
//        Inicializamos a 0 las listas de estudiantes seleccionados para el baile
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            seleccionadosHogwarts[i] = 0;
            seleccionadosBeauxbatons[i] = 0;
            seleccionadosDurmstrang[i] = 0;
        }
          
    }
    
    /**
     * Muestra la lista de parejas de baile por consola
     * @param listaParejas Array Bidimensional con la lista de parejas
     */
    public static void mostrar(Estudiante[][] listaParejas){
        for (int i = 0; i < NUM_PAREJAS; i++) {
            System.out.printf("Pareja %2d: %s (%s)(%c) - %s (%s)(%c)\n" , i + 1,
//                            F1-20 C
                    listaParejas[i][0].getNombre(),listaParejas[i][0].getColegio(),listaParejas[i][0].getSexo(),
//                            F1-20 C
                    listaParejas[i][1].getNombre(),listaParejas[i][1].getColegio(),listaParejas[i][1].getSexo());
        }
    }
}

/**
 * Clase basica donde estan todos los atributos / metodos de los Alumnos
 * genericos
 *
 * @author Portatil_Bot
 */
class Estudiante {

    /** * Atributo nombre */
    private String nombre;
    /** * Atributo sexo */
    private char sexo;
    /** * Atributo colegio */
    private String colegio;

    /**
     * Constructor basico 
     * 
     * Genera un objeto con los valores asignado en los parametros
     * 
     * @param nombre
     * @param sexo
     * @param colegio 
     */
    public Estudiante(String nombre, char sexo, String colegio) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.colegio = colegio;
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Fija el nombre por parametro
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el sexo
     * @return sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Fija el char sexo 
     * @param sexo 
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Devuelve el objeto colegio
     * @return 
     */
    public String getColegio() {
        return colegio;
    }

    /**
     * Fija el objeto colegio
     * @param colegio 
     */
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
}