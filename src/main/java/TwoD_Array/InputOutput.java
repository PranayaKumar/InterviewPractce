package TwoD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int [] [] arr= new int [3][3];

        //input
        Scanner in = new Scanner(System.in);
        for(int row =0; row < arr.length; row++){
            // for each row I want to take an input
            for(int col =0; col < arr[row].length;col++){
               arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int row =0;row< arr.length; row++){
            // for each col in every row
            for (int col =0; col< arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // output using Arrays.toString()
        for(int row =0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        // using enhance for loop

        for (int [] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
