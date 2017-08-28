/**
 * @created on : 29-ago-2017, 0:04:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones;

import java.util.ArrayList;

public class T5ColeccionesBasicasArrayListMetodos {

    public static void main(String[] args) {

        String s = "Objeto String";

        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "Declaracion directa String");
        arrayList.add(s);
        arrayList.add(1);
        arrayList.add(2.2);

        for (Object object : arrayList) {
            System.out.println("Valor : " + object);
        }

        int x = arrayList.size();

        System.out.println("Cuantos elementos hay : " + x);

        ArrayList arrayList1 = new ArrayList();

        System.out.println("-----------------------");
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);
        arrayList1.add(8);
        arrayList1.add(9);

        System.out.println(arrayList1);

        arrayList1.forEach((indice) -> {
            System.out.println(" Valor : " + indice);
        });

        System.out.println("• get para obtener la posicion : " + arrayList1.get(3));
        System.out.println("• remove para borrar la posicion : " + arrayList1.remove(4));

        String x1 = "String de 1 ";
        String x2 = "String de 2 ";
        String x3 = "String de 3 ";
        String x4 = "String de 4 ";
        String x5 = "String de 5 ";

        System.out.println("-----------------");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(x1);
        arrayList2.add(x2);
        arrayList2.add(x3);
        arrayList2.add(x4);
        arrayList2.add(x5);

        for (Object i2 : arrayList2) {
            System.out.println(i2);
        }

        System.out.println("-----------------");
        boolean bx = arrayList2.contains(x1);
        System.out.println("El objeto x1 existe : " + bx);

        boolean bx1 = arrayList2.contains("String de 2 ");
        System.out.println("El objeto x2 existe y lo buscamos por su contenido : " + bx1);

        arrayList2.indexOf("String de 5 ");
        System.out.println("Posicion del objeto : " + arrayList2.indexOf("String de 5 "));

        ArrayList<Integer> arrayList3 = new ArrayList();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);
        arrayList3.add(6);

        System.out.println("------------------");
        System.out.println(arrayList3);
        System.out.println("------------------");

        for (Integer i3 : arrayList3) {
            System.out.println("Valores : " + i3);
        }

        arrayList3.clear();

        System.out.println("\t ------------");
        System.out.println("-------- Metodo clear ---------");
        System.out.println(arrayList3);
        System.out.println("\t ------------");

        ArrayList<Integer> arrayList4 = new ArrayList();
        arrayList4.add(15);
        arrayList4.add(20);
        arrayList4.add(25);
        arrayList4.add(22);

        for (Integer integer : arrayList4) {
            arrayList4.set(2, 55);
            System.out.println("Valor : " + integer);
        }

        System.out.println(" - arrayList4.set - \nCambiamos el valor de la posicion : " + arrayList4);
    }
}
