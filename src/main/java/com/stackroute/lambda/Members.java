package com.stackroute.lambda;
import java.util.*;
public class Members {

    public static void main(String ss[]) {

        List<String> memberNames = new ArrayList<>(); //list of members

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<Integer> numbers = new ArrayList<>(); //list of numbers

        numbers.add(24);
        numbers.add(21);
        numbers.add(17);
        numbers.add(12);
        numbers.add(5);

        System.out.println("Member Names starting with A: \n");

        memberNames.stream()                          //prints the member names starting with A
                .filter((p) -> p.startsWith("A"))
                .sorted()
                .forEach((p) -> System.out.println(p));

        System.out.println("\nMembers Names in uppercase\n");

        memberNames.stream()
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));  //prints the member names in uppercase

        System.out.println("\nMember names starting with S in uppercase\n");

        memberNames.stream()
                .filter((p) -> p.startsWith("S"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));  //prints the member names starting with S in uppercase



       long count = memberNames.stream().filter((p)->p.endsWith("h")).count();

       System.out.println("\nNumber of member names ending with h = "+count); //prints the number of member names ending with h


       String item = memberNames.stream() .filter(p -> p.startsWith("S")) .findFirst() .orElse("");


       System.out.println("\nFirst Member name to start with S: "+item); //prints the first member name starting with S

       System.out.println("\nThe list of even numbers are: ");

       numbers.stream()
               .filter(p -> (p%2) == 0 )
               .forEach(p -> System.out.println(p));   //prints the list of even numbers

    }

}
