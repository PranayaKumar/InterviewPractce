package java_8.stram_questions.intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostFrequentCharaceter {
    public static void main(String[] args) {
        String input = "banana";
        IntStream chars = input.chars();
        chars.forEach(System.out::println);

        Stream<Character> characterStream = input.chars().mapToObj(c ->(char) c);

        Map<Character,Long> map =input.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        Map<Character, Long> test = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map.Entry<Character,Long> map1=map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(map1);
 
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.*;
//        class Main {
//            public static void main(String[] args) {
//
//                String str ="Hello fron Indiaaa";
//                String input =str.replace(" ","");
//                System.out.println(input);
//
//                Map<Character,Long> map1 =
//                        input.chars()
//                                .mapToObj(c -> (char)c)
//                                .collect(Collectors.groupingBy
//                                        (Function.identity(),Collectors.counting()
//                                        ));
//
//                System.out.println(map1);
//
//                Map.Entry<Character, Long> map2 = map1.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
//                System.out.print(map2);
//
//            }
//        }















    }
}
