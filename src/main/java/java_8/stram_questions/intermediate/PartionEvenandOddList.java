package java_8.stram_questions.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionEvenandOddList {
    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1,3,4,5,7,9,10,12,13,14);
        Map <Boolean, List<Integer> > output  =numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 ==0));

        System.out.println("Even Niumbers : "+output.get(true)+"--Odd Numbers "+output.get(false));
    }
}
