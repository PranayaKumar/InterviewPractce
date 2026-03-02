package Collections.Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(10);
//        Iterator<Integer> itr = list1.iterator();
//        System.out.println(itr.next());

         Iterator<Integer> itr1  = list1.iterator();
     while(itr1.hasNext()){
         Integer i =itr1.next();
         if(i==10){
             itr1.remove();
         }
     }
     System.out.println(list1);
    }
}
