package Basic_Questions.String;

import java.util.HashMap;

public class DistictCharecterandTheirCount {
    public static void main(String[] args) {
        String s = "abbccddeeddaaaccbb";
        char [] ch =s.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c :ch){
            if(count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }
            else {
                count.put(c,1);
            }
        }
        System.out.println(count);
    }
}
