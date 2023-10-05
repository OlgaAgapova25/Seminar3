package HW3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    void evenOddNumberTest(){
        int x = 4;
        boolean result = true;
        assertEquals (result, Task1.evenOddNumber(x), "Method evenOddNumber is incorrect");
        int x1 = -5;
        boolean result1 = false;
        assertEquals (result1, Task1.evenOddNumber(x1), "Method evenOddNumber is incorrect");

    }
}
