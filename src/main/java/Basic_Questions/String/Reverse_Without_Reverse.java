package Basic_Questions.String;

public class Reverse_Without_Reverse {
    public static void main(String[] args) {
        String  input ="Aliialalllalamaaabbbuakssdljkha";

        String rev ="";

        for (int i = input.length()-1; i>=0;i--){
            rev = rev+input.charAt(i);
        }
        System.out.println(rev);
        String str ="Hello";
        char[] arr = str.toCharArray();
        for (int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

        }

}
