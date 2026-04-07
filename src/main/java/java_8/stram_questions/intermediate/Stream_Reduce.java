package java_8.stram_questions.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Reduce {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("pak", "Indian","NewZeland", "SouthAfrika", "Srilanka");
        Optional<String> longestString = list.stream().reduce((words1, words2)-> words1.length()>words2.length() ?words1:words2);
        System.out.println(longestString.get());




    }
}
