package Collections;


import java.util.ArrayList;
import java.util.InputMismatchException;

class  myThread extends Thread{
    static ArrayList<String> l = new ArrayList<>();
    public  void run(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println("Child thred updating List");
            l.add("D");

        }
    }
    public  static  void main(String [] args) throws InputMismatchException{
        l.add("A");
        l.add("B");
        l.add("c");
        l.add("D");


    }

}
public class ConcurrentHashMaptest {
    public static void main(String[] args) throws InputMismatchException {



        /*
        HashMap  --> not thread safe
        HashTable --> thread safe --> only one thread alloowed to opearation

        ConcurrentHashMap --> default  - 16 bucket
                            multipal thread can perform read operation
                            bucket level locking  -instead of total map level lock
                            segmental locking -- total hash map will be devided in special parts
                              16 --> concurrency level

                              for each segment -
                initial capacity = 16;


                  concurrent collection

                ==>  need of concurrent collections

                    most of the traditional ollection are  not thread safe


                  there are several thread safe = vector, Hashtable, synchronizedList(), syncset(), syncMap()
                  at a time only one thread can able to operate

                     if iteration and update happen at same time then getting concurrentmodificationexception




         */
    }
}
