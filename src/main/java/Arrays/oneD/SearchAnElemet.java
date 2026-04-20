package Arrays.oneD;

import java.util.Scanner;

public class SearchAnElemet {
     static boolean search(int arr[], int k){
        for (int i =0; i< arr.length; i++){
            if(arr[i] ==k){
                return true;
            }
        }
        return false;

     }
    public static void main(String[] args) {
//        int arr [] ={1,2,34,3,4,5,6,7,17};
//        int k =23;
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];;
        for (int i =0; i< n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
       boolean result = search(arr, k);
        System.out.println(result);
    }

}
