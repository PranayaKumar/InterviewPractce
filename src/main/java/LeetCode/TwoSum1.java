package LeetCode;

public class TwoSum1 {
    //given an array of integers and an integer target, return indices of the two numbers such they add up to traget

    public static int[] twoSum(int [] nums, int target){
        int [] ans = new int [2];
        for(int i =0; i< nums.length;i++){
            for (int j =i+1;j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] =i;
                    ans[1] =j;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int targer =9;
       int [] arr = twoSum(nums,targer);
       for(int i =0; i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
