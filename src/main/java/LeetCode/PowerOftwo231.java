package LeetCode;

import java.util.Scanner;

public class PowerOftwo231 {

    // given an integer n, return true if a power of two. otherwise, return false.

    public static boolean isPoweOfTwo(int n){
        if(n<0){
            return false;
        }
        if(n ==1){
            return true;
        }
        else {
            while (n%2 ==0){
                n = n/2;
            }
            if (n==1){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        boolean result =isPoweOfTwo(n);
        System.out.println(result);
    }
}
