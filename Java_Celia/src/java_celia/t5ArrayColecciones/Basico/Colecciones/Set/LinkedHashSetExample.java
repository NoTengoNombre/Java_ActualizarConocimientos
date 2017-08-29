/**
 * @created on : 29-ago-2017, 14:21:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.Colecciones.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Book> hs = new LinkedHashSet<>();

//        Mi Coleccion objetos 
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communcations & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

//        Adding books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);

//        Traversing hash table
        System.out.println(" -------- For each -------- ");
        for (Book b : hs) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

//        Traversing hash table
        System.out.println(" -------- Funcion Iterator -------- ");
        for (Iterator<Book> it = hs.iterator(); it.hasNext();) {
            Book b = it.next();
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

        System.out.println(" -------- Funcion Lambda -------- ");
//        Traversing hash table
        hs.forEach((_item) -> {
            System.out.println(_item.id + " " + _item.name + " " + _item.author + " " + _item.quantity);
        });
    }
}

class Book {

    protected int id;
    protected String name, author, publisher;
    protected int quantity;

    /**
     *
     * @param id
     * @param name
     * @param author
     * @param publisher
     * @param quantity
     */
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
