package Multithreding_test;

public class Multithreading_test {
    public static void main(String[] args) {
        /*
        When java program starts, one thread begin running immediately, which is called the main thread.this thread is responsible for
        executing the main method of a program.

        To create a new thread in java you can either extend the Thread class or implement the runnable interface

         A new class World  is created thet extends Thread.
         the run method is overridden to define the code that constitutes the new thread
         start method is called to initiate the new thread.

        To create a new thread in java you can either extend the Thread class or implements the runnable interface.

        A new class World is created that extends thread
        the run method is overridden to define the code that constitutes the new thread
        start method is called to initiate the new thread object to initiate the new thread.

        in both cases, the run method contains the code that will be executed in the new thread.



        Thread lifecycle

        the lifecycle of a thread in java consists of several states, which a thred can move through during its execution.

        New -  A thread is in this state when it is created but not yet started.
        Runnable - After the start method is called, the thread become runnable. its ready to run and waiting for cpu time.
        Running - The thread is in this state when it is executing.
        Blocking/ Waiting : A thread is in this state when it is waiting for a resource or for another thread to perform an action
        Terminated : A thread is in this state when it has finished executing.






         */
       World world = new World();// new
//       world.start();
        Thread t1 = new Thread(world);
        t1.start();// RUNNABLE

        for(int i =0;i<1000;i++){
            System.out.println("Hello");
        }
//        System.out.println("test");
//        System.out.println(Thread.currentThread().getName());


    }
}
