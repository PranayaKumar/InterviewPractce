package Collections.Basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private  int capacity;
    public  LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        //map -- linkedhashmap
        LRUCache<String, Integer> studentmap = new LRUCache<>(3);
        studentmap.put("BOb",99);
        studentmap.put("Ram",90);
        studentmap.put("Mohan",93);
        studentmap.get("BOb");
        studentmap.put("Shysm",19);
        System.out.println(studentmap);
    }
}
