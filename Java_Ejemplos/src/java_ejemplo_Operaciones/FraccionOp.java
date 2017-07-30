/**
 * @created on : 30-jul-2017, 10:24:38
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class FraccionOp {

    private int num;
    private int den;

    /**
     * FraccionOpes
     */
    public FraccionOp() {
        num = 0;
        den = 1;
    }

    /**
     * 1º param x Numerador
     *
     * 2º param y Denominador
     *
     * @param x Numerador
     * @param y Denominador
     */
    public FraccionOp(int x, int y) {
        num = x;
        den = y;
    }

    /**
     * Sumar fracciones
     *
     * @param a
     * @param b
     * @return
     */
    public static FraccionOp sumar(FraccionOp a, FraccionOp b) {
        FraccionOp c = new FraccionOp();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static FraccionOp restar(FraccionOp a, FraccionOp b) {
        FraccionOp c = new FraccionOp();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static FraccionOp multiplicar(FraccionOp a, FraccionOp b) {
        return new FraccionOp(a.num * b.num, a.den * b.den);
    }

    public static FraccionOp inversa(FraccionOp a) {
        return new FraccionOp(a.den, a.num);
    }

    public static FraccionOp dividir(FraccionOp a, FraccionOp b) {
        return multiplicar(a, inversa(b));
    }

    private int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public FraccionOp simplificar() {
        int dividir = mcd();
        num /= dividir;
        den /= dividir;
        return this;
    }

    public String toString() {
        String texto = num + " / " + den;
        return texto;
    }

    public static void main(String[] args) {
        FraccionOp x = new FraccionOp(2, 3);
        FraccionOp y = new FraccionOp(4, 3);
        FraccionOp z = new FraccionOp(1, 2);
        System.out.println("x--> " + x);
        System.out.println("y--> " + y);
        System.out.println("z--> " + z);
        System.out.println("x+y= " + FraccionOp.sumar(x, y));
        System.out.println("x*y= " + FraccionOp.multiplicar(x, y));
//primero suma x e y y luego hace el producto con z
        FraccionOp resultado = FraccionOp.multiplicar(FraccionOp.sumar(x, y), z);
        System.out.println("(x+y)*z= " + resultado);
        System.out.println(resultado.simplificar());

//        try {
//espera la pulsación de una tecla y luego RETORNO
//            System.in.read();
//        } catch (Exception e) {
//            
//        }
    }
}
