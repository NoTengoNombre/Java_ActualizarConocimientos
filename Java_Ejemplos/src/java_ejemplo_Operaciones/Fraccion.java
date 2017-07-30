package java_ejemplo_Operaciones;


public class Fraccion {

    private int num;
    private int den;

    /**
     * Fracciones
     */
    public Fraccion() {
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
    public Fraccion(int x, int y) {
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
    public static Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static Fraccion restar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b) {
        return new Fraccion(a.num * b.num, a.den * b.den);
    }

    public static Fraccion inversa(Fraccion a) {
        return new Fraccion(a.den, a.num);
    }

    public static Fraccion dividir(Fraccion a, Fraccion b) {
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

    public Fraccion simplificar() {
        int dividir = mcd();
        num /= dividir;
        den /= dividir;
        return this;
    }

    @Override
    public String toString() {
        String texto = num + " / " + den;
        return texto;
    }

    public static void main(String[] args) {
        Fraccion x = new Fraccion(2, 3);
        Fraccion y = new Fraccion(4, 3);
        Fraccion z = new Fraccion(1, 2);
        System.out.println("x--> " + x);
        System.out.println("y--> " + y);
        System.out.println("z--> " + z);
        System.out.println("x+y= " + Fraccion.sumar(x, y));
        System.out.println("x*y= " + Fraccion.multiplicar(x, y));
//primero suma x e y y luego hace el producto con z
        Fraccion resultado = Fraccion.multiplicar(Fraccion.sumar(x, y), z);
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
