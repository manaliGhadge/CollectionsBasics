package map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();

        // Keys are case-insensitive
        map.put("One", 1);
        map.put("one", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        // will override value against key = Two
        map.put("Two", 22);

        System.out.println(map);
    }
}
