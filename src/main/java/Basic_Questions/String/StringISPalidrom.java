package Basic_Questions.String;

import java.util.Scanner;

public class StringISPalidrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s =sc.nextLine();
        int length = s.length();
        boolean result = true;

        for (int i =0; i < length/2; i++){
            if(s.charAt(i) != s.charAt(length-i-1)){
              result = false;
              System.out.println(result);
              break;
            }
            else {
                System.out.println("true");
            }
        }

    }
}
