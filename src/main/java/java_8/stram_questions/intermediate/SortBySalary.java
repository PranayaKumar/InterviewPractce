package java_8.stram_questions.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class SortBySalary {
    public static void main(String[] args) {
        List<Employee> list1  = Arrays.asList(
          new Employee(101,"John", 50000),
          new Employee(102, "Alice", 70000),
          new Employee(103, "Bob", 80000),
          new Employee(103, "Ram", 180000)
        );

           List<Employee> sortedlist =    list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                             .toList();
           System.out.println(sortedlist);

        Optional<Employee> secondHighestSalry =  list1.stream().sorted(Comparator.comparing(Employee:: getSalary).
                reversed()).skip(1).findFirst();
        System.out.println(secondHighestSalry.get());

       Optional<Employee> lowestlist =  list1.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst();
       System.out.println(lowestlist.get());


     Optional<Employee> thirdHighest  =list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
     System.out.println(thirdHighest.get());

     Optional<Employee> firstHighest =list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();

     Optional<Employee> firndfirst =list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
     list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();


     Optional<Employee> findfirst2 =list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();


















     list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();















     Optional<Employee> SortedList =list1.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
     System.out.println("Second_Highest_Salary"+SortedList);
    }
}
