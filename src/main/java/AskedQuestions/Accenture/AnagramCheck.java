package AskedQuestions.Accenture;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "silent";
        // remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not  Anagram");

        }
        char[] ch1  = s1.toCharArray();
        char[] ch2  = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
