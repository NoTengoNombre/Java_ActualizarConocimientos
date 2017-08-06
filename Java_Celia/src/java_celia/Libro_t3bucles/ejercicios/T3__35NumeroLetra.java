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
    private static int cDMs1;
    private static int cMs;
    private static int cCs;
    private static int cDs;
    private static int cUs;
    
    public static void setDms1() {
    System.out.println("Introduce decenas de millares");
    cDMs1 = SCANNER.nextInt();
    if(cDMs1 < 0 || cDMs1 > 9){
        while(cDMs1 < 0 || cDMs1 > 9){
           System.out.println("Introduce decenas de millares entre 0 y 9 ");
           cDMs1 = SCANNER.nextInt();
    }
        if (cDMs1 == 1) {
            setMs();
        }
      }
    }
    
    public static void setMs() {
    System.out.println("♦ Introduce millares : ");
        cMs = SCANNER.nextInt();
        if (cMs < 0 || cMs > 9) {
            while(cMs < 0 || cMs > 9){
              System.out.println("Introduce millares entre 0 y 9 ");
              cMs = SCANNER.nextInt();
            }
        }
    System.out.println("♦ millares : " + cMs );
    }
    
    public static void setCs() {
    System.out.println("☻ Introduce centenas");
        cCs = SCANNER.nextInt();
        if (cCs < 0 || cCs > 9) {
            while(cCs < 0 || cCs > 9){
              System.out.println("☻ Introduce centenas entre 0 y 9 ");
              cCs = SCANNER.nextInt();
            }
        }
    System.out.println("☻ centenas : "+ cCs);
    }
    
    public static void setDs() {
    System.out.println("☺ Introduce decenas");
        cDs = SCANNER.nextInt();
        if (cDs < 0 || cDs > 9) {
            while(cDs < 0 || cDs > 9){
              System.out.println("☻ Introduce decenas entre 0 y 9 ");
              cDs = SCANNER.nextInt();
            }
        }
    System.out.println("☺ decenas : " + cDs);
    }
    
    public static void setUs() {
    System.out.println("♥ Introduce unidades");
        cUs = SCANNER.nextInt();
        if (cUs < 0 || cUs > 9) {
            while(cUs < 0 || cUs > 9){
            System.out.println("☻ Introduce unidades entre 0 y 9 ");
            cUs = SCANNER.nextInt();
            }
        }
    System.out.println("♥ unidades : " + cUs);
    }

    public static int getDms() {
        if (cDMs1 == 1) {
            if (cMs == 0) {
                System.out.println("• Diez ");                
            }else{
             switch(cMs){
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
        if (cDMs1 == 0) {
           getMs2();
        }else{
        if (cDMs1 == 2) {System.out.println("• Veinti");}
        if (cDMs1 == 3) {System.out.println("• Treinta");}
        if (cDMs1 == 4) {System.out.println("• Cuarenta");}
        if (cDMs1 == 5) {System.out.println("• Cincuenta");}
        if (cDMs1 == 6) {System.out.println("• Sesenta");}
        if (cDMs1 == 7) {System.out.println("• Setenta");}
        if (cDMs1 == 8) {System.out.println("• Ochenta");}
        if (cDMs1 == 9) {System.out.println("• Noventa");}
        }
        return cDMs1;
    }
    
       public static int getMs() {
           if (cDMs1 > 1) {
        if (cMs == 0) {System.out.println("♦ mil");}
        if (cMs == 1) {System.out.println("♦ y un mil");}
        if (cMs == 2) {System.out.println("♦ y dos mil");}
        if (cMs == 3) {System.out.println("♦ y tres mil");}
        if (cMs == 4) {System.out.println("♦ y cuatro mil");}
        if (cMs == 5) {System.out.println("♦ y cinco mil");}
        if (cMs == 6) {System.out.println("♦ y seis mil");}
        if (cMs == 7) {System.out.println("♦ y siete mil");}
        if (cMs == 8) {System.out.println("♦ y ocho mil");}
        if (cMs == 9) {System.out.println("♦ y nueve mil");}   
           }
       return cMs;
       }
       
       public static int getMs2() {
           if (cDMs1 > 1) {
        if (cMs == 1) {System.out.println("♦♦ mil");}
        if (cMs == 2) {System.out.println("♦♦ dos mil");}
        if (cMs == 3) {System.out.println("♦♦ tres mil");}
        if (cMs == 4) {System.out.println("♦♦ cuatro mil");}
        if (cMs == 5) {System.out.println("♦♦ cinco mil");}
        if (cMs == 6) {System.out.println("♦♦ seis mil");}
        if (cMs == 7) {System.out.println("♦♦ siete mil");}
        if (cMs == 8) {System.out.println("♦♦ ocho mil");}
        if (cMs == 9) {System.out.println("♦♦ nueve mil");}   
           }
       return cMs;
       }
     
    public static int getCs() {
        if (cCs == 1) {System.out.println("☻ cien");}
        if (cCs == 2) {System.out.println("☻ doscientos");}
        if (cCs == 3) {System.out.println("☻ trescientos");}
        if (cCs == 4) {System.out.println("☻ cuatrocientos");}
        if (cCs == 5) {System.out.println("☻ quinientos");}
        if (cCs == 6) {System.out.println("☻ seiscientos");}
        if (cCs == 7) {System.out.println("☻ setecientos");}
        if (cCs == 8) {System.out.println("☻ ochocientos");}
        if (cCs == 9) {System.out.println("☻ novencientos");}
        return cCs;
    }
    
    public static int getDs() {
        if (cDs == 1) {System.out.println("☺ diez y");}
        if (cDs == 2) {System.out.println("☺ veinte y");}
        if (cDs == 3) {System.out.println("☺ treinta y");}
        if (cDs == 4) {System.out.println("☺ cuarenta y");}
        if (cDs == 5) {System.out.println("☺ cincuenta y");}
        if (cDs == 6) {System.out.println("☺ sesenta y");}
        if (cDs == 7) {System.out.println("☺ setenta y");}
        if (cDs == 8) {System.out.println("☺ ochenta y");}
        if (cDs == 9) {System.out.println("☺ noventa y");}
        return cDs;
    }

    public static int getUs() {
        if (cUs == 1) {System.out.println("♥ uno");}
        if (cUs == 2) {System.out.println("♥ dos");}
        if (cUs == 3) {System.out.println("♥ tres");}
        if (cUs == 4) {System.out.println("♥ cuatro");}
        if (cUs == 5) {System.out.println("♥ cinco");}
        if (cUs == 6) {System.out.println("♥ seis");}
        if (cUs == 7) {System.out.println("♥ siete");}
        if (cUs == 8) {System.out.println("♥ ocho");}
        if (cUs == 9) {System.out.println("♥ nueve");}
        return cUs;
    }
    
    public static void setNumero() {
        setDms1();
        if (cDMs1 == 1 && (cMs > 0 || cMs >= 9)) {
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
        getDms();
        getMs();
        getCs();
        getDs();
        getUs();
        System.out.println("-------- \n Numero original : "+cDMs1 + cMs + cCs + cDs + cUs);
    }

    public static void main(String[] args) {
        setNumero();
        getNumero();

    }
}
