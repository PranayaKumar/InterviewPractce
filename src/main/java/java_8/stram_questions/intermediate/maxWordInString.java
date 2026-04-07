package java_8.stram_questions.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class maxWordInString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","Apple","box", "toy");
      String s=  list.stream().max(Comparator.comparingInt(String::length)).orElseThrow();

      String s1 = list.stream().max(Comparator.comparingInt(String::length)).orElseThrow();
      System.out.println(s);


    }
}
