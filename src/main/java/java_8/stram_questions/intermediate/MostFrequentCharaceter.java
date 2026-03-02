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

        Map.Entry<Character,Long> map1=map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(map1);


    }
}
