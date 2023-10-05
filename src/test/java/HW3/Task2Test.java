package HW3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    void numberInIntervalTest(){
        int nTrue = 50;
        assertTrue(Task2.numberInInterval(nTrue),"Method numberInInterval is incorrect: parameter = 50, expected answer is True, but it returns false");
        int nFalse = -200;
        assertFalse(Task2.numberInInterval(nFalse),"Method numberInInterval is incorrect: parameter = -200, expected answer is False, but it returns True");
    }
}