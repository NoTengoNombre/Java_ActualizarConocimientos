package java_ejemplo_Math;

public class Fraccion2 {

    public static void main(String[] args) {

        int num = 6;
        int dem2 = 2;

        int dem = 4;
        int num2 = 1;

        double numerador = (num * dem2) - (dem * num2);
        double denominador = (dem * dem2);

        System.out.println("NUM: " + numerador);
        System.out.println("DEN: " + denominador);

        double total = numerador / denominador;
        System.out.println("Total : " + total);

        double total_restar = restar_fracciones(num, dem, num2, dem2);
        System.out.println("Total restar : " + total_restar);

    }

    public static double restar_fracciones(double num, double dem, double num2, double dem2) {
        double numerador = (num * dem2) - (dem * num2);
        double denominador = (dem * dem2);

        System.out.println("NUM: " + numerador);
        System.out.println("DEN: " + denominador);

        double total = numerador / denominador;
        return total;
    }
}
