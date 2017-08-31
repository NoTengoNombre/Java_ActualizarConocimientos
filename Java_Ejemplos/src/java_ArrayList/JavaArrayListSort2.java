/**
 * @created on : 31-ago-2017, 19:35:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayListSort2 {

    public static void main(String[] args) {

        ArrayList<String> listofcountries = new ArrayList<>();
        listofcountries.add("India");
        listofcountries.add("Us");
        listofcountries.add("China");
        listofcountries.add("Denmark");
        listofcountries.add("Argelia");

        System.out.println("♦ Before Sorting : ");

//        Functional Operation
        listofcountries.forEach((counter) -> {
            System.out.println(counter);
        });

        Collections.sort(listofcountries);

        System.out.println("-------------------");

        System.out.println("• After Sorting: ");
        for (String counter : listofcountries) {
            System.out.println(counter);
        }
    }

}
