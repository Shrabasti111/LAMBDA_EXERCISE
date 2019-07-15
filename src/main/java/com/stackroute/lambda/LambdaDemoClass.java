package com.stackroute.lambda;
import java.util.*;

public class LambdaDemoClass {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList(); //List of Employees
        list.add(new Employee(24, "Shannon", "Markel"));
        list.add(new Employee(21, "Joseph", "Lewis"));
        list.add(new Employee(25, "David", "Copperfield"));
        list.add(new Employee(27, "Sasha", "Casper"));
        list.add(new Employee(42, "Samantha","Piers"));

        System.out.println("\nNames sorted basing on the last names: \n");

        list.sort(Comparator.comparing(Employee::getLastname)); //sorts the employees basing on their last name

        System.out.println(list);

        System.out.println("\nNames with last name staring with C\n");

        list.stream().filter(p -> p.getLastname().startsWith("C")) //prints the employess whose last name starts with "C"
                     .forEach(p -> System.out.println(p));



    }


}
