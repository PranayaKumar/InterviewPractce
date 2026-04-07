package Arrays.oneD;

import java.util.Scanner;

public class InsertInAnArrayAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n);
        int arr [] = new int[n+1];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int insert = sc.nextInt();
        //3
        //6
        for (int i =n; i> insert-1; i--){
          arr[i] = arr[i-1];
        }
        int In = sc.nextInt();
        //5
        arr[insert-1] = In;
        for(int i =0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
