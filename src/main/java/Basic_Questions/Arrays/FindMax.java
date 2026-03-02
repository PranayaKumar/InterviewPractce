package Basic_Questions.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int arr[] = {10,17,18,23,45};
        int max = findMax(arr);
        System.out.println(max);
    }
    public static int findMax(int [] arr){
        int max = arr[0];
        for (int i =0 ; i< arr.length; i++){
            if (arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
}
