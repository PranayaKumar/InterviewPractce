package AskedQuestions.Accenture;

import java.util.HashMap;
import java.util.Map;

public class CharCounttest {
    public static void main(String[] args) {

        char[] ch = {'H','e','l','l','o'};

        Map<Object, Long> map = new HashMap<>();
        for(char c :ch){
            map.put(c, map.getOrDefault(c, Long.valueOf(0)) + 1);

        }
        System.out.println(map);
    }
}
