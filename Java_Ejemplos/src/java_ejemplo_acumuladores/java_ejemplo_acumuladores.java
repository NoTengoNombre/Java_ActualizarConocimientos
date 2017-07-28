/**
 * @created on : 27-jul-2017, 0:37:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_acumuladores;

public class java_ejemplo_acumuladores {

    public static void main(String[] args) {

        int a = 1;
//                 2   1   1 
        a += a; // a = a + a
        System.out.println("Valores: " + a);
        
        
        

        int acumuladores = 1;
        int acumuladores1 = 0;
        for (int i = 0; i < 4; i++) {
//                 1      =  1 + 0
//            acumuladores += acumuladores;
//                 0              0        + 1  
//                 3            1 + 1      + 1  
//                 7            3 + 3      + 1  
//                 13           6 + 6      + 1  
            acumuladores1 += acumuladores1 + 1;
//            System.out.println("• Valores acumuladores • : " + acumuladores);
            System.out.println("♦ Valores acumuladores1 ♦ : " + acumuladores1);
        }
        System.out.println("Total : " + acumuladores);
    }
}
