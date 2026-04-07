package AskedQuestions.Accenture;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",20);
        map.put("B",10);
        map.put("C",15);
        map.put("D",25);
        map.put("E",17);

       LinkedHashMap<String,Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,
                        LinkedHashMap::new));

        result.forEach((key,value) ->
        System.out.println(key+"--"+ value));
    }
}
