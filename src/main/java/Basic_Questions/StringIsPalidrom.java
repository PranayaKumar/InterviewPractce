package Basic_Questions;

public class StringIsPalidrom {

    public static void main(String[] args) {
        String str = "radar";
        Boolean b = findPlaidrom(str);
        System.out.println(b);
    }

    public static  boolean findPlaidrom(String str){
        int left =0;
        int right = str.length()-1;

        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
