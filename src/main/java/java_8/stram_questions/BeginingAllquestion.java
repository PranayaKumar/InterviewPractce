package java_8.stram_questions;

import java.util.*;
import java.util.stream.Collectors;

public class BeginingAllquestion {
    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,9,19,11,4,5);
        List<String> fruits  = Arrays.asList("Apple","Banana", "Avacado", "Mango");
      //filter the even and odd numbers
        List<Integer> result = numbers.stream().filter(n->n%2 ==0).collect(Collectors.toList());
        System.out.println(result);

        //convert to square
        List<Integer> squareresult =numbers.stream().map(n ->n*n ).collect(Collectors.toList());
        System.out.println(squareresult);

        //square only even numbers

        List<Integer> evenSqare  =numbers.stream().filter(n->n%2==0).map(n ->n*n).collect(Collectors.toList());
        System.out.println(evenSqare);
        // print greater than 10 numbers
        List<Integer> numberegreaterThan10 =numbers.stream().filter(n -> n>10).collect(Collectors.toList());
        System.out.println(numberegreaterThan10);
        // find first where value is greater than 10

        Optional<Integer> first = numbers.stream().filter(n -> n>10).findFirst();
        System.out.println(first.get());

        //count how many nimbers are greater than 5
        Long count  = numbers.stream().filter(n ->n>5).count();
        System.out.println(count);

        // sum of product of all elements
        Integer sum =numbers.stream().reduce(0, (a,b) ->a+b);
        System.out.println(sum);

        //Find sum of even number in list

       Integer sumofEven = numbers.stream().filter(n -> n%2 ==0).reduce(0, (a,b)->a+b);
       System.out.println(sumofEven);

       //find max element

       Integer max = numbers.stream().reduce(0, (a,b) -> Integer.max(a,b));
       Integer max1=numbers.stream().reduce(0, Integer::max);
       System.out.println(max);
       System.out.println(max1);

       // sum of square of even numbers in the list

       Integer squresumofenennumkbers = numbers.stream().filter(n -> n%2==0).map(n ->n*n).reduce(0, (a,b) -> a+b);
       System.out.println(squresumofenennumkbers);

       // find all distinct elements from a list
       Set<Integer> distinctelement  = numbers.stream().collect(Collectors.toSet());
       System.out.println(distinctelement);
       List<Integer> distinct1 =numbers.stream().distinct().toList();
       System.out.println(distinct1);

       // find average of all numbers in a list

        double average =numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average);


        // sort a list in decending order
        // sorted method sort in assending order only so we need to add comarator.reverseorder
        List<Integer> list1  =  numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);

        //count how many String start with specific letter
       List<String> startwitha = fruits.stream().filter(fr ->fr.startsWith("A")).toList();
       System.out.println(startwitha);
       long count3  = fruits.stream().filter(fr ->fr.startsWith("A")).count();
       System.out.println(count3);

       //Join all string in a list into single comma seperator string

       String collect = fruits.stream().collect(Collectors.joining(",","[","}"));
       System.out.println(collect);


        boolean match  =numbers.stream().allMatch(n -> n>0);
        System.out.println(match);

        //any number is divisible by 3 or not

        boolean match1 =numbers.stream().anyMatch(n -> n%3 ==0);
        System.out.println(match1);

        List<List<Integer>> listofList  = Arrays.asList();{
            Arrays.asList(1,2,3,4);
            Arrays.asList(2,3,5,6);
            Arrays.asList(8,9,10,11);
        };

        List<Integer> listlist =listofList.stream().flatMap(List::stream).toList();
        System.out.println(listlist);


            Optional<Integer> second =numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(second.get());

        List<Integer> list5 = list1.stream().sorted().toList();



    }

}
