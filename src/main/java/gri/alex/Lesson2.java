/**
 * Copyright © 2016, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 2 homework
 */
package gri.alex;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Lesson2 {
    public static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Run the exercises to ensure we got the right answers
     *
     * @throws IOException
     */
    public void runExercises() throws Exception {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 2");
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
        System.out.println("Running exercise 6 solution...");
        exercise6();
        System.out.println("Running exercise 7 solution...");
        exercise7();
    }

    /**
     * Exercise 1
     *
     * Create a new list with all the strings from original list converted to
     * lower case and print them out.
     */
    public String exercise1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        return list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList())
                .toString();
    }

    /**
     * Exercise 2
     *
     * Modify exercise 1 so that the new list only contains strings that have an
     * odd length
     */
    public String exercise2() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        return list.stream()
                .filter(str-> str.length() % 2 != 0)
                .map(String::toLowerCase)
                .collect(Collectors.toList())
                .toString();
    }

    /**
     * Exercise 3
     *
     * Join the second, third and forth strings of the list into a single string,
     * where each word is separated by a hyphen (-). Print the resulting string.
     */
    public String exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        return list.stream()
                .skip(1)
                .limit(3)
                .collect(Collectors.joining("-"));
    }

    /**
     * Count the number of lines in the file using the BufferedReader provided
     */
    public long exercise4() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("SonnetI.txt").toURI());
        long lines = 0;

        try (BufferedReader reader = Files.newBufferedReader(path, UTF_8)) {
            lines = reader.lines().count();
        }

        return lines;
    }

    /**
     * Using the BufferedReader to access the file, create a list of words with
     * no duplicates contained in the file.  Print the words.
     *
     * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
     */
    public String exercise5() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("SonnetI.txt").toURI());
        String uniqueWords = "";

        try (BufferedReader reader = Files.newBufferedReader(path, UTF_8)) {
            uniqueWords = reader
                    .lines()
                    .flatMap(line -> Arrays.stream(line.split(WORD_REGEXP)))
                    .distinct()
                    .collect(Collectors.toList())
                    .toString();
        }

        return uniqueWords;
    }

    /**
     * Using the BufferedReader to access the file create a list of words from
     * the file, converted to lower-case and with duplicates removed, which is
     * sorted by natural order.  Print the contents of the list.
     */
    public String exercise6() throws Exception {
        String uniqueSortedWords = "";
        Path path = Paths.get(ClassLoader.getSystemResource("SonnetI.txt").toURI());

        try (BufferedReader reader = Files.newBufferedReader(path, UTF_8)) {
            uniqueSortedWords = reader.lines()
                    .flatMap(line -> Arrays.stream(line.split(WORD_REGEXP)))
                    .distinct()
                    .map(String::toLowerCase)
                    .sorted()
                    .collect(Collectors.toList())
                    .toString();
        }
        return uniqueSortedWords;
    }

    /**
     * Modify exercise6 so that the words are sorted by length
     */
    public String exercise7() throws Exception {
        String uniqueSortedWords = "";
        Path path = Paths.get(ClassLoader.getSystemResource("SonnetI.txt").toURI());

        try (BufferedReader reader = Files.newBufferedReader(path, UTF_8)) {
            uniqueSortedWords = reader.lines()
                    .flatMap(line -> Arrays.stream(line.split(WORD_REGEXP)))
                    .distinct()
                    .map(String::toLowerCase)
                    .sorted(Comparator.comparing(String::length))
                    .collect(Collectors.toList())
                    .toString();
        }
        return uniqueSortedWords;
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     * @throws IOException If file access does not work
     */
    public static void main(String[] args) throws Exception {
        Lesson2 lesson = new Lesson2();
        lesson.runExercises();
    }
}

