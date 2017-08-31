/**
 * @created on : 31-ago-2017, 20:56:46
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaArraySort {

    private static List<Contact> list = new ArrayList<Contact>();
    private static Contact one = new Contact();
    private static Contact two = new Contact();
    private static Contact three = new Contact();

    public static void main(String[] args) {
        one.setLastName("Smith");
        two.setLastName("Monks");
        three.setLastName("Aaron");
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println("Before: " + list);

        Collections.sort(list, new Comparator<Contact>() {
            @Override
            public int compare(Contact contact, Contact another) {
                return contact.getLastName().compareToIgnoreCase(another.getLastName());
            }
        });
        System.out.println("After: " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
