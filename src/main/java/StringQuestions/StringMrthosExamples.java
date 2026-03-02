package StringQuestions;

import java.util.Locale;

public class StringMrthosExamples {
    public static void main(String[] args) {
        String str1 = "Hello World";
        // length of string
        System.out.println(str1.length());

        //get chat at a place
        char ch  = str1.charAt(3);
        System.out.println(ch);
        //concate string
        String concateStr = str1.concat(" welcome");
        System.out.println(concateStr);
        //check String contains specific substring
        boolean containstr =str1.contains("java");
        System.out.println(containstr);

        //check string start with specific prefix
        boolean startwithHello = str1.startsWith("Hello");
        System.out.println(startwithHello);

        // find index of the substring
        int index = str1.indexOf("java");
        System.out.println(index);

        //convert a string into lowercase and uppercase
        String uppercase = str1.toUpperCase();
        String lowercase = str1.toLowerCase();
        System.out.println("Uppercase :"+uppercase);
        System.out.println("Lowercase :"+lowercase);

        //Replace caharecter to substring
        String replcestr =str1.replace("java","Phython");
        System.out.println(replcestr);

        //split the string into an array  of substring

        String [] words = str1.split(", ");
        for ( String word:words){
            System.out.println(word);
        }

        // remove leading and trailing whitespace

        String trimstr = str1.trim();
        System.out.println("trimmed string "+ trimstr);


    }
}
