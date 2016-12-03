/**
 * Copyright © 2016, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 1 homework
 */
package gri.alex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Lesson1 {
    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */

    /**
     * Exercise 1
     *
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    public static String exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        return list.stream()
                .map(str -> str.substring(0,1))
                .collect(Collectors.joining());
    }

    /**
     * Exercise 2
     *
     * Remove the words that have odd lengths from the list.
     */
    public static String exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        return list.stream()
                .filter(str -> str.length() % 2 != 0)
                .collect(Collectors.joining(", "));
    }

    /**
     * Exercise 3
     *
     * Replace every word in the list with its upper case equivalent.
     */
    public static String exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        return list.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.joining(", "));
    }

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    public static String exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        return map.entrySet()
                .stream()
                .map(e -> e.getKey() + e.getValue())
                .collect(Collectors.joining());
    }

    /**
     * Exercise 5
     *
     * Create a new thread that prints the numbers from the list.
     */
    public static String exercise5() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Runnable r = () -> list.forEach(System.out::println);
        Thread thread = new Thread(r);
        thread.start();

        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}
