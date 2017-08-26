/**
 * @created on : 25-ago-2017, 0:49:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.Profesor.HerenciaGeometrica;

public class TestFigura {

    public static void main(String[] args) {
        Figura fig1, fig2;
        Circulo circulo1, circulo2;
        Rectangulo rect1, rect2;
        Cuadrado cuadrado1, cuadrado2;

//        Creamos una figura con cada constructor
//        y llammamos a toString()
        fig1 = new Figura();
        System.out.println(fig1.toString());

        circulo1 = new Circulo();
        System.out.println(circulo1.toString());

        rect1 = new Rectangulo();
        System.out.println(rect1.toString());

        cuadrado1 = new Cuadrado();
        System.out.println(cuadrado1.toString());

        System.out.println("\n\n\n");

//        Probamos algunos metodos sobre los objetos anteriores
//        y volvemos a llamar a toString() para comprobar que 
//        los atributos han cambiado como se esperaba
        fig1.setColor("white");
        System.out.println(fig1.toString());

        circulo1.setRadio(2.5);
        System.out.println("El area del circulo es : " + circulo1.getArea());
        System.out.println(circulo1.toString());

        rect1.setAlto(3.0);
        System.out.println("El perimetro del rectangulo es : " + rect1.getPerimetro());
        System.out.println(rect1.toString());

        cuadrado1.setAncho(5.1);
        System.out.println("La base del cuadrado es " + cuadrado1.getAlto() + " y su altura es " + cuadrado1.getAncho());
        System.out.println("El area del cuadrado es " + cuadrado1.getArea());
        System.out.println(cuadrado1.toString());

        System.out.println("\n\n\n");

//      - Upcasting - Ahora fig2 apunta a la misma direccion de memoria que circulo1 que esta instanciada
        fig2 = circulo1;

//      - DownCasting - Error - circulo2 NO APUNTA a NINGUN SITIO
//        circulo2 = (Circulo) fig1;
//
//      - downCasting
//      'circulo2' apunta ahora a 'fig2' que tiene la posicion de memoria de 'circulo1' y es descendiente directo
//      Porque fig2 es temporalmente un 'CIRCULO'
        circulo2 = (Circulo) fig2;

//      - Upcasting
//      'cuadrado1' esta instanciado y le esta indicando a rect2 su posicion de memoria ahora los 2 apuntan al mismo sitio 
//      Herencia directa
        rect2 = cuadrado1;

//- Downcasting 
// fig1 - esta instanciado y tiene una posicion de memoria asignada a Figura 
// cuadrado2 - no esta instanciado , apunta a la posicion de memoria de fig2 
// y esta 2 niveles por debajo (herencia indirecta)
// Hay conflicto por eso :
//      cuadrado2 = (Cuadrado) fig1; // downCasting - El objeto cuadrado2 no esta instanciado
// ----------------------------------------------------------------------------
//- Downcasting 
// fig1 - esta instanciado y tiene una posicion de memoria asignada a Figura 
// cuadrado2 - no esta instanciado , apunta a la posicion de memoria de fig2 
// y esta 2 niveles por debajo (herencia indirecta)
// Hay conflicto por eso :
//        cuadrado2 = (Cuadrado) fig1;
        System.out.println(fig2.toString());
        System.out.println("☁ Mi area es " + fig2);
        System.out.println("☁ Mi color es " + fig2.getColor());
        System.out.println("○ Mi area es " + circulo2.toString());
        System.out.println("❎❎ Mi area es " + rect2.toString());
//        System.out.println("Mi area es " + cuadrado2.toString());
    }
}
