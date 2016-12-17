/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 3 homework
 */
package gri.alex;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.nio.charset.StandardCharsets.UTF_8;

public class RandomWords {
    private final List<String> sourceWords;

    /**
     * Constructor
     *
     * @throws Exception If the source words file cannot be read
     */
    public RandomWords() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("words.txt").toURI());

        try (BufferedReader reader = Files.newBufferedReader(path, UTF_8)) {
            sourceWords = null;    // YOUR CODE HERE

            System.out.println("Loaded " + sourceWords.size() + " words");
        }
    }

    /**
     * Create a list of a given size containing random words
     *
     * @param listSize The size of the list to create
     * @return The created list
     */
    public List<String> createList(int listSize) {
        Random rand = new Random();
        List<String> wordList = null; // YOUR CODE HERE

        return wordList;
    }

    /**
     * Return the list of all source words, which cannot be modified
     *
     * @return The unmodifiable list of all source words
     */
    public List<String> allWords() {
        return Collections.unmodifiableList(sourceWords);
    }
}