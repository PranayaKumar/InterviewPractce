package java_8.stram_questions.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBylenght {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana","bat","cat", "dog","goat");
        // based on their size
        Map<Integer, List<String>> output  = words.stream().collect(Collectors.groupingBy(String::length));
       Map<Integer,List<String>> test1 =  words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(output);

    }
}
