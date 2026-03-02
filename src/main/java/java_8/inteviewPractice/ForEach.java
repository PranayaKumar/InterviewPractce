package java_8.inteviewPractice;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alince","Bob", "Cahrle" );
        names.forEach(name ->System.out.println(name));
    }
}
