package java_8.stram_questions;

import jdk.jshell.Snippet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AddList_RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> list2  = Arrays.asList(2,3,5,7,8,9,10,11);

        List<Integer> list3 = Stream.concat(list1.stream(),list2.stream()).distinct().toList();
        System.out.println(list3);
    }
}
