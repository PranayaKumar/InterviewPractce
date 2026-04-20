package IntroDuctionProblemSolvoing;

import java.util.Scanner;

public class Squarerootofanumber {
    public  static int solve(int n){
        for(int i =0; i<10000; i++){
            if(i*i == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
