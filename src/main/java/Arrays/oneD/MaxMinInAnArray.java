package Arrays.oneD;

import java.util.Scanner;

public class MaxMinInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n =sc.nextInt();
        int A[] = new int[n];
        int max =A[0];
        for(int i =0; i<n; i++){
            A[i] =sc.nextInt();
            if(A[i]> max){
                max =A[i];
            }
        }
        int min = A[1];
        for(int i =0; i< n; i++){
            if(min > A[i]){
                min =A[i];
            }
        }
        System.out.println("max integer present in Arrays is  : "+max);
        System.out.println("min integer present in Arrays is  : "+min);


    }
}
