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
    public void wordsConvertedToLowerCase() throws Exception {
        assertEquals(lesson.exercise1(),
                "[the, quick, brown, fox, jumped, over, the, lazy, dog]");
    }

    @Test
    public void loverCaseWordsWithOddLength() throws Exception {
        assertEquals(lesson.exercise2(),
                "[the, quick, brown, fox, the, dog]");
    }

    @Test
    public void secondThirdAndForthStrings() throws Exception {
        assertEquals(lesson.exercise3(),
                "quick-brown-fox");
    }

    @Test
    public void numberOfLinesInTheFile() throws Exception {
        assertEquals(lesson.exercise4(),
                14);
    }

    @Test
    public void listOfWordsWithNoDuplicates() throws Exception {
        assertEquals(lesson.exercise5(),
                "[From, fairest, creatures, we, desire, increase, That, thereby, beauty's, rose, might, never, die, But, as, the, riper, should, by, time, decease, His, tender, heir, bear, his, memory, thou, contracted, to, thine, own, bright, eyes, Feed'st, thy, light's, flame, with, self, substantial, fuel, Making, a, famine, where, abundance, lies, Thy, foe, sweet, too, cruel, Thou, that, art, now, world's, fresh, ornament, And, only, herald, gaudy, spring, Within, bud, buriest, content, churl, mak'st, waste, in, niggarding, Pity, world, or, else, this, glutton, be, To, eat, due, grave, and, thee]");
    }

    @Test
    public void sortedListOfWordsWithNoDuplicates() throws Exception {
        assertEquals(lesson.exercise6(),
                "[a, abundance, and, and, art, as, be, bear, beauty's, bright, bud, buriest, but, by, churl, content, contracted, creatures, cruel, decease, desire, die, due, eat, else, eyes, fairest, famine, feed'st, flame, foe, fresh, from, fuel, gaudy, glutton, grave, heir, herald, his, his, in, increase, lies, light's, mak'st, making, memory, might, never, niggarding, now, only, or, ornament, own, pity, riper, rose, self, should, spring, substantial, sweet, tender, that, that, the, thee, thereby, thine, this, thou, thou, thy, thy, time, to, to, too, waste, we, where, with, within, world, world's]");
    }

    @Test
    public void sortedByLengthListOfWordsWithNoDuplicates() throws Exception {
        assertEquals(lesson.exercise7(),
                "[a, we, as, by, to, in, or, be, to, die, but, the, his, his, own, thy, thy, foe, too, art, now, and, bud, eat, due, and, from, that, rose, time, heir, bear, thou, eyes, with, self, fuel, lies, thou, that, only, pity, else, this, thee, might, never, riper, thine, flame, where, sweet, cruel, fresh, gaudy, churl, waste, world, grave, desire, should, tender, memory, bright, making, famine, herald, spring, within, mak'st, fairest, thereby, decease, feed'st, light's, world's, buriest, content, glutton, increase, beauty's, ornament, creatures, abundance, contracted, niggarding, substantial]");
    }

}