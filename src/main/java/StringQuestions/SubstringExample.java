package StringQuestions;

public class SubstringExample {
    public static void main(String[] args) {
        String str = "Hello World ";
        //Extract a substring from index 0 to index 5 (exclusive)
        String subString1 = str.substring(0,5);
        System.out.println("Substring 1"+subString1);

        //Extract a substring from index 7 to the end of the string
        String str2 =  str.substring(6);
        System.out.println(str2);




    }
}
