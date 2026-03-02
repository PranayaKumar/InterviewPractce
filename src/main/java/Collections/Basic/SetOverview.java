package Collections.Basic;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.StreamSupport;

public class SetOverview {
    public static void main(String[] args) {
        /*
        Set is collection that cannot contain duplicate elemenets
        faster Operation
        Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
                HashSet is - order doesnot preserved
                LinkedHashSet -- order preserved;
                TreeSet -- store is soreted way
         // thread Safety




         */

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(22);
        set.add(43);
        set.add(96);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(12);
        set1.add(22);
        set1.add(43);
        set1.add(96);
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(12);
        set2.add(22);
        set2.add(43);
        set2.add(96);
        System.out.println(set2);


        // thread Safety
        Set<Integer> integers  = Collections.synchronizedSet(set);

         NavigableSet<Integer> set4 = new ConcurrentSkipListSet<>();

    }
}
