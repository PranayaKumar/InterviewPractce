package Basic_Questions.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        int n = arr.length+1;

        int sum = n*(n+1)/2;
        int acvtualSum =0;

        for(int a: arr){

            acvtualSum = acvtualSum+a;
        }
        System.out.println(acvtualSum);
        System.out.println(sum);
        int misssinNumber = sum-acvtualSum;
        System.out.println(misssinNumber);


    }
}
