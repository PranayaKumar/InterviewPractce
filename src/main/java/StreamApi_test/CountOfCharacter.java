package StreamApi_test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharacter {
    public static void main(String[] args) {
        String s ="hello Guys Welcome to My youtube channel";

        Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy( str ->str, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        //or can also try using function.identity() instead of LinkedHashMap

        Map<String, Long> map1 = Arrays.stream(s.split(""))
                .map(String:: toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map1);
    }
}
