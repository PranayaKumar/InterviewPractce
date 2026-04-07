package Basic_Questions.String;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String");
       String s  = sc.nextLine();
       char [] ch = s.toCharArray();

       for(char c : ch){
           if(! Character.isWhitespace(c)){
               sb.append(c);
           }
       }
       System.out.println(sb);
    }
}
