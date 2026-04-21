package LeetCode;

import java.util.Scanner;

public class Palidrome09 {
    // if palidrom  return true otherwise false
    static  boolean  plaidrom(int x){
        if(x<0){
            return false;
        }
        int n = x;
        int revnum =0;
        while (n>0){
            int d = n%10;
            revnum = revnum*10+d;
            n = n/10;
        }
        if (revnum == x){
         return  true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int x = sc.nextInt();
       boolean result = plaidrom(x);
       System.out.println(result);
    }
}
