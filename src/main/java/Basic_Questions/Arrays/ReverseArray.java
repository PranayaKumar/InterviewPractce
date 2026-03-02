package Basic_Questions.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={ 1,2,3,4,4,5};
        reverseAnArray(arr);

        System.out.println("Reverse Array");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static  void reverseAnArray(int []arr){
        int left =0;
        int right  = arr.length-1;

        while (left<right){

            int temp= arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
