package StreamApi_test;

import java.util.Arrays;

public class FindMaxElement_test {
    public static void main(String[] args) {
        int arr []  = new int[5];
        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        arr[4] =50;

        int n =Arrays.stream(arr).max().getAsInt();
        System.out.println(n);
    }
}
