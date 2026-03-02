package AskedQuestions.Accenture;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int [] arr ={1,3,4,5,5,7};
        int k =2;

        int n = arr.length;
        k = k %n;
        int [] result = new int[n];
         for(int i =0; i< n; i++){
             result[i] = arr[(i+k)%n];

         }
         System.out.println(Arrays.toString(result));
    }
}
