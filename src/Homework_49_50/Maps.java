package Homework_49_50;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    /**
     * Метод создает инверсию ключ-значение в заранее заданной Map, порядок пар сохраняется
     */
    static void mapsInversion() {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "C");
        map.put(2, "B");
        map.put(3, "A");

        map.forEach((k, v) -> System.out.println(v + " = " + k));

    }
}
