package IntroDuctionProblemSolvoing;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i =2; i< n; i++){
            if (n % i ==0){
                flag =false;
                break;
            }
        }
        flag = true;
        if (flag == true){
            System.out.println("YES");
        }
        else {
            System.out.println("False");
        }
    }
}
