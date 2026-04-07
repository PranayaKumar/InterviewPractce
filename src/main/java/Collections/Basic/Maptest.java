package Collections.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Ankit");
        map.put(2,"Neha");
        map.put(3,"Subham");
        map.put(4,"Raj");
        System.out.println(map);

        String s =map.get(3);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Sunham"));
        System.out.println(map.containsValue("Sunham"));

        //Set<Integer> integers = map.keySet();
        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }
        Set <Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String>entry :entries){
//           entry.setValue(entry.getKey(), entry.getValue().toUpperCase());
        }
         System.out.println(map);

    }
}
