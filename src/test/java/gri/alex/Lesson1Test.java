package gri.alex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 2/12/16.
 */
public class Lesson1Test {

    @Test
    public void exercise1() throws Exception {
        assertEquals("abcdef",
                Lesson1.exercise1());
    }

    @Test
    public void exercise2() throws Exception {
        assertEquals("alpha, bravo, charlie, delta, foxtrot",
                Lesson1.exercise2());
    }

    @Test
    public void exercise3() throws Exception {
        assertEquals("ALPHA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT",
                Lesson1.exercise3());
    }

    @Test
    public void exercise4() throws Exception {

    }

    @Test
    public void exercise5() throws Exception {

    }

}