package StringQuestions;

public class StringBufferExample {
    public static void main(String[] args) {

        String s = "Hello";
        StringBuffer sb = new StringBuffer(s);

        //appends a string
        sb.append(", java");
        System.out.println(sb);

        //Insert a string at specific position

        sb.insert(5,"World");
        System.out.println(sb);

        //reverse a string
        sb.reverse();
        System.out.println("Reverse string :" +sb);



    }
}
