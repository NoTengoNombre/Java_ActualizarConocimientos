/**
 * @created on : 06-sep-2017, 13:10:26
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayIncrementarIndices2 {

//      a[i][0] = (int) (Math.random() * (1 + 9) + 1);
    public static void main(String[] args) {
        int x = 0;
        int[][] a = new int[3][3];
        System.out.println(a[0][0] += 0 + 1);
//                      0 < 3
        for (int i = 0; i < a.length; i++) {
            a[i][0] = i + 1;
//                1 = 0 + 1        
//                2 = 1 + 1        
//                3 = 2 + 1        
            x += a[i][0];
//     1 <- x = x + (1) <- a[1][0];
//     3 <- x = 1 + (2) <- a[2][0];
//     6 <- x = 3 + (3) <- a[3][0];
            System.out.println("!!! " + x);
//Po0         V1  |v1 = v1  
//Po1         Va3 |v2 + v1  
//Po2         V6  |v3 + va3 
        }
        System.out.println("------------------------");
        System.out.println("\u001B[33mValor Fila es : " + a[0][0]);
        System.out.println("\u001B[33mValor Fila es : " + a[1][0]);
        System.out.println("\u001B[33mValor Fila es : " + a[2][0]);
        System.out.println("------------------------");
        System.out.println("\u001B[33mx : " + x);

        System.out.println("------------------------");

        int[][] ab = new int[3][3];

        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                ab[i][j] += ab[i][j] + 1;
            }
        }

        System.out.println("\u001B[36mValor Columna es : " + ab[0][0]);
        System.out.println("\u001B[36mValor Columna es : " + ab[0][1]);
        System.out.println("\u001B[36mValor Columna es : " + ab[0][2]);
        System.out.println("------------------------");
        System.out.println("\u001B[36mValor Columna es : " + ab[1][0]);
        System.out.println("\u001B[36mValor Columna es : " + ab[1][1]);
        System.out.println("\u001B[36mValor Columna es : " + ab[1][2]);
        System.out.println("------------------------");
        System.out.println("\u001B[36mValor Columna es : " + ab[2][0]);
        System.out.println("\u001B[36mValor Columna es : " + ab[2][1]);
        System.out.println("\u001B[36mValor Columna es : " + ab[2][2]);
        System.out.println("------------------------");

    }
}
