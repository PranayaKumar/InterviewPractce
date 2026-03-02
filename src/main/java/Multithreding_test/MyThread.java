package Multithreding_test;

public class MyThread extends  Thread{
    public MyThread(String lowPriorityThraed) {
    }

    @Override
    public void run() {
     System.out.println("RUNNING");
    }

    public static void main(String[] args) {
//     MyThread t1 = new MyThread();
//     System.out.println(t1.getState());

        MyThread l = new MyThread("Low Priority Thraed");
        MyThread m = new MyThread("Medium Priority Thraed");
        MyThread h = new MyThread("high Priority Thraed");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        m.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
//     t1.start();
//     System.out.println(t1.getState());
//     System.out.println(currentThread().getState());
//     try {
//         Thread.sleep(100);
//
//     }
//     catch (Exception e){
//         System.out.println(e);

     }
    }

