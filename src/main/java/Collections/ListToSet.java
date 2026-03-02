package Collections;

import java.util.*;

public class ListToSet {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D","A"));
        System.out.println("list are "+list);
        Set<String> set = new HashSet<>(list);
        System.out.println("set are "+set);

    }
}
