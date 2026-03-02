package Basic_Questions.String;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        String s ="Hello world";

        char[] ch = s.toCharArray();

        Set<Character> result = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            for(int j =i+1; j<s.length(); j++){
                if(s.charAt(i) ==s.charAt(j)){

                    result.add(s.charAt(i));
                }}
        }
        System.out.println(result);

        for (char c :ch){
            if(! result.add(c)){
                System.out.print(c);
            }
        }
    }
}
