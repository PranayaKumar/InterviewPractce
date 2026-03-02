package Basic_Questions.String;

import java.util.Scanner;

public class RemoveTrailingSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String ");
        String s =sc.nextLine();
        System.out.println(s.strip());


    }
}
