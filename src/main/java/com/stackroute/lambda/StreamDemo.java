package com.stackroute.lambda;
import java.util.*;

public class StreamDemo {

    public static void main(String ss[]) {

        List<String> places = new ArrayList<>(); //list of places

        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        System.out.println("\nThe places in Nepal are: \n");

        places.stream()    //prints the places in Nepal
                .filter((p) -> p.startsWith("Nepal"))
                .forEach((p) -> System.out.println(p.substring(p.indexOf(",")+2)));

    }

}
