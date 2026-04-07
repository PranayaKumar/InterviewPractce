package java_8.stram_questions.intermediate;

import Basic_Questions.String.Comapartor_Comparable;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HihestPaidEmployee {
    public static void main(String[] args) {
         List<Employee> emplyeelist  = Arrays.asList(
               new Employee(1, "john", "HR", 10000),
               new Employee(2, "Mohan", "It", 55000),
               new Employee(3, "john", "It", 50000),
               new Employee(4, "john", "HR", 100000),
               new Employee(5, "john", "It", 150000)
        );
        Map<String, List<Employee>> list1 =emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        System.out.println(list1);
        Map<String, Optional<Employee>> collect =emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect);

        // count of emplyee in each department

       Map<String ,Long> empcount = emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
       System.out.println(empcount);


       //find department with more than 2 employee are present

          List<String> morethan2emp  =empcount.entrySet().stream().filter(e ->e.getValue()>2)
                  .map(Map.Entry::getKey)
                  .toList();
       System.out.println(morethan2emp);

       // merge both concepts
      List<String> hasmorethan2employee =   emplyeelist.stream().collect(Collectors
                .groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().filter(e ->e.getValue()>2)
                .map(Map.Entry::getKey)
                .toList();

      System.out.println(hasmorethan2employee);

           Map.Entry<String,Double> salryemp= emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                   .entrySet()
                     .stream().max(Map.Entry.comparingByValue()).orElseThrow();
       System.out.println(salryemp);


       Map.Entry<String, Double> highest_salary =  emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
               .entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();


















emplyeelist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
    System.out.println("Higheest salary "+highest_salary.getKey());
















       emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
               .entrySet().stream().max(Map.Entry.comparingByValue());

       // find second highest salary

       Optional<Employee> secondEmployee = emplyeelist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
       System.out.println(secondEmployee.get()+"Second Employee");


       emplyeelist.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.averagingDouble(Employee::getSalary)))
               .entrySet().stream().max(Map.Entry.comparingByValue());

       Map<String,Double> emp22 =emplyeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
       Optional<Map.Entry<String,Double>> emp23 = emp22.entrySet().stream().max(Map.Entry.comparingByValue());
       System.out.println(emp23);



    }
}
