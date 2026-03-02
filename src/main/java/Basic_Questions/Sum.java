package Basic_Questions;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number at a place ");
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();

        int c = num1+num2;
        System.out.println(c);
// even and odd
        String result = (num1%2 ==0)?"even" :"odd";
        System.out.println(result);

    }
}
