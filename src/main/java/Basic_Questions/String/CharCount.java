package Basic_Questions.String;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
       String s ="Hello";
       String s1 = s.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s1.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);

            }
            else{
                map.put(ch,1);
            }

        }
        System.out.println(map);
    }
}
