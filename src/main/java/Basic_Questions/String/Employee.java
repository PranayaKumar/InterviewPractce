package Basic_Questions.String;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    int id ;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id -o.id;
    }

    public static Comparator<Employee> NameCamarator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());

    }
    };
}
