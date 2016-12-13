package gri.alex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 2/12/16.
 */
public class Lesson1Test {

    @Test
    public void stringConsistsOfTheFirstLetterOfEachWord() throws Exception {
        assertEquals("abcdef",
                Lesson1.exercise1());
    }

    @Test
    public void removedWordsWithOddLengths() throws Exception {
        assertEquals("echo",
                Lesson1.exercise2());
    }

    @Test
    public void wordsConvertedToUpperCase() throws Exception {
        assertEquals("ALPHA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT",
                Lesson1.exercise3());
    }

    @Test
    public void convertEveryKeyValueIntoString() throws Exception {
        assertEquals("a1b2c3",
                Lesson1.exercise4());
    }

    @Test
    public void newThreadThatPrintsNumbers() throws Exception {
        assertEquals("12345678910",
                Lesson1.exercise5());
    }

}