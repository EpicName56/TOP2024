package Old_Homework.Homework_49_50;

import java.util.HashMap;
import java.util.Map;

import static Old_Homework.Homework_49_50.Maps.mapsInversion;

public class Main {

    public static void main(String[] args) {

        String offer = "Java is fun and java is powerful";
        offer = offer.replaceAll(" ", "");

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < offer.length(); i++) {
            char chars = offer.charAt(i);
            counter.put(chars, counter.getOrDefault(chars, 0) + 1);

        }

        System.out.println(counter);

        System.out.println("----------------------------------------------------------------------------------------");

        mapsInversion();
    }
}
