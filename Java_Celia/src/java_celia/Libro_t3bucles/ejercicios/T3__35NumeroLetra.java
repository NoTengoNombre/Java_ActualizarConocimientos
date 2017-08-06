/**
 * @created on : 05-ago-2017, 22:46:24
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__35NumeroLetra {

    private final static Scanner SCANNER = new Scanner(System.in);
    private static int dMs;
    private static int ms; // entre de 10.000 y 19.000
    private static int ms2; // mayor de 20.000
    private static int cs;
    private static int ds;
    private static int us;
    
    public static void setDms() {
    System.out.println("Introduce decenas de millares");
    dMs = SCANNER.nextInt();
    if(dMs < 0 || dMs > 9){
        while(dMs < 0 || dMs > 9){
           System.out.println("Introduce decenas de millares entre 0 y 9 ");
           dMs = SCANNER.nextInt();
            }
        if (dMs == 1 && ms >= 0) {
            setMs();  // entre de 10.000 y 19.000
        }
      }
    }
    
    public static int getDms() {
        if (dMs == 0) {
           getMs1();
        }
        if (dMs == 1) {
            if (ms == 0) {
                System.out.println("• Diez ");   
                getMs1();
                }
            }
        if (dMs == 1) {
                if (ms > 0) {
            switch(ms){
                case 1 : System.out.println("• Once ");break;
                case 2 : System.out.println("• Doce ");break;
                case 3 : System.out.println("• Trece ");break;
                case 4 : System.out.println("• Catorce ");break;
                case 5 : System.out.println("• Quince ");break;
                case 6 : System.out.println("• Dieciseis ");break;
                case 7 : System.out.println("• Diecisiete ");break;
                case 8 : System.out.println("• Dieciocho ");break;
                case 9 : System.out.println("• Diecinueve ");break;
                    }
                }
            }
            if (dMs == 2) {System.out.println("• Veinti");}
            if (dMs == 3) {System.out.println("• Treinta");}
            if (dMs == 4) {System.out.println("• Cuarenta");}
            if (dMs == 5) {System.out.println("• Cincuenta");}
            if (dMs == 6) {System.out.println("• Sesenta");}
            if (dMs == 7) {System.out.println("• Setenta");}
            if (dMs == 8) {System.out.println("• Ochenta");}
            if (dMs == 9) {System.out.println("• Noventa");}
        return dMs;
    }
    
     public static int getMs1() {
           if (dMs == 0) {
        if (ms == 1) {System.out.println("♦♦ mil");}
        if (ms == 2) {System.out.println("♦♦ dos mil");}
        if (ms == 3) {System.out.println("♦♦ tres mil");}
        if (ms == 4) {System.out.println("♦♦ cuatro mil");}
        if (ms == 5) {System.out.println("♦♦ cinco mil");}
        if (ms == 6) {System.out.println("♦♦ seis mil");}
        if (ms == 7) {System.out.println("♦♦ siete mil");}
        if (ms == 8) {System.out.println("♦♦ ocho mil");}
        if (ms == 9) {System.out.println("♦♦ nueve mil");}   
           }
       return ms;
       }
    
       public static int getMs2() {
           if (dMs == 1 ) {
        if (ms >= 0) {System.out.println("♦ mil");}
           }
           if (dMs > 1 ) {
        if (ms == 0) {System.out.println("♦ mil");}
        if (ms == 1) {System.out.println("♦ y un mil");}
        if (ms == 2) {System.out.println("♦ y dos mil");}
        if (ms == 3) {System.out.println("♦ y tres mil");}
        if (ms == 4) {System.out.println("♦ y cuatro mil");}
        if (ms == 5) {System.out.println("♦ y cinco mil");}
        if (ms == 6) {System.out.println("♦ y seis mil");}
        if (ms == 7) {System.out.println("♦ y siete mil");}
        if (ms == 8) {System.out.println("♦ y ocho mil");}
        if (ms == 9) {System.out.println("♦ y nueve mil");}   
           }
       return ms;
       }
     
    public static int getCs() {
        if (cs == 1) {System.out.println("☻ cien");}
        if (cs == 2) {System.out.println("☻ doscientos");}
        if (cs == 3) {System.out.println("☻ trescientos");}
        if (cs == 4) {System.out.println("☻ cuatrocientos");}
        if (cs == 5) {System.out.println("☻ quinientos");}
        if (cs == 6) {System.out.println("☻ seiscientos");}
        if (cs == 7) {System.out.println("☻ setecientos");}
        if (cs == 8) {System.out.println("☻ ochocientos");}
        if (cs == 9) {System.out.println("☻ novencientos");}
        return cs;
    }
    
    public static int getDs() {
        if (ds == 1) {System.out.println("☺ diez y");}
        if (ds == 2) {System.out.println("☺ veinte y");}
        if (ds == 3) {System.out.println("☺ treinta y");}
        if (ds == 4) {System.out.println("☺ cuarenta y");}
        if (ds == 5) {System.out.println("☺ cincuenta y");}
        if (ds == 6) {System.out.println("☺ sesenta y");}
        if (ds == 7) {System.out.println("☺ setenta y");}
        if (ds == 8) {System.out.println("☺ ochenta y");}
        if (ds == 9) {System.out.println("☺ noventa y");}
        return ds;
    }

    public static int getUs() {
        if (us == 1) {System.out.println("♥ uno");}
        if (us == 2) {System.out.println("♥ dos");}
        if (us == 3) {System.out.println("♥ tres");}
        if (us == 4) {System.out.println("♥ cuatro");}
        if (us == 5) {System.out.println("♥ cinco");}
        if (us == 6) {System.out.println("♥ seis");}
        if (us == 7) {System.out.println("♥ siete");}
        if (us == 8) {System.out.println("♥ ocho");}
        if (us == 9) {System.out.println("♥ nueve");}
        return us;
    }
    
    public static void setNumero() {
        setDms();
        if (dMs == 1 && (ms > 0 || ms >= 9)) {
        setCs();
        setDs();
        setUs();
        }else{
        setMs();
        setCs();
        setDs();
        setUs();
        }
    }
    
    public static void getNumero() {
        System.out.println("----------");
        getDms();
        getMs2();
        getCs();
        getDs();
        getUs();
        System.out.println("-------- \n Numero original : "+dMs + ms + cs + ds + us);
    }
    
    public static void main(String[] args) {
        setNumero();
        getNumero();
    }
    
    public static void setCs() {
    System.out.println("☻ Introduce centenas");
        cs = SCANNER.nextInt();
        if (cs < 0 || cs > 9) {
            while(cs < 0 || cs > 9){
              System.out.println("☻ Introduce centenas entre 0 y 9 ");
              cs = SCANNER.nextInt();
            }
        }
    System.out.println("☻ centenas : "+ cs);
    }
    
    public static void setDs() {
    System.out.println("☺ Introduce decenas");
        ds = SCANNER.nextInt();
        if (ds < 0 || ds > 9) {
            while(ds < 0 || ds > 9){
              System.out.println("☻ Introduce decenas entre 0 y 9 ");
              ds = SCANNER.nextInt();
            }
        }
    System.out.println("☺ decenas : " + ds);
    }
    
    public static void setUs() {
    System.out.println("♥ Introduce unidades");
        us = SCANNER.nextInt();
        if (us < 0 || us > 9) {
            while(us < 0 || us > 9){
            System.out.println("☻ Introduce unidades entre 0 y 9 ");
            us = SCANNER.nextInt();
            }
        }
    System.out.println("♥ unidades : " + us);
    }

    //    entre de 10.000 y 19.000
    public static void setMs() {
    System.out.println("♦ Introduce millares : ");
        ms = SCANNER.nextInt();
        if (ms < 0 || ms > 9) {
            while(ms < 0 || ms > 9){
              System.out.println("Introduce millares entre 0 y 9 ");
              ms = SCANNER.nextInt();
            }
        }
    System.out.println("♦ millares : " + ms );
    }
    
//    mayor de 20.000
    public static void setMs2() {
    System.out.println("♦ Introduce millares : ");
        ms2 = SCANNER.nextInt();
        if (ms2 < 0 || ms2 > 9) {
            while(ms2 < 0 || ms2 > 9){
              System.out.println("Introduce millares entre 0 y 9 ");
              ms2 = SCANNER.nextInt();
            }
        }
    System.out.println("♦ millares : " + ms2 );
    }
    
}
