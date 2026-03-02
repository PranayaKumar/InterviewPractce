package java_8.stram_questions.HardLevel;

import com.sun.source.tree.NewArrayTree;

import java.nio.charset.CharsetEncoder;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employee = List.of(
                new Employee( 1, "Raj", "IT", 300000),
                new Employee( 2, "Mohan", "HR", 300000),
                new Employee( 3, "Sohan", "IT", 300000),
                new Employee( 4, "Ram", "jT", 300000),
                new Employee( 5, "Raju", "IT", 300000),
                new Employee( 6, "Sonu", "IT", 300000),
                new Employee( 7, "Monu", "IT", 300000),
                new Employee( 8, "choet", "IT", 300000),
                new Employee( 9, "aaaa", "IT", 300000)
        );
//        Map< Character,Long > map =
//                employee.stream()
//                .map(e -> e.getName().charAt(0))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(map);
//        Optional<Map.Entry<Character, Long>> max = map.entrySet().stream().max(Map.Entry.comparingByValue());
//        System.out.println(max);

        Optional<Map.Entry<Character, Long>> max  =
                employee.stream()
                        .map(e -> e.getName().charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                                .max(Map.Entry.comparingByValue());
        System.out.println(max);

       Map<Character, Long> map3 = employee.stream().map(e->e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(map3);

       Optional<Map.Entry<Character, Long>> count  =map3.entrySet().stream().max(Map.Entry.comparingByValue());
       System.out.println(count);

       employee.stream().map(e -> e.getName().charAt(0)).collect(Collectors.groupingBy(Function.identity()
               ,Collectors.counting()));
       map3.entrySet().stream().max(Map.Entry.comparingByValue());
    }
}
