package Collections.Basic;

import org.example.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

public class LIstTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(1000);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(15);
        list.add(25);

        list.remove(2);
        list.add(2,17);
        list.set(2,50);

        System.out.println(list.size());
        // make a string array and convert it into list
        String[] fruits = {"Apple", "Banana", "Mango"};
        List<String> listfruits = Arrays.asList(fruits);

        //Converting list to array

        List<Integer> listtoArray = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Object[] array1 = listtoArray.toArray();
        list.toArray(new Integer[0]);
        System.out.println(array1);

        // sorting an arraylist






//        System.out.println(list.size());
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

        for(int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(5));

    }
}
