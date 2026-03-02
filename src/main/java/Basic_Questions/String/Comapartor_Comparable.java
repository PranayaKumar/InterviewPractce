package Basic_Questions.String;

import java.util.Arrays;
import java.util.Comparator;

public class Comapartor_Comparable  {

    public static void main(String[] args) {
        Employee [] emp = new Employee[4];
        emp[0] = new Employee(5,"john");
        emp[1] = new Employee(7,"john");
        emp[2] = new Employee(9,"john");
        emp[3] = new Employee(3,"john");

        Arrays.sort(emp, Employee.NameCamarator);
        System.out.println(Arrays.toString(emp));

    }
}
