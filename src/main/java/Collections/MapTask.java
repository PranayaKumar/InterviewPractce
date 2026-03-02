package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String,String>();
        /// enter name and uul
        map1.put("ABD", "he is SouthAfrican Player");
        map1.put("Vk", "King of cricket");
        map1.put("MSD", "Caption cool");
       //using Map.entry
        for (Map.Entry<String,String> i :map1.entrySet())
            System.out.println("key = " +i.getKey()+ "   value ="+i.getValue());



        //using keyset and value
        for(String name: map1.keySet())
            System.out.println("key: " +name);
         for(String player: map1.values())
             System.out.println("values : "+player);



          }


}
