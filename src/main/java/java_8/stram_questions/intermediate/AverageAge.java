package java_8.stram_questions.intermediate;

import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Mohan", 25),
                new Person("Shyam", 36),
                new Person("Sohan", 45),
                new Person("Bob", 30)
        );

      Double average  =  person.stream().mapToInt(Person::getAge).average().orElse(0.0);
      System.out.println(average);



















Double test1 =person.stream().mapToDouble(Person::getAge).average().getAsDouble();
System.out.println(test1);



    }
}
