package Basic_Questions.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicxate1 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 3, 2};

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++){
            if (arr[i] == arr[i+1]){
                System.out.println(arr[i]);
            }
    }

   HashSet<Integer> h1 = new HashSet<>();
        for(int  e:arr ){
           if( ! h1.add(e)){
               System.out.print(e +",");

            }

        }
}
}
