package Arrays.oneD;

import java.util.Scanner;

public class AddADigitInAllArrayElemts {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        // add a digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit, what you want to add ");
        int b = sc.nextInt();
        int n = arr.length;

        for(int i =0; i< n; i++) {
            arr[i] = arr[i] + b;
        }
        for (int i =0;i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
