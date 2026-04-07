package Basic_Questions.String;

public class ReverseAStringEachWord {
    public static void main(String[] args) {

        String s = "Hello from my end";

        String [] test = s.split(" ");

        for(String word : test){

           String rev = new StringBuilder(word).reverse().toString();

           System.out.print(rev);
        }
    }
}
