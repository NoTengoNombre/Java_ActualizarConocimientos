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
import java.util.Comparator;
import java.util.List;

public class Fruit {

// Interfaces                    Clase descendiente Interfaces List
    static List<Fruit> list = new ArrayList<Fruit>();

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();
        Fruit fruit4 = new Fruit();
        Fruit fruit5 = new Fruit();

        fruit1.setFruitName("fresas1");
        fruit2.setFruitName("fresas2");
        fruit3.setFruitName("fresas3");
        fruit4.setFruitName("fresas4");
        fruit5.setFruitName("fresas5");

        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);
        list.add(fruit5);

        for (Fruit counter : list) {
            System.out.println(counter.getFruitName());
        }

        Collections.sort(list, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return f1.getFruitName().compareToIgnoreCase(f2.getFruitName());
            }
        });
        System.out.println("After : " + list);
    }
}
