package Collections.Basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMpaDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f, true);
        HashMap<String,Integer> hashMap = new HashMap<>();
        linkedHashMap.put("Orange",1);
        linkedHashMap.put("Apple",2);
        linkedHashMap.put("Guava",3);

        linkedHashMap.get("Orange");
        linkedHashMap.get("apple");
        linkedHashMap.get("guava");

      for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
          System.out.println(entry.getKey()+": "+entry.getValue());

          /*
          double linked list
          linkhash map is little with slow because of load, and take more memory than Hashmap
          //caching -- lease recentlu sused ham hat dete hain, uske kiye ham use kar sakte hain
           */
        }

      HashMap<String, Integer> hashMap1 = new HashMap<>();
      LinkedHashMap<String , Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap1);



    }
}
