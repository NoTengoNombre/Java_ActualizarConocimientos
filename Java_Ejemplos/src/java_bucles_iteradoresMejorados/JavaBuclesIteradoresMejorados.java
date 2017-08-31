/**
 * @created on : 31-ago-2017, 16:51:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_bucles_iteradoresMejorados;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaBuclesIteradoresMejorados {

    private static ArrayList arrayM = new ArrayList(100);

    public static void setArrayListForEach() {
        System.out.println("\n------ INICIO -------");
        arrayM.forEach((Object _item) -> {
            arrayM.add(Math.random() * (1 + 200) + 1);
        });
    }

    public static void setArrayListAnonima() {
        System.out.println("\n------ INICIO -------");
        arrayM.forEach(new Consumer() {
            @Override
            public void accept(Object _item) {
                arrayM.add(Math.random() * (1 + 200) + 1);
            }
        });
    }

    public static void setArrayListForEachClaseAnonimaYLambda() {
        System.out.println("\n------ INICIO -------");
        arrayM.forEach((Object _item) -> {
            arrayM.add(Math.random() * (1 + 200) + 1);
        });
    }

    public static void setArrayAdd() {
        for (int i = 0; i < arrayM.size(); i++) {
            arrayM.add(Math.random() * (1 + 200) + 1);
        }
    }

    public static void setArradAddRandom() {
        for (Object arrayM1 : arrayM) {
            arrayM.add(Math.random() * (1 + 200) + 1);
        }
    }

    public static void main(String[] args) {

        setArrayListForEach();
    }

}
