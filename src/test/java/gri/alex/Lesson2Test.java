package gri.alex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 12.12.16.
 */
public class Lesson2Test {

    private Lesson2 lesson;

    @Before
    public void setUp() throws Exception {
        lesson = new Lesson2();
    }

    @Test
    public void exercise1() throws Exception {
        assertEquals(lesson.exercise1(),
                "[the, quick, brown, fox, jumped, over, the, lazy, dog]");
    }

    @Test
    public void exercise2() throws Exception {
        assertEquals(lesson.exercise2(),
                "[the, quick, brown, fox, the, dog]");
    }

    @Test
    public void exercise3() throws Exception {
        assertEquals(lesson.exercise3(),
                "quick-brown-fox");
    }

    @Test
    public void exercise4() throws Exception {
        /*assertEquals(lesson.exercise4(),
                0);*/
    }

    @Test
    public void exercise5() throws Exception {

    }

    @Test
    public void exercise6() throws Exception {

    }

    @Test
    public void exercise7() throws Exception {

    }

}