/**
 * @created on : 24-jul-2017, 12:02:02
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class Deviation {
// Beginning of method main

    public static void main(String[] args) {

        // Declare and create an array for 8 numbers
//        double[] numbers = {12, 6, 7, 3, 15, 10, 18, 5};
        // Declare and create an array for 10 numbers
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print numbers
        printArray(numbers);

        // Display mean and deviation
        System.out.println("The mean is " + findMean(numbers));
        System.out.println("The standard deviation is " + findDeviation(numbers));

    } // End of main

    /* Method for computing deviation of double values*/
    // Beginning of double findDeviation(double[])
    public static double findDeviation(double[] nums) {
        double mean = findMean(nums);
        double squareSum = 0;

        for (int i = 0; i < nums.length; i++) {
            squareSum += Math.pow(nums[i] - mean, 2);
        }

        return Math.sqrt((squareSum) / (nums.length - 1));
    } // End of double findDeviation(double[])

    /* Method for computing deviation of int values*/
    // Beginning of double findDeviation(int[])
    public static double findDeviation(int[] nums) {
        double mean = findMean(nums);
        double squareSum = 0;

        for (int i = 0; i < nums.length; i++) {
            squareSum += Math.pow(nums[i] - mean, 2);
        }

        return Math.sqrt((squareSum) / (nums.length - 1));
    } // End of double findDeviation(int[])

    /**
     * Method for computing mean of an array of double values
     */
    // Beginning of double findMean(double[])
    public static double findMean(double[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum / nums.length;
    } // End of double getMean(double[])

    /**
     * Method for computing mean of an array of int values
     */
    // Beginning of double findMean(int[])
    public static double findMean(int[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum / nums.length;
    } // End of double getMean(int[])

    /* Method for printing array */
    // Beginning of void printArray(double[])
    public static void printArray(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    } // End of void printArray(double[])

} // End of class Deviation
