package Basic_Questions;

import java.util.Scanner;

public class factorialtest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
         int factorial =findfactorial(n);
         System.out.println(factorial);
    }
    public static int findfactorial(int n){
        if(n==0 || n ==1 ){
            return 1;
        }
        return n*findfactorial(n-1);
    }
}
