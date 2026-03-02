package java_8;

interface I1{
    void  m1(int p);
}

public class LamdaExpression {
    public static void main(String[] args) {


        int a = 5;
        int b = 5 + 6;

        I1 i1 = p -> System.out.println(p);
        System.out.println(a);
        System.out.println(b);
        System.out.println(i1);
    /*
       ->  - lamdaExpression

       (param) -> {logic};
       single parameter no parathensis needed;

        What is LE?
         LE is an anonymous function==>  which didnot have returntype and modifiers

         it is an implementation of FI
         Also it is an Object which is an instance of functional interface implementation.

        Why LE:
         For enabling functional programming in java and also it is used for passing one function as
         argument to other method directly without crating an explicit class and  explicit object

         Is it an alternative concept of new concept ?
         it is an alternate to annonimous inner class
         LE is short-cut to creating AIC




     */
    }
}
