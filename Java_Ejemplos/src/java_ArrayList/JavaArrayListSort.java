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

public class JavaArrayListSort {

}

class Fruit2 {

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

// Interfaces                    Clase descendiente Interfaces List
        List<Fruit2> fruits = new ArrayList<Fruit2>();

        Fruit2 fruit;
        for (int i = 0; i < 100; i++) {
            fruit = new Fruit2();
            fruit.setFruitName("fresas");
            fruits.add(fruit);
        }

// Sorting
        Collections.sort(fruits, new Comparator<Fruit2>() {
            @Override
            public int compare(Fruit2 fruit2, Fruit2 fruit1) {

                return fruit1.fruitName.compareTo(fruit2.fruitName);
            }
        });

        for (Fruit2 fruit1 : fruits) {
            System.out.println(fruit1.getFruitName());
        }
    }

}
