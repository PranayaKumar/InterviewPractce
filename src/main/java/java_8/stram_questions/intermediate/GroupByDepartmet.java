package java_8.stram_questions.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartmet {
    public static void main(String[] args) {
        List<Employee> employee1 = Arrays.asList(
           new Employee(1, "john", "It", 120000),
           new Employee(2, "Mohan", "Dev", 125000),
           new Employee(3, "Sohan", "HR", 90000),
           new Employee(4, "Rohan", "Finance", 100000),
           new Employee(5, "Raj", "It", 150000)
        );
       Map<String, Double> map1 = employee1.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
       System.out.println(map1);

   Map<String, Double> map2 =  employee1.stream()
           .collect(Collectors.groupingBy(
            Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

    }
}
