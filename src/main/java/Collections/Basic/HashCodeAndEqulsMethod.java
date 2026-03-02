package Collections.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashCodeAndEqulsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map1 = new HashMap<>();
        Person p1 = new Person("Mohan", 1);
        Person p2 = new Person("Sohan", 2);
        Person p3 = new Person("Ram", 3);
        Person p4 = new Person("Mohan",4);

        map1.put(p1, "Engineer");//hashcode1 --->index
        map1.put(p2, "Desiner"); // hashcode2 -->index
        map1.put(p3, "tester"); // hashcode3 -->index
        map1.put(p4, "Lead"); // hashcode4 -->index
        Set<Map.Entry<Person,String>> entries = map1.entrySet();
        for (Map.Entry<Person,String> entry: entries ){
            System.out.println(entry);
        }



    }

}

class Person{

    private  String name;
    private int id;

    public Person(String mohan, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
