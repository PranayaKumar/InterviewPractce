package Multithreding_test;

//public class World extends  Thread{

public  class World implements Runnable{


    @Override
    public void run() {
        for(int i =0; i<1000;i++){
            System.out.println("World");
        }
    }
}
