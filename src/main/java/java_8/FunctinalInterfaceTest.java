package java_8;


interface  Addition{
    void add(int a, int b);
}
public class FunctinalInterfaceTest{

    /*
    * Functional  programming
    * oop and functional programming
    * 1. need to pass only one operation implementation logic and argument to a method, FP style
    * 2. when you need pass an object state as argument to  a method, oop style we follow
    *
    *
    * if an interface has only one abstract method, compiler consider it is functional interface.then the compiler allows us tyo crete Lambda expression from this interface.
    * if an interface has zero or more than one abstract method, compiler does not consider it as functional interface. then compiler does not allow us to create lambda expression from those interfaces.
    *
    *  @FunctionalInterface  -- it is a marker annotation.
    *
    *
    * Deriving a functional  interface to another functional  interface.
    * - with an additional abstract method?
    * -without an additional abstract  method?
    *
    *
    *
    *
    *
    *
    *
    * */
    @FunctionalInterface
    interface  Example{
        void m1();
    }
    @FunctionalInterface
    interface  Sample extends Example{
       // void m2();  -- getting error,
        public  default  void m2(){}
    }
    public static void main(String[] args) {
        /*
        Predeifine functional interface
        before java 8v

        1. Runnable
        2. Callable
        3. Comparable
        4. Comparator --
        5. AutoCloseable
        6.Closeable
        7. FileNamefilter
        8. Flushable
        9. ActionListeners


        from java 8 version

        the package java.util.function

        has 43 functional interface
        1. Consumer<T>
        2. Supplier<T>
        3. Function<T,R>
        4. Predicate<T>
        5. BiConsumer<T,U>
        6. BiFunction<T,U,R>
        7. BiPredicate<T,U>
        8. UnaryOperator<T>
        9. BinaryOperator<T>







         */


    }

}
