package com.csi.testex;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// list of courses
//List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

//course with length
public class App {

    public static void main(String[] args) {

       /* List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        // courses.stream().filter(c->c.equals("Docker")).forEach(System.out::println);

        // Map<String, Long> counterMap = courses.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //  System.out.println(counterMap);

        for (String course : courses) {
            System.out.println("Course: " + course + "Course Length: " + course.length());
        }*/


        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // numbers.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(System.out::println);

        Map<Integer, Long> counterMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        counterMap.forEach((k, v) -> {



            if (v == 1) {
                System.out.println(k );
            }
        });
    }
}
