package Collections.Basic;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Vivek", 93);
        map.put("Shubam", 17);
        map.put("Mohit", 11);
        map.put("Raju", 93);
        System.out.println(map);
        // sorting based on keys
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Vivek"));
        System.out.println(map.tailMap("Mohit"));

    }
}
