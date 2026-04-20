package Arrays.oneD;

import java.util.Scanner;

public class AdjecetElemetDifference {
    static  boolean findDiff(int arr[], int k){

        for (int i =0; i< arr.length-1; i++){
            if(arr[i] - arr[i+1] == k || arr[i+1] -arr[i] ==k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  length of an Array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i< n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter a valur where you want to check adjectnt difference");
        int k = sc.nextInt();
        System.out.println(findDiff(arr, k));

    }
}
