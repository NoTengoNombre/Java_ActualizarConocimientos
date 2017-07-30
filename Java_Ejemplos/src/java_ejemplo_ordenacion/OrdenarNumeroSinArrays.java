/**
 * @created on : 29-jul-2017, 13:45:02
 * @see
 * https://stackoverflow.com/questions/22720895/sorting-a-numbers-digits-without-using-an-array#22722142
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_ordenacion;

public class OrdenarNumeroSinArrays {

    public static int getDescendent() {
        int number = 925637327;
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--) {
            int tmpNumber = number;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        System.out.println(sortedNumber);
        return sortedNumber;
    }

    public static int getDescendentParam(int n) {
        int number = n;
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--) {
            int tmpNumber = number;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        System.out.println(sortedNumber);
        return sortedNumber;
    }

    public static void main(String[] args) {

        getDescendent();
    }
}
